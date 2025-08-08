package com.github.prherrera.java_inicial.clase05._01_ejercitacion;

public class AlumnoSimplificado {

	private String nombre;
	private String mail;
	private int cantAprobadas;
	
	public AlumnoSimplificado(String nombre, String mail, int cantAprobadas) {
		this.nombre = nombre;
		this.mail = mail;
		this.cantAprobadas = cantAprobadas;
	}
	
	/*------------------------------------------------------------------------------*/
	
	public void mostrar() {
		System.out.println(this.nombre + " " + this.mail + " - " + this.cantAprobadas + " materias aprobadas.");
	}
}
