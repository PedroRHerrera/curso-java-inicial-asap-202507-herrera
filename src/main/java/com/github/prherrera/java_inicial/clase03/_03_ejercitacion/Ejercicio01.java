package com.github.prherrera.java_inicial.clase03._03_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee la altura de N personas y calcula:
 * 
 * 1. La altura media.
 * 2. Cuantas personas tienen una altura superior a la media.
 * 3. Cuantas tienen una altura inferior a la media.
 * 
 * El valor de N se pide por teclado y debe ser entero positivo.
 * 
 * @author prherrera
 *
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		
		int N;
		boolean condicion;
		
		do {
			
			N = Consola.leerEntero("Especifique la cantidad de alturas de personas que ingresará en este programa:");
			
			condicion = N <= 0;
			
			if (condicion) {
				System.out.println("Error. Debe ingresar un número entero positivo.");
			}
			
		} while (condicion);
		
		double[] alturas = new double[N];
		double altura = 0;
		boolean alturaInvalida;
		double sumaAlturas = 0;
		
		for (int i = 0; i < N; i++) {
			
			do {
				altura = Consola.leerDouble("Ingrese la altura " + (i+1) + ":");
				
				alturaInvalida = altura <= 0;
				
				if (alturaInvalida) {
					System.out.println("Error. La altura no puede ser cero o un número negativo.");
				}
			} while (alturaInvalida);
			
			alturas[i] = altura;
			sumaAlturas += altura;
		}
		
		double media = sumaAlturas / alturas.length;
		int contInferiores = 0;
		int contSuperiores = 0;
		
		for (int i = 0; i < alturas.length; i++) {
			
			if (alturas[i] < media) {
				contInferiores++;
			} else {
				contSuperiores++;
			}
			
		}

		System.out.println("La media es: " + media);
		System.out.println("Cantidad de alturas inferiores a la media: " + contInferiores);
		System.out.println("Cantidad de alturas superiores a la media: " + contSuperiores);
		
	}

	
}