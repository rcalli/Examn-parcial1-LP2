package com.example.sysmat.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysmat.dao.AlumnoDAO;
import com.example.sysmat.entity.Alumno;
import com.example.sysmat.service.AlumnoService;




@Service
public class AlumnoServiceImpl implements AlumnoService{
	

	@Autowired
	private AlumnoDAO dao;

	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
