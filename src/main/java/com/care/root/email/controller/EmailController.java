package com.care.root.email.controller;

import com.care.root.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Random;

@RestController
public class EmailController {
    @Autowired
    EmailService es;
    @GetMapping("member/sendMail")
    public void sendMail(@RequestParam String userMail, HttpSession CKcode ) {
        String body="<h3>TESTMALL이메일 인증 서비스 입니다</h3><p>회원의 인증 번호 : ";
        String code = "";
        Random ran = new Random();
        for(int i=0; i<6; i++) {
            code += ran.nextInt(10);
        }
        CKcode.setAttribute("code",code);
        body += code+"</p>";
        String title="TEST MALL 가입 인증 메일입니다.";
        es.send(userMail,title,body);

    }
}
