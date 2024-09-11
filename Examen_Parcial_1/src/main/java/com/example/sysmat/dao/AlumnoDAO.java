package com.example.sysmat.dao;

import java.util.List;
import java.util.Optional;

import com.example.sysmat.entity.Alumno;



public interface AlumnoDAO {
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();

}
