package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class StudentManamentApplication {
	
	@GetMapping("/helloword")
	public String HelloWord()
	{
		return "Hi Ram How are you?";
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManamentApplication.class, args);
	}

}
