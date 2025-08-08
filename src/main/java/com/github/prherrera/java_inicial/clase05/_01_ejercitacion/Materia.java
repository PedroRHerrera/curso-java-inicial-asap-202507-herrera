package com.github.prherrera.java_inicial.clase05._01_ejercitacion;

public class Materia {

	private String nombre;
	private String cuatrimestre;
	private EstadoMateria estado;
	
	public Materia(String nombre, String cuatrimestre, EstadoMateria estado) {
		this.nombre = nombre;
		this.cuatrimestre = cuatrimestre;
		this.estado = estado;
	}
	
	/*------------------------------------------------------------------------------*/
	
	public boolean estaAprobada() {
		return this.estado == EstadoMateria.APROBADA;
	}
	
}
