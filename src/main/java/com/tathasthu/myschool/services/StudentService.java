package com.tathasthu.myschool.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tathasthu.myschool.model.Student;
import com.tathasthu.myschool.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	
	public Page<Student> getAllStudent(int page)
	{
		
	Pageable  pageable=	PageRequest.of(page-1, 3);
	 return	 studentRepository.findAll(pageable) ;
	 
	}
	
	
	public void save(Student student)
	{
		studentRepository.save(student);
	}
	
	public Optional<Student> findById(int id)
	{
		return studentRepository.findById(id);
	}
	
	public void delete(int id)
	{
		studentRepository.deleteById(id);
	}
}
