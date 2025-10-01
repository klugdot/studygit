package com.testcreate.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testcreate.project.repository.LoginMapper;

@Service
public class LoginServiceClass implements LoginServiceInter{
	// repository 계층과 연결
	@Autowired
	public LoginMapper mapper;
	
	// LoginServiceInter를 상속받았으므로, 오버라이드 필요
	// repository 계층의 loginList 메소드(생성자) 호출
	@Override
	public List<Map<String, Object>> loginList() {
		return mapper.loginList();
	}

	
}
