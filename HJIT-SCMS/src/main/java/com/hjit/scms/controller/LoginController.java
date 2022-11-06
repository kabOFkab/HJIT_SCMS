package com.hjit.scms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hjit.scms.service.LoginService;
import com.hjit.scms.vo.LoginMember;
import com.hjit.scms.vo.Member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class LoginController {
	@Autowired
    private LoginService loginService;
    
    @RequestMapping("login")
	public String login(@ModelAttribute LoginMember form, BindingResult bindingResult, HttpServletRequest request, HttpServletResponse response){

        if (bindingResult.hasErrors()){
            return "login/loginForm";
        }

        Member loginMember = loginService.login(form.getUserId1(), form.getUserPw1(), form.getUserNm2(), form.getUserNm3());
        log.info("login?{}", loginMember);
        
        HttpSession session = request.getSession();

        if (loginMember == null){
            bindingResult.reject("loginFail", "아이디 또는 비번이 잘못되었습니다.");
            return "login/loginForm";
        }

        // 로그인 성공 처리
        // 세션을 생성하고, 회원 데이터를 보관
        session.setAttribute("loginUser", loginMember);
        
        return "redirect:/";
	}
    
    @RequestMapping("login/loginForm")
	public String loginForm(HttpServletRequest request){
    	return "login/loginForm";
	}
    
    @RequestMapping("logout")
    public String logout(HttpServletRequest request) {
    	HttpSession session = request.getSession();
    	session.removeAttribute("loginUser");
      
    	return "redirect:login/loginForm";
    }
}
