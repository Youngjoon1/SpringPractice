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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MemberController {
    @Autowired
    MemberService ms;
    @GetMapping("member/loginForm")
    public String loginForm() {
        return "member/loginForm";
    }
    @PostMapping("member/login")
    public void login(@RequestParam String id,@RequestParam String pwd,HttpServletResponse res) throws IOException {
        String msg = ms.login(id,pwd);
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print(msg);
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
    public String emailCK(@RequestParam String email,Model model) {
        model.addAttribute("userMail",email);
        return "member/emailCK";
    }

    @GetMapping("member/userLogin")
    public String userLogin(@RequestParam String id, HttpSession session) {
        session.setAttribute("user",id);
        return "redirect:/";
    }

}
