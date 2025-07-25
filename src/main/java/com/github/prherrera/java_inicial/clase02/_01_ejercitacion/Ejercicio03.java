package com.github.prherrera.java_inicial.clase02._01_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que lee por teclado un numero entero positivo y calcula la suma de sus cifras.
 * 
 * Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus cifras es: 10".
 * 
 * @author prherrera
 *
 */

public class Ejercicio03 {
	public static void main(String[] args) {
		
		int num;
		boolean condicion;
		int sumaCifras = 0;
		
		do {
			num = Consola.leerEntero("Ingrese un numero entero positivo:");
			
			condicion = num < 0;
			
			if (condicion) {
				System.out.println("Error. El número debe ser entero positivo, no negativo.");
			}
		} while (condicion);
		
		String numeroComoCadena = String.valueOf(num);
        for (int i = 0; i < numeroComoCadena.length(); i++) {
            char digitoChar = numeroComoCadena.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            sumaCifras += digito;
        }
        
        System.out.println("La suma de sus cifras es: "  + sumaCifras);
		
		
	}
}