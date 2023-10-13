package com.care.root.member.service;

import com.care.root.member.dto.MemberDTO;
public interface MemberService {
    String getMessage(String Msg,String Url);
    String join(MemberDTO dto);
    void emailSend(String Email,String title,String body);
    void testSend(String testEmail);
}
