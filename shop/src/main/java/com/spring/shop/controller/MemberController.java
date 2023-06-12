package com.spring.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//회원가입 페이지 이동
	@RequestMapping(value = "member/join", method = RequestMethod.GET)
	public String joinGET() {
		
		logger.info("회원가입 페이지 진입");
		return "member/join";	
	}
	
	//로그인 페이지 이동
	@RequestMapping("member/login")
	public String loginGET() {
		
		logger.info("로그인 페이지 진입");
		System.out.println("로그인페이지");
		return "member/login";
	}
	
}