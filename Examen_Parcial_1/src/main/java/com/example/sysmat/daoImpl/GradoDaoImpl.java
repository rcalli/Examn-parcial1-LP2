package com.example.sysmat.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.sysmat.dao.GradoDAO;
import com.example.sysmat.entity.Grado;

import com.example.sysmat.repository.GradoRepository;
@Component
public class GradoDaoImpl implements GradoDAO {
	
	@Autowired
	private GradoRepository repository;
	

	@Override
	public Grado create(Grado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Grado update(Grado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
