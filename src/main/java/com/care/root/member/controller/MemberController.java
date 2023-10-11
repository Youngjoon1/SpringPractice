package com.care.root.member.controller;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
@RequestMapping("member")
public class MemberController {
    @Autowired
    MemberServiceImpl ms;

    @GetMapping("login")
    public String login() {
        return "member/login";
    }

    @GetMapping("joinForm")
    public String joinForm() {
        return "member/joinForm";
    }

    @PostMapping("join")
    public void join(MemberDTO dto, HttpServletResponse res) throws Exception {
        String msg = ms.join(dto);
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print(msg);

    }
}
