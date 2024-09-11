package com.example.sysmat.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysmat.dao.GradoDAO;
import com.example.sysmat.entity.Grado;
import com.example.sysmat.service.GradoService;




@Service
public class GradoServiceImpl implements GradoService{
	

	@Autowired
	private GradoDAO dao;

	@Override
	public Grado create(Grado a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Grado update(Grado a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
