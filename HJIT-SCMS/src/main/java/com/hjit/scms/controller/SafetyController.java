package com.hjit.scms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SafetyController {

	@RequestMapping("/") 
    public String hello(Model model) {
	    model.addAttribute("hello", "메인화면입니다."); 
	    
	    return "main"; 
    } 
	
}
