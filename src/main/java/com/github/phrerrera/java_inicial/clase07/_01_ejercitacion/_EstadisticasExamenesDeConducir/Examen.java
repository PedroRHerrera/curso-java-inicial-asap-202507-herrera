package com.github.phrerrera.java_inicial.clase07._01_ejercitacion._EstadisticasExamenesDeConducir;

public abstract class Examen implements Evaluable {

	private String fecha;
	private Persona persona;
	
	public Examen(String fecha, Persona persona) {
		this.fecha = fecha;
		this.persona = persona;
	}
	
	public abstract boolean evaluar();
	
}
