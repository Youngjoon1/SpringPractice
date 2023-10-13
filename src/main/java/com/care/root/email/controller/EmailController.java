package com.care.root.email.controller;

import com.care.root.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmailController {
    @Autowired
    EmailService es;
    public void sendMail(String userMail) {
        String body="";
        String title="TEST MALL 가입 인증 메일입니다.";

        es.send(userMail,title,body);
    }
}
