package com.care.root.member.service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl implements MemberService{
    @Autowired MemberMapper mapper;
    BCryptPasswordEncoder passwordEncoder;

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
            url = "/root/member/loginForm";
        }else {
            msg = "가입실패";
            url = "/root/";
        }
        return getMessage(msg,url);
    }
    public int idCK(String id) {
        int result = 0;
        try {
            if(mapper.idCK(id)!=null) {
               result = 1;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public int emailCheck(String email) {
        int result = 0;
        try {
            if(mapper.joinEmail(email)!=null) {
                result = 1;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public String login(String id,String pwd) {
        MemberDTO dto = mapper.getUser(id);
        String msg = "",url = "";
        try {
            if(mapper.getUser(id) != null) {
                if(passwordEncoder.matches(pwd,dto.getPwd())){
                    msg="환영합니다";
                    url="/root/member/userLogin/?id="+id;
                }else {
                    msg="비밀번호가 틀렸습니다";
                    url = "/root/member/loginForm";
                }
            }else {
                msg = "존재하지 않는 아이디입니다.";
                url = "/root/member/loginForm";
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return getMessage(msg,url);
    }
}
