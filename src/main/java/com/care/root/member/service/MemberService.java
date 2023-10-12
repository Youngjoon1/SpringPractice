package com.care.root.member.service;

import com.care.root.member.dto.MemberDTO;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    String getMessage(String Msg,String Url);
    String join(MemberDTO dto);
    void emailCK(String Email);

}
