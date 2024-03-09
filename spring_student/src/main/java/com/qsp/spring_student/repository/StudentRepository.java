package com.qsp.spring_student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.qsp.spring_student.dto.Studentdto;

public interface StudentRepository extends JpaRepository<Studentdto, Integer> {

}
