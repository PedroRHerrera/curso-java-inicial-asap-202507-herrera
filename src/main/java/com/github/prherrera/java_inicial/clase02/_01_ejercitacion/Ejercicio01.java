package com.github.prherrera.java_inicial.clase02._01_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee numero entero N por teclado e indica los N primeros numeros de la serie de Fibonacci.
 * 
 * Serie de Fibonacci: 
 * El primer termino de la serie es el numero 1. El segundo tambien es el numero 1.
 * Los siguientes terminos se obtienen de la suma de los dos anteriores.
 * Ejemplo: 1, 1, 2, 3, 5, 8, 13...
 * 
 * @author prherrera
 *
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		
		int N;
		boolean condicion;
		
		do {
			
			N = Consola.leerEntero("Ingrese un numero entero positivo:");
			
			condicion = N < 0;
			
			if (condicion) {
				System.out.println("Error. Ha ingresado numero negativo.");
			}
			
		} while (condicion);
		
		
		int n1 = 0; 
		int n2 = 1;
		int n3;
		
		for (int i = 0; i < N; i++) {
			
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			
			System.out.println(n1 + ", ");
			
		}
		
		
	}
}