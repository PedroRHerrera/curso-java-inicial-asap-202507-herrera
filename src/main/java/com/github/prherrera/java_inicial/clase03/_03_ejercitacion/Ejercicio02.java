package com.github.prherrera.java_inicial.clase03._03_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que solicita el ingreso de 6 numeros por teclado y los almacena en un array para mostrar:
 * 
 * 1. El valor maximo.
 * 2. El minimo.
 * 3. Las posiciones que ocupan en el array.
 * 
 * @author prherrera
 *
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		
		final int LIMITE = 6;
		int[] numeros = new int[LIMITE];
		
		System.out.println("Ingrese " + LIMITE + " números enteros:");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Consola.leerEntero(i+1 + "° número:");
		}
		
		int minimo = numeros[0];
		int maximo = numeros[0];
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] < minimo) {
				minimo = numeros[i];
				posMin = i;
			}
			
			if (numeros[i] > maximo) {
				maximo = numeros[i];
				posMax = i;
			}
		}
		
		System.out.println("El número mínimo es: " + minimo + ". Su posición en el array es: " + posMin);
		System.out.println("El número máximo es: " + maximo + ". Su posición en el array es: " + posMax);
	}

	
}