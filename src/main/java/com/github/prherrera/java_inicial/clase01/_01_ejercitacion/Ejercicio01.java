package com.github.prherrera.java_inicial.clase01._01_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o
 * de 3.
 * 
 * 
 * @author prherrera
 *
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		
		int numero = Consola.leerEntero("Ingrese un numero entero:");
		
		if (numero % 2 == 0 && numero % 3 == 0) {
			System.out.println("Es multiplo de 2 y de 3");
		} else if (numero % 2 == 0) {
			System.out.println("Es multiplo de 2");
		} else if (numero % 3 == 0) {
			System.out.println("Es multiplo de 3");
		} else {
			System.out.println("No es multiplo de 2 ni de 3");
		}
	}
}