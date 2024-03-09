package com.qsp.spring_student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.spring_student.dao.StudentDao;
import com.qsp.spring_student.dto.Studentdto;


@RestController
public class Controller 
{
	@Autowired
	private StudentDao dao;
	

	@PostMapping("/saveStudent")
	public Studentdto saveStudent(@RequestBody Studentdto student) 
	{
		return dao.saveStudent(student);
	}

	@GetMapping("/findStudById")
	public Studentdto findById(@RequestParam int id) 
	{
		return dao.findStudentById(id);
	}


	@DeleteMapping("/deleteStud")
	public Studentdto deleteStudent(@RequestParam int id) 
	{
		return dao.deleteStudent(id);
	}

	@PutMapping("/updateAll")
	public Studentdto updateStudent(@RequestParam int id, @RequestBody Studentdto student) 
	{
		return dao.updateStudent(id, student);
	}
	
	@GetMapping("/findAllStudents")
	public List<Studentdto> findAll() 
	{
		return dao.findAllStudent();
	}

	

}
