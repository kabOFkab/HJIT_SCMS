package com.hjit.scms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SafetyController {

	@RequestMapping("hello") 
    public String hello(Model model) {
	    model.addAttribute("hello", "안녕. 타임리프 테스트."); 
	    
	    return "hello"; 
    } 
	
}
