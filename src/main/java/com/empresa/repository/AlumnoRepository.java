package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Alumno;

/*Padre le dio a herencia*/
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

	 
	
	
	
	
}
