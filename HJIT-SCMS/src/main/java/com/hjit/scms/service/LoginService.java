package com.hjit.scms.service;

import org.springframework.stereotype.Service;
import com.hjit.scms.vo.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginService {

	public Member login(String id1, String pw1, String id2, String pw2, String id3, String pw3) {
		Member member = new Member();
		
		member.setUserId1("111111");
		member.setUserId2("222222");
		member.setUserId3("333333");
		member.setUserNm1("김갑중");
		member.setUserNm2("김병성");
		member.setUserNm3("박용");
		
		log.info("member?{}", member);
		
		return member;
	}

}
