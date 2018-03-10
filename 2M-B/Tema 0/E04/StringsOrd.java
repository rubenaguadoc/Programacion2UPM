package t00.e04;

import java.util.Arrays;

public class StringsOrd {

	// Empty Constructor
	StringsOrd() {
		
		// Creamos un constructor para poder usar OOP
		// Recuerdo que realmente no es necesario poner un constructor vacio
		// Si no hay ningun otro constructor, porque el compilador lo pondra automaticamente
		// Sin embargo esto no pasa siempre ni con todos los compiladores
		
	}
	//----------------------------------------------------------------------
	
	// Funcion auxiliar para permutar Elementos de un Array
	private static void permutar(String[] a, int i, int j) { 
		  
	    String t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	    
	  }
	//----------------------------------------------------------------------
	
	// Funcion auxiliar para comparar Strings recursivamente:
	// True cuando b sea menor (y por tanto deba ir antes)
	// False cuando a sea menor (y por tanto deba ir antes)
	// La razon por la que b dara true y a dara false, es porque a 
	// siempre estara mas a la izquierda que b
	// entonces mover a no tendria sentido (pues ya estaria en orden)
	// asi que buscamos mover a b
	private static boolean comparador(String a, String b, int n) {
		
		// Si no entendeis esta funcion del todo, aqui os dejo estos prints para
		// que podais seguir el proceso desde la consola
		// Esto es un print f, basicamente los % y la letra de detras indican algun tipo
		// y estos se sustituyen por orden con lo que hayas puesto detras
		// buscadlos, son bastante faciles y utiles
		
		System.out.printf("comparador(%s, %s, %d) -> boolean %n{", a, b, n);
		System.out.printf("%n%d >= %d ? %b%n", n, a.length(), n >= a.length());
		if(n >= a.length()) {
			
			System.out.printf("} -> FALSE;%n");
			
			return false; 
			// LLegar a este punto implica una de 2 cosas:
			// a) b es mayor en longitud que a, pero a es substring de b
			// b) a y b son iguales
			// En cualquier caso, ponemos a A delante
			
		}
		System.out.printf("%d >= %d ? %b%n", n, b.length(), n >= b.length());
		if (n >= b.length()) {
			
			System.out.printf("} -> TRUE;%n");
			
			return true;
			// LLegar a este punto implica una cosa:
			// a es mayor en longitud a b, pero b es substring de a
			// a y b no pueden ser iguales porque si ese fuera el caso, 
			// nunca habriamos llegado a este if
			// En cualquier caso, ponemos a B delante
		}
		
		System.out.printf("(%d) => a(%c) ⊕ b(%c) ? %n", n, a.charAt(n), b.charAt(n));
		
		// Si son iguales 2 letras en la misma posicion, 
		if(a.charAt(n) == b.charAt(n)) {
			
			System.out.printf("} -> comparador(%s, %s, %d);%n", a, b, n + 1);
			return comparador(a, b, n + 1); // No sabemos, asi que comparamos las siguientes letras
			
		}
		else if (a.charAt(n) < b.charAt(n)) {
			
			System.out.printf("} -> FALSE;%n");
			return false; // A debe ir antes
			
		} 
		else {
			
			System.out.printf("} -> TRUE;%n%n");
			return true; // B debe ir antes
			
		}
		
		
	}
	//----------------------------------------------------------------------
	
	// Metodo de la burbuja para ordenar un array de Strings
	public static void bubbleSort(String[] lmao) {
		
		// Aqui ordenaremos el array de Strings llamado lmao usando el bubble sort
		
		/*
		 Aqui os explico la logica que voy a seguir:
		 
		 o Primero iteramos por cada elemento dentro del array. (1)
		 	Al ser Strings, no podemos comparar los valores del array. Ejemplo:
		 	Tomemos a = 1, b = 2, c = 3.... hasta la z
		 	Entonces:
		 	- ABCDE = 1 + 2 + 3 + 4 + 5 = 15
		 	- ABDCE = 1 + 2 + 4 + 3 + 5 = 15
		 	Sin embargo, ABCDE deberia ir ordenado primero
		 o Dentro de cada elemento, empezamos a iterar hacia arriba
		 o Una vez hecho esto, usaremos una funcion recursiva para comparar 2 strings
		 o Usaremos esta funcion para comparar Strings
		 */
		
		// Empecemos por iterar: podria usar un foreach; si no sabeis que es
		// lo explico en el e03, FicheroNumerosOrd.java
		// Pero realmente aqui me traeria mas trabajo
		for(int i = 0; i < lmao.length; ++i) {
						
			// Ya hicimos (1)
			// Ahora iteramos hacia arriba
			for(int j = i + 1; j < lmao.length; ++j) {
				
				// ya hicimos (2)
				// Ahora nos toca implementar la funcion comparador para comparar Strings
				// Los ponemos en minusculas para la comparacion, ya que en ASCII, A != a
				if(comparador(lmao[i].toLowerCase(), lmao[j].toLowerCase(), 0)) {
					
					permutar(lmao, i, j);
					
				}
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
	}
	//----------------------------------------------------------------------
	
	// Metodo de Insercion para ordenar un array de Strings
	public static void insertionSort(String[] papaupa) {
		
		// Aqui ordenaremos el array de Strings llamado papaupa usando el insertion sort
		
		String value; // Asignamos memoria 0x28
		
		// iteramos desde 1..papaupa.length; empezamos en 1 por como funciona 
		// este algoritmo, ya que vamos a tener que comprobar los anteriores
		// segun vamos
		// Mirar nota (1*) respecto a este bucle
		for(int i = 1; i < papaupa.length; ++i) {
			
			value = papaupa[i];
			int j = i - 1;
			while((j >= 0) && (papaupa[j].compareTo(value) > 0)) {
				
				papaupa[j + 1] = papaupa[j];
				--j;
				
			}
			papaupa[j + 1] = value;
			// ++i; // hehe xd aqui habia anadido un error sin querer lmao
		}
		
		
	}
	//----------------------------------------------------------------------
	
	/*
	* FUNCIÓN aString (Entero[] a)--> String
	* POST: Visualizador de un array de enteros: 
	*       convierte los datos del array en un String.
	*/
	public static String aString(String[] a) {

		String s = "{ ";
	    
		for (int i=0; i<=a.length-1; i++) {
	    
			if (i!=0) {  
	    
				s = s + ", ";

			}

			s = s + a[i];

		}  
	    return s + " }";
	  }     
	//-----------------------------------------------------------------
	  
	// Metodo de Seleccion para ordenar un array de Strings
	public static void selectionSort(String[] cachalote) {
		
		//Aqui ordenaremos el array de Strings llamado Cachalote usando
		// el selection sort
		
		// Bueno, en este caso la idea principal es elegir 2 elementos
		// compararlos. Para ello, debemos encontrar el valor minimo, e intercambiarlo
		// con el que tenemos
		
		int posMin = -1; // Todavia no sabemos cual es
		// Comenzamos a iterar
		for(int i = 0; i < cachalote.length; ++i) {
			
			// Necesitamos encontrar la nueva posicion del minimo
			posMin = i; // Decimos que el minimo es i, para que nunca miremos 
			// los elementos que hemos sacado
			// iteramos a partir del siguiente otra vez
			for(int j = i + 1; j < cachalote.length; ++j) {
				
				if(comparador(cachalote[posMin], cachalote[j], 0)) {
					
					posMin = j;
					
				}
				
			}
			
			permutar(cachalote, posMin, i);
			
		}
	
	}
	//----------------------------------------------------------------------
	
	
}
/*

	MY TYPYKO K45T1LL0

THANK YOU MARIO!
BUT OUR PRINCESS IS									execute toad.exe
IN ANOTHER CASTLE

>>                                                        >>
|                     >>            >>                    |
*                     |             |                     *
/ \                    *             *                    / \
/___\                 _/ \           / \_                 /___\
[   ]                |/   \_________/   \|                [   ]
[ I ]                /     \       /     \                [ I ]
[   ]_ _ _          /       \     /       \          _ _ _[   ]
[   ] U U |        {#########}   {#########}        | U U [   ]
[   ]====/          \=======/     \=======/          \====[   ]
[   ]    |           |   I |_ _ _ _| I   |           |    [   ]
[___]    |_ _ _ _ _ _|     | U U U |     |_ _ _ _ _ _|    [___]
\===/  I | U U U U U |     |=======|     | U U U U U | I  \===/
\=/     |===========| I   | + W + |   I |===========|     \=/
|  I   |           |     |_______|     |           |   I  |
|      |           |     |||||||||     |           |      |
|      |           |   I ||vvvvv|| I   |           |      |
_-_-|______|-----------|_____||     ||_____|-----------|______|-_-_
/________\         /______||     ||______\         /________\
|__________|-------|________\_____/________|-------|__________|



*/


