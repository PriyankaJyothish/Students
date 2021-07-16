package com.example.student.dao;


import com.example.student.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	final Logger logger = LogManager.getLogger(StudentDao.class);
	private static List<Student> students= new ArrayList<>();
	
	
	
	static {
		
		students.add(new Student("123451","priya","24-JAN-91","java"));

 students.add(new Student("123452","appu","29-APR-92","android"));
 students.add(new Student("123453","davis","01-DEC-90","salesforce"));
students.add(new Student("123454","naveen","15-NOV-89","gcp"));
students.add(new Student("123455","shalu","19-SEP-91","angular"));
 students.add(new Student("123456","maria","30-MAR-89","dba"));

	}

	public List<Student> findAll()
	{
		return students;
	}
	
	
	  public Student save(Student student) {
	  
	  students.add(student); 
	  return student;
	  
	  }
	 
	
	public Student fineOne(String id)
	{
		for(Student student : students)
		{
			if (student.getSid().equalsIgnoreCase(id))
				return student;
		}
		
		return null;
	}
}
