package com.example.sysmat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysmat.entity.Alumno;
import com.example.sysmat.entity.Matricula;


@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

}
