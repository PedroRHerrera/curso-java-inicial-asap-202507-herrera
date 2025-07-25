package com.github.prherrera.java_inicial.clase02._01_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que comprueba si dos numeros son amigos.
 * 
 * Ingresar dos numeros enteros positivos A y B.
 * 
 * A y B son amigos si: la suma de los divisores propios de A es igual a B y viceversa, sin incluir el propio numero.
 * 
 * Ejemplo: 220 y 284.
 * 
 * Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
 * 
 * La suma de los divisores propios de 220 da como resultado 284.
 * 
 * Los divisores propios de 284 son 1, 2, 4, 71 y 142.
 * 
 * La suma de los divisores propios de 284 da como resultado 220.
 * 
 * Otros ejemplos de números amigos son:
 * 1184, 1210	|	5020, 5564	|	10744, 10856	|	17296, 18416
 * 2620, 2924	|	6232, 6368	|	12285, 14595	|
 * 
 * @author prherrera
 *
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		
		int A;
		int B;
		boolean condicion;
		
		do {
			A = Consola.leerEntero("Ingrese un numero entero positivo (A):");
			B = Consola.leerEntero("Ingrese un numero entero positivo (B):");
			
			condicion = A < 0 || B < 0;
			
			if (condicion) {
				System.out.println("Error. Ambos números deben ser enteros positivos, no negativos.");
			}
		} while (condicion);
		
		boolean sonAmigos = false;
		int sumaDivisoresA = 0;
		int sumaDivisoresB = 0;
		
		for (int i = 1; i <= A / 2; i++) {
			if (A % i == 0) {
				sumaDivisoresA += i;
			}
		}
		
		for (int i = 1; i <= B / 2; i++) {
			if (B % i == 0) {
				sumaDivisoresB += i;
			}
		}
		
		sonAmigos = (sumaDivisoresA == B && sumaDivisoresB == A);
		
		String mensaje;
		
		if (sonAmigos) {
			mensaje = "Los números " + A + " y " + B + " ¡Son Amigos! :)";
		} else {
			mensaje = "Los números " + A + " y " + B + " ¡No son Amigos! :(";
		}
		
		System.out.println(mensaje);
		
	}
}