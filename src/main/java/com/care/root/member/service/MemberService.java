package com.care.root.member.service;

import com.care.root.member.dto.MemberDTO;
import com.care.root.mybatis.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired  MemberMapper mapper;


    public String getMessage(String Msg,String Url) {
        String Message = "";
        return Message;
    }


    public String join(MemberDTO dto) {
        int result = 0;
        String msg = "";
        String url = "";
        return getMessage(msg,url);
    }
}
