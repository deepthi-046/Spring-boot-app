package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Student;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
	List<Student> findByUname(String uname);
	//List<Student> findByIdBetween(Integer start,Integer stop);


}
