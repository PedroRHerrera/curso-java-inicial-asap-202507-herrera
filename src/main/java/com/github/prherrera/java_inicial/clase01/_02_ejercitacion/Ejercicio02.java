package com.github.prherrera.java_inicial.clase01._02_ejercitacion;

import com.github.sanchezih.util.io.Consola;

/**
 * Solicitar el ingreso de una fecha de nacimeinto (dia/mes/anio).
 * Calcular su numero de la suerte: (dia + mes + anio) + las cifras individuales del resultado.
 * Ejemplo: 12 + 7 + 1980 = 1999 --> 1 + 9 + 9 + 9 = 28
 * 
 * @author prherrera
 *
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		
		System.out.println("Ingrese su fehca de nacimiento:");
		
		int dia = Consola.leerEntero("Dia:");
		int mes = Consola.leerEntero("Mes:");
		int anio = Consola.leerEntero("Anio:");
		
		int suma = dia + mes + anio;
		int numeroSuerte = 0;
		
		String numeroComoCadena = String.valueOf(suma);
        for (int i = 0; i < numeroComoCadena.length(); i++) {
            char digitoChar = numeroComoCadena.charAt(i);
            int digito = Character.getNumericValue(digitoChar);
            numeroSuerte += digito;
        }
        
        System.out.println("Su Numero de la Suerte es: "  + numeroSuerte);
		
		
	}
}