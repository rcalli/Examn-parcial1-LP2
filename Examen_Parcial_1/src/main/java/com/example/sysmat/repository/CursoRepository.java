package com.example.sysmat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysmat.entity.Alumno;
import com.example.sysmat.entity.Curso;


@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
