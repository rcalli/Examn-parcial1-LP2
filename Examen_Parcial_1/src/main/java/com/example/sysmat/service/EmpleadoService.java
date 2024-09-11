package com.example.sysmat.service;

import java.util.List;
import java.util.Optional;

import com.example.sysmat.entity.Empleado;



public interface EmpleadoService {
	Empleado create(Empleado a);
	Empleado update(Empleado a);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();

}
