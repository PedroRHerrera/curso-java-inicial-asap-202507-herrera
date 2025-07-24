package com.github.prherrera.java_inicial.clase01._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Solicitar el ingreso de un anio y comprobar si es un anio bisiesto.
 * 
 * Es bisiesto si: es divisible por 4 y no lo es por 100, o si es divisible por 400.
 * 
 * 
 * @author prherrera
 *
 */

public class Ejercicio04 {
	public static void main(String[] args) {
		
		int anio = Consola.leerEntero("Ingrese un anio para comprobar si es bisiesto: ");
		
		if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
			System.out.println("El anio " + anio + " es Bisiesto.");
		} else {
			System.out.println("El anio " + anio + " no es Bisiesto.");
		}
		
	}
}