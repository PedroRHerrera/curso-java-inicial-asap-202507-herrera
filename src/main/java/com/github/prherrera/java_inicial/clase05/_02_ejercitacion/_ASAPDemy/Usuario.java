package com.github.prherrera.java_inicial.clase05._02_ejercitacion._ASAPDemy;

public class Usuario {

	private int id;
	private String nombre;
	private String mail;
	private boolean esBecado;
	
	public Usuario(int id, String nombre, String mail, boolean esBecado) {
		this.id = id;
		this.nombre = nombre;
		this.mail = mail;
		this.esBecado = esBecado;
	}
	
    // ----------------------------------------------------------------------------

	public boolean mismoId(int idUsuario) {
    	return this.id == idUsuario;
    }
	
	public boolean esBecado() {
		return this.esBecado;
	}

	public int getId() {
		return this.id;
	}
	
}
