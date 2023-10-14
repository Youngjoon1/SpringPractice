package com.care.root.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.internet.MimeMessage;



@Service
public class EmailService {
    @Autowired
    JavaMailSender mailSender;
    public void send(String email, String title,String body) {
        MimeMessage msg = mailSender.createMimeMessage();

        try {
            MimeMessageHelper mailHelper = new MimeMessageHelper(msg,true,"utf-8");
            mailHelper.setTo(email);
            mailHelper.setSubject(title);
            mailHelper.setText(body);
            
        }catch (Exception e) {
            e.printStackTrace();
        }

        mailSender.send(msg);

    }
}
