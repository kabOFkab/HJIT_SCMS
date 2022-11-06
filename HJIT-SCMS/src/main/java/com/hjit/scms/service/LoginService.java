package com.hjit.scms.service;

import org.springframework.stereotype.Service;
import com.hjit.scms.vo.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginService {

	public Member login(String id1, String pw1, String nm2, String nm3) {
		Member member = new Member();
		
		// 로그인 api 실행
		member.setUserId1(id1);
		member.setUserNm1("김갑중");
		member.setUserNm2(nm2);
		member.setUserNm3(nm3);
		
		log.info("member?{}", member);
		
		return member;
	}

}
