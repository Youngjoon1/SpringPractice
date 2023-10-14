package com.care.root.email.controller;

import com.care.root.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class EmailController {
    @Autowired
    EmailService es;
    @GetMapping("member/sendMail")
    public void sendMail(@RequestParam String userMail) {
        String body="";
        System.out.println(userMail);
        Random ran = new Random();
        for(int i=0; i<6; i++) {
            body += ran.nextInt(10)+1;
        }
        String title="TEST MALL 가입 인증 메일입니다.";
        es.send(userMail,title,body);
    }
}
