package com.example.student.controller;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.student.dao.StudentDao;
import com.example.student.model.Student;

@RestController
public class StudentController {
	
	final Logger logger = LogManager.getLogger(StudentController.class);
	@Autowired
	private StudentDao dao;
	
	@RequestMapping(
			  value = "/student", 
			  produces = "application/json")
	public List<Student> retriveStudentsist()
	{
		return dao.findAll();
	}
	@GetMapping("/student/{id}")	
   	public Student retrieveStudent(@PathVariable String id)
    {
	return dao.fineOne(id);
	}
}
