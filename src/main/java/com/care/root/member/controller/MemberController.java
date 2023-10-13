package com.care.root.member.controller;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
public class MemberController {
    @Autowired MemberService ms;

    @GetMapping("member/login")
    public String login() {
        return "member/login";
    }

    @GetMapping("member/joinForm")
    public String joinForm() {
        return "member/joinForm";
    }

    @PostMapping("member/join")
    public void join(MemberDTO dto, HttpServletResponse res) throws Exception {
        String msg = ms.join(dto);
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print(msg);
    }

    @GetMapping("member/emailCK")
    public String emailCK(@RequestParam String email, Model model) {
        String title = "TEST MALL 인증메일입니다";
        String body = "인증코드가 들어갈 자리";
        ms.emailSend(email,title,body);
        model.addAttribute("ckEmail",email);
        return "member/emailCK";
    }

    @GetMapping("member/emailTestForm")
    public String emailTestForm() {
        return "member/emailTestForm";
    }

    @GetMapping("member/send")
    public String send(@RequestParam String testEmail) {
        ms.testSend(testEmail);
        return "redirect:/";
    }
}
