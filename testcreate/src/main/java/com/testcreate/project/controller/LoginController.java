package com.testcreate.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testcreate.project.service.LoginServiceInter;

@Controller
public class LoginController {
	// service 계층과 연결
	@Autowired
	public LoginServiceInter service;
	
	// 요청을 처리할 주소값(url) 지정. 즉, /login 으로 들어온 요청을 처리
	// login 으로 들어온 요청에 맞는 클래스나 메서드를 연결시킴
	// 즉, mapper.xml에 접근하여 select 쿼리 실행할 수 있도록!!
	@RequestMapping("login")
	
	// Object 형태(data자체)로 반환시키도록 함 (자바 객체를 json형식으로 변환) 
	// data를 client(react)로 전송하기 위해서! (react에서 받은 data 화면에 뿌림) 
	@ResponseBody
	
	public List<Map<String, Object>> login() {
		// service 계층의 loginList 메소드(생성자)로 loginList 객체를 만들고, 리턴
		List<Map<String,Object>> loginList = service.loginList();
		// Object: 모든 자료형을 허용하는 자료형 (value는 문자열, 숫자, 날짜 등 어떤 type이 될지 모르기 때문)
		return loginList;
	}
	

	
}
