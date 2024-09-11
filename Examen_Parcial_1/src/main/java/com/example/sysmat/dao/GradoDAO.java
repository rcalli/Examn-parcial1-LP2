package com.example.sysmat.dao;

import java.util.List;
import java.util.Optional;

import com.example.sysmat.entity.Grado;



public interface GradoDAO {
	Grado create(Grado a);
	Grado update(Grado a);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();

}
