package com.care.root.mybatis.member;

import com.care.root.member.dto.MemberDTO;
public interface MemberMapper {
    int join(MemberDTO dto);
    MemberDTO idCK(String id);
    MemberDTO joinEmail(String email);
    MemberDTO getUser(String id);
}
