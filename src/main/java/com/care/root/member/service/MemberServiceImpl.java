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
            msg = "가입을 축하드립니다.";
            url = "/root/member/login";
        }else {
            msg = "가입 실패";
            url = "/root/";
        }
        return getMessage(msg,url);
    }

    public void emailSend(String Email,String title,String body) {

        try {
            MimeMessage msg = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(msg,true,"UTF-8");
            helper.setTo(Email);
            helper.setSubject(title);
            helper.setText(body);
            emailSender.send(msg);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void testSend(String testEmail) {
        String tt = "테스트중입니다";
        String bd = "내용테스트";
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,true,"utf-8");
            helper.setTo(testEmail);
            helper.setSubject(tt);
            helper.setText(bd);
            emailSender.send(message);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
