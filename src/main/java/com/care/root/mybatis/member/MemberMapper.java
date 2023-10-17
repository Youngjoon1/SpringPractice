package com.care.root.mybatis.member;

import com.care.root.member.dto.MemberDTO;
import org.springframework.stereotype.Component;
public interface MemberMapper {
    int join(MemberDTO dto);
    MemberDTO idCK(String id);

}
