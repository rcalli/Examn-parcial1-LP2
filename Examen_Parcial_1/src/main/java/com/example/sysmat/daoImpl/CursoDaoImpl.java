package com.example.sysmat.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.sysmat.dao.CursoDAO;
import com.example.sysmat.entity.Curso;

import com.example.sysmat.repository.CursoRepository;
@Component
public class CursoDaoImpl implements CursoDAO {
	@Autowired
	private CursoRepository repository;
	

	@Override
	public Curso create(Curso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Curso update(Curso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
