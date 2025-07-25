package com.github.prherrera.java_inicial.clase01._01_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Solicitar el ingreso de una calificacion numerica entre 1 y 10.
 * Mostrar por pantalla su equivalente calificacion alfabetica.
 * 0 <= nota < 5 Insuficiente
 * 5 <= nota < 6 Suficiente
 * 6 <= nota < 7 Bien
 * 7 <= nota < 9 Notable
 * 9 <= nota <= 10 Sobresaliente
 * 
 * Si el numero ingresado no se encuentra entre 0 y 10, debe indicarse que no es valido y finalizar el programa.
 * 
 * @author prherrera
 *
 */

public class Ejercicio03 {
	public static void main(String[] args) {
		
		int nota = Consola.leerEntero("Ingrese su calificacion numerica (entre 0 y 10): ");
		String mensaje;
		
		if (nota >= 0 && nota <= 10) {
			// Insuficeinte
			if (nota >= 0 && nota < 5) {
				mensaje = "Su nota es Insuficeinte.";
			// Suficiente
			} else if (nota >= 5 && nota < 6) {
				mensaje = "Su nota es Suficiente";
			// Bien	
			} else if (nota >= 6 && nota < 7) {
				mensaje = "Su nota es Bien";
			// Notable
			} else if (nota >= 7 && nota < 9) {
				mensaje = "Su nota es Notable";	
			// Sobresaliente
			} else {
				mensaje = "Su nota es Sobresaliente";
			}
			
			System.out.println(mensaje);
		} else {
			System.out.println("El número que ha ingresado como nota no se encuentra entre 0 y 10.");
			System.out.println("Programa Finalizado.");
		}
		
		
	}
}