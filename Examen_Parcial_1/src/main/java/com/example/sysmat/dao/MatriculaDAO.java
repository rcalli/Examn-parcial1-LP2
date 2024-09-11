package com.example.sysmat.dao;

import java.util.List;
import java.util.Optional;

import com.example.sysmat.entity.Matricula;



public interface MatriculaDAO {
	Matricula create(Matricula a);
	Matricula update(Matricula a);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();

}
