package com.qsp.spring_student.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.spring_student.dto.Studentdto;
import com.qsp.spring_student.repository.StudentRepository;


@Repository
public class StudentDao 
{

	@Autowired
	private StudentRepository repo;
	
	public Studentdto saveStudent(Studentdto student ) {
		return repo.save(student);
	}
	
	public Studentdto findStudentById(int id)
	{
		Optional<Studentdto> student=repo.findById(id);
		if(student.isPresent())
		{
			return student.get();
		}
		return null;

	}
	
	public List<Studentdto> findAllStudent() {
		return repo.findAll();
	}
	
	public Studentdto deleteStudent(int id)
	{
		Optional<Studentdto> optional=repo.findById(id);
		if(optional.isPresent())
		{
			Studentdto student=optional.get();
			 repo.deleteById(id);
			 return student;
		}
		return null;	
	}
	
	public Studentdto updateStudent(int id,Studentdto student)
	{
		Optional<Studentdto> optional=repo.findById(id);
		if(optional.isPresent())
		{
			student.setId(id);
			repo.save(student);
			return student;
		}
		return null;
	}
}
