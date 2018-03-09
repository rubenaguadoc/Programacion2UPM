package t00.e03;

import stdlib.In;
import stdlib.Out;

public class FicheroNumerosOrd {

	// Aqui nos toca crear el metodo: Ordenar Fichero.
	// Pero antes de nada, voy a crear un constructor para poder llamarlo desde 
	// OrdTest.java y el main
	
	// Constructor Vacio
	FicheroNumerosOrd() {
		
		// Realmente este constructor es innecesario, ya que java por defecto añade
		// un constructor vacio si no le damos ninguno
		
	}
	//------------------------------------------------------------------------
	
	/*
	   * ordenar (entrada, salida : String)
	   * EFECTO: Dado un archivo de números enteros <entrada> 
	   *         separados por espacios, genera un archivo <salida>
	   *         con los <n> primeros números de <entrada> ordenados 
	             crecientemente.
	   { 
	     numeros = leer(n, entrada) 
	     <<operacionOrdenacion>>(numeros) 
	     escribir(numeros, salida)
	   }
	   DONDE:
	     <<operacionOrdenacion>> será la operación de ordenación que se quiera 
	     usar de las que están en el archivo Ord.java
	   */ 
	public void ordenar(String entrada, String salida) {
		
		// bueno, no voy a ponerme a intentar hacerlo eficiente, pq me da mucha pereza
		// pero esto es basicamente copiar y pegar cosas de los anteriores ejercicios
		// Primero hay que importar stdlib mediante import StdLib.*; 
		// Sin embargo es mejor importar partes especificas de la libreria y no toda
		// porque podra tener un gran impacto en la memoria
		// De todas maneras yo uso Eclipse y me lo hace solito hehe 
		
		In archivo_entrada = new In(entrada);// Preparamos el archivo de entrada
		Out archivo_salida = new Out(salida); // y el de salida tambien
		
		// ahora vamos a sacar todos los elementos del achivo de entrada
		// y los vamos a poner en un array. 
		// Normalmente, se tendria que encontrar la cantidad de elementos en 
		// el archivo_entrada. seria algo asi:
		/*
		 	int c = 0;
			while(!archivo_entrada.isEmpty()) {
				
				c++; // hehe xd
				archivo_entrada.readInt();
				
			}
		 */
		// Al terminar, c seria la cantidad de enteros que hay
		// Luego volveriamos a hacer otro bucle para almacenarlos y demas
		// pero bueno, la verdad es que si miras un poquito la libreria, 
		// te encuentras con algun que otro secretito :D, como:
		
		int[] array = archivo_entrada.readAllInts(); 
		// Es importante darse cuenta de que aqui estamos asumiendo que la libreria
		// ya esta asegurandose de que el archivo no este vacio y demas
		// Si no fuera asi, tendriamos que implementar nuestros propios checks
		
		Ord ord = new Ord(); // Inicializamos Ord para ordenar el array
		
		ord.ordenarBurbuja(array); // llamamos a un algoritmo de ordenacion
		// todos son igual de malos xD
		// finalmente:
		
		// Esto es un foreach		
		for(int a : array) {
			
			archivo_salida.print(" " + a);
			
		}
		// Es un tipo de bucle basado en el for, pero basicamente te ahorras 
		// las i y demas
		// el bucle for equivalente a este foreach seria:
		/*
		 for(int i = 0; i < array.length; ++i) {
		 
		 	int a = array[i];
		 	archivo_salida.print(" " + a);
		 
		 }
		 */
		
		
		
		
		
	}
	//------------------------------------------------------------------------
	
	
}
