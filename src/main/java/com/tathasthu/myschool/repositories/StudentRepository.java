package com.tathasthu.myschool.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tathasthu.myschool.model.Student;


@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer>{
	
	
	public Page<Student> findAll(Pageable pageable);

}
