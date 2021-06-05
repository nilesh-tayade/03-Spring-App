package com.tathasthu.myschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tathasthu.myschool.model.Student;
import com.tathasthu.myschool.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService StudentService;
	
	@GetMapping("/student/{page}")
	public String  getStudent(@PathVariable("page") int page,Model m)
	{
	Page<Student> students=	StudentService.getAllStudent(page);
	
	 m.addAttribute("students", students);
		return "student";
	}

	

	@PostMapping("/student/save")
	public String  saveStudent(Student student)
	{
		StudentService.save(student);
		System.out.println("Student saved  To datebase");
		return "redirect:/student";
	}
}
