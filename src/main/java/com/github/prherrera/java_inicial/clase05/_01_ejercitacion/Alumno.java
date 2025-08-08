package com.github.prherrera.java_inicial.clase05._01_ejercitacion;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private String mail;
	private List<Materia> materias;
	
	public Alumno (String nombre, String mail) {
		this.nombre = nombre;
		this.mail = mail;
		this.materias = new ArrayList<>();
	}
	
	/*------------------------------------------------------------------------------*/
	
	public int getCantMateriasAprobadas() {
		
		int cantidad = 0;
		
		for(int i = 0; i < this.materias.size(); i++) {
			
			if (materias.get(i).estaAprobada()) {
				cantidad++;
			}
		}
		
		return cantidad;
	}
	
	/*------------------------------------------------------------------------------*/
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getMail() {
		return this.mail;
	}
	
	/*------------------------------------------------------------------------------*/
	
	public void addMateria(Materia materia) {
		this.materias.add(materia);
	}
	
}
