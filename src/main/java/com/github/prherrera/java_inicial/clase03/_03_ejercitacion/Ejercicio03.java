package com.github.prherrera.java_inicial.clase03._03_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que solicita el ingreso de 5 numeros enteros por teclado y los almacena en un array:
 * 
 * Debe indicar por pantalla si dicho array es capicua.
 * 
 * @author prherrera
 *
 */

public class Ejercicio03 {
	public static void main(String[] args) {
		
		final int LIMITE = 5;
		int[] numeros = new int[LIMITE];
		
		System.out.println("Ingrese " + LIMITE + " números enteros:");
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Consola.leerEntero(i+1 + "° número:");
		}
		
		int[] auxiliar = new int[LIMITE];
		int iAux = 0;
		
		for (int i = numeros.length - 1 ; i >= 0 ; i--) {
			auxiliar[iAux] = numeros[i];
			iAux++;
		}
		
		boolean esCapicua = true;
		int i = 0;
		
		while (esCapicua && i < LIMITE) {
			esCapicua = numeros[i] == auxiliar[i];
			i++;
		}
		
		String mensaje = esCapicua ? "El array es Capicua." : "El array no es Capicua.";
		System.out.println(mensaje);
		
	}

	
}