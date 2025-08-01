package com.github.prherrera.java_inicial.clase04._04_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * 
 * Programa que pide el ingreso de un numero e indica si es un numero primo o no.
 * 
 * @author prherrera
 *
 */

public class Ejercicio01 {
	public static void main(String[] args) {
		
		 int numero = ObtenerNumero();
		 
		 boolean esPrimo = esPrimo(numero);
		 
		 mostrarMensaje(esPrimo);
		
	}
	
	public static int ObtenerNumero() {
		int numero;
		boolean valido;
		
		do {
			
			numero = Consola.leerEntero("Ingrese un número para saber si es primo:");
			valido = numero <= 0;
			
			if (valido) {
				System.out.println("Error. Ingrese un número entero positivo.");
			}
			
		} while (valido);
		
		return numero;
	}

	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		int i = 2;
		
		if (numero == 1) {
			esPrimo = false;
		}
		
		while (esPrimo && numero != i) {
			esPrimo = (numero % i++) != 0;
		}
		
		return esPrimo;
	}
	
	public static void mostrarMensaje(boolean esPrimo) {
		
		String mensaje = esPrimo ? "Es Primo." : "No es Primo.";
		
		System.out.println(mensaje);
	}
	
}