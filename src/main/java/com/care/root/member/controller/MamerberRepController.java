package com.care.root.member.controller;

import com.care.root.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class MamerberRepController {
    @Autowired
    MemberService ms;
    @GetMapping("member/idCK")
    public void idCK(@RequestParam String userId, HttpServletResponse res) throws IOException {
        int result = ms.idCK(userId);

        try {
            res.setContentType("text/plain");
            res.setCharacterEncoding("UTF-8");
            PrintWriter writer = res.getWriter();
            writer.print(result);
            writer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    @GetMapping("member/emailList")
    public void emailList(@RequestParam String email,HttpServletResponse res) {
        int result = ms.emailCheck(email);

        try {
            res.setContentType("text/plain");
            res.setCharacterEncoding("UTF-8");
            PrintWriter writer = res.getWriter();
            writer.print(result);
            writer.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
