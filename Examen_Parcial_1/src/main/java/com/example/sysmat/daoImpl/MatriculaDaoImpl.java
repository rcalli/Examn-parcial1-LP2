package com.example.sysmat.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.sysmat.dao.MatriculaDAO;
import com.example.sysmat.entity.Matricula;

import com.example.sysmat.repository.MatriculaRepository;
@Component
public class MatriculaDaoImpl implements MatriculaDAO {
	
	@Autowired
	private MatriculaRepository repository;
	

	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
