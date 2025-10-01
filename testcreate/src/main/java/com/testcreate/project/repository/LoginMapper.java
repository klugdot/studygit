package com.testcreate.project.repository;

import java.util.List;
import java.util.Map;

public interface LoginMapper {
	// 메소드명이 LoginMapper.xml 의 id와 일치해야 연결됨
	// <select id="loginList" 
	List<Map<String, Object>> loginList();
}
