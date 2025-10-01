package com.testcreate.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.testcreate.project.repository")
public class TestcreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcreateApplication.class, args);
	}

}
