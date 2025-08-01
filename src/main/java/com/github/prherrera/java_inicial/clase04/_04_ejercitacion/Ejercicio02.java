package com.github.prherrera.java_inicial.clase04._04_ejercitacion;

/**
 * 
 * Programa que genera un array de 8 enteros aleatorios entre 1 y 10.
 * 
 * Lo ordena utilizando el algoritmo de burbuja y lo muestra.
 * 
 * @author prherrera
 *
 */

public class Ejercicio02 {
	public static void main(String[] args) {
		
		final int LIMITE = 8;
		int[] array = generarArray(LIMITE);
		mostrarArray(array);
		//ordenarArray(array);
		ordenarArrayConMetodoBurbuja(array);
		mostrarArray(array);
		
	}
	
	public static int[] generarArray(int limite) {
		int[] array = new int[limite];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 1;
		}
		
		return array;
	}
	
	public static void mostrarArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "; ");
		}
		
		System.out.println();
	}
	
	// Método burbuja original. Ordenación por intercambio.
	public static int[] ordenarArrayConMetodoBurbuja(int[] array) {
		int tamanio = array.length;
		int aux;
		
		for (int i = 0; i < tamanio - 1; i++) {
			for (int j = 0; j < tamanio - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}
	
	// Mi propio algoritmo burbuja (no tan eficiente)
	public static int[] ordenarArray(int[] array) {
		
		boolean desordenado = true;
		int contCambiosActual = 0;
		int contCambiosAnterior = 0;
		int a, b, i2;
		
		while(desordenado) {
			for (int i = 0; i < array.length - 1; i++) {
				
				i2 = i + 1;
				
				a = array[i];
				b = array[i2];
				
				if (a > b) {
					array[i] = b;
					array[i2] = a;
					contCambiosActual++;
				}
			}
			
			i2 = 0;
			
			desordenado = !(contCambiosActual == 0);
			
			if (contCambiosAnterior == contCambiosActual) {
				desordenado = false;
			}
			
			contCambiosAnterior = contCambiosActual;
			
		}
		
		return array;
	}

	
}