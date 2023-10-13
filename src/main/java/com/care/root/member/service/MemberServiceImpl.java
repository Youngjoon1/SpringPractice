package com.care.root.member.service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import javax.mail.internet.MimeMessage;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired MemberMapper mapper;
    BCryptPasswordEncoder passwordEncoder;
    JavaMailSender emailSender;

    public String getMessage(String Msg,String Url) {
        String Message = "<script>alert('"+Msg+"');";
        Message += "location.href='"+Url+"'</script>";
        return Message;
    }

    public MemberServiceImpl() {
        passwordEncoder = new BCryptPasswordEncoder();
    }

    public String join(MemberDTO dto) {
        dto.setPwd(passwordEncoder.encode(dto.getPwd()));

        int result = mapper.join(dto);
        String msg;
        String url;
        if(result == 1) {
            msg = "가입을축하드립니다";
            url = "/root/member/login";
        }else {
            msg = "가입실패";
            url = "/root/";
        }
        return getMessage(msg,url);
    }



}
