package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.services.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService studentService;

	@GetMapping("/helloworld")
	public String Helloworld() {
		return "Hey Nishant how are you ?";
	}

	// controller to add a student

	@PostMapping("/addstudent")
	Integer createStudent(@RequestBody Student student) {
		Integer id = studentService.saveStudent(student);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable Integer id){
	Optional<Student> student =studentService.getStudent(id);
	return student;
	}
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudent(){
		List<Student> allStudents=studentService.getAllStudent(null);
		return allStudents;
	}
}