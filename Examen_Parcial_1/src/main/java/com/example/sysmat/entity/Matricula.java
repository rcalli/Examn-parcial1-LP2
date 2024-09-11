package com.example.sysmat.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="fecha_mat")
	private Date fecha_mat;
	@Column(name="horas")
	private int horas;
	@Column(name="nivel")
	private String nivel;
	
	@ManyToOne
	@JoinColumn(name="alumno_id", nullable = false)
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name="grado_id", nullable = false)
	private Grado grado;
	
	@ManyToOne
	@JoinColumn(name="empleado_id", nullable = false)
	private Empleado empleado;
	
}
