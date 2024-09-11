package com.example.sysmat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysmat.entity.Alumno;


@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
