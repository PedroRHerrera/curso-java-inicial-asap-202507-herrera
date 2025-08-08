package com.github.prherrera.java_inicial.clase05._01_ejercitacion;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

	private List<Alumno> alumnos;
	
	public Carrera() {
		this.alumnos = new ArrayList<>();
	}
	
	/*------------------------------------------------------------------------------*/
	
	public List<AlumnoSimplificado> getInformeMaxMaterias() {
		
		ArrayList<AlumnoSimplificado> mejoresAlumnos = new ArrayList<>();
		int maximo = 0;
		int actual;
		Alumno alumno;
		
		for(int i = 0; i < this.alumnos.size(); i++) {
			
			alumno = alumnos.get(i);
			actual = alumno.getCantMateriasAprobadas();
			
			if (actual > maximo) {
				
				maximo = actual;
				mejoresAlumnos.clear();
				mejoresAlumnos.add(new AlumnoSimplificado(alumno.getNombre(), alumno.getMail(), actual));
				
			} else if (actual == maximo){
				
				mejoresAlumnos.add(new AlumnoSimplificado(alumno.getNombre(), alumno.getMail(), actual));
			}
		}
		
		return mejoresAlumnos;
	}
	
	/*------------------------------------------------------------------------------*/
	
	public void addAlumno(Alumno a) {
		this.alumnos.add(a);
	}
	
	
}
