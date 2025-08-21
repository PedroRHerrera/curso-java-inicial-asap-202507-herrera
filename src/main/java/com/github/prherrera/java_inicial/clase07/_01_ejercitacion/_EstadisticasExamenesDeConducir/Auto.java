package com.github.prherrera.java_inicial.clase07._01_ejercitacion._EstadisticasExamenesDeConducir;

public class Auto extends Vehiculo {
	
	private int cantPuertas;
	
	public Auto(String patente, String marca, int cilindrada, int cantPuertas) {
		super(patente, marca, cilindrada);
		this.cantPuertas = cantPuertas;
	}
	
}
