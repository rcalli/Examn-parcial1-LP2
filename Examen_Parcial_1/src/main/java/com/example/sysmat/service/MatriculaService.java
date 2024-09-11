package com.example.sysmat.service;

import java.util.List;
import java.util.Optional;

import com.example.sysmat.entity.Matricula;



public interface MatriculaService {
	Matricula create(Matricula a);
	Matricula update(Matricula a);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();

}
