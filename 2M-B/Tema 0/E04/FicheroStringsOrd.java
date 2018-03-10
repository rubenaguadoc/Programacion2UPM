package t00.e04;

import stdlib.In;
import stdlib.Out;

public class FicheroStringsOrd {

	FicheroStringsOrd() {
		
		// Como siempre, creamos el constructor
		
	}
	//----------------------------------------------------------------------
	
	public void generarArchivo(String name) {
		
		// Porque lo tenia a mano
		String[] miam = {"AAA",
						"AAAA",
						"AAA",
						"ABC", 
						"CBACBAABCDE",
						"ABCDEFGHIJKLMN",
						" A",
						"POLLO"
						};
		
		Out archivo_salida = new Out(name); // preparamos un archivo de salida
		
		for(String s : miam) {
			
			archivo_salida.print(" " + s);
			
		}
		
		
	}
	//----------------------------------------------------------------------
	
	public void ordenar(String entrada, String salida) {
		
		In archivo_entrada = new In(entrada); // Llamamos a StdLib y para que prepare 
		Out archivo_salida = new Out(salida);  // los archivos de entrada y salida
		
		String[] array = archivo_entrada.readAllStrings(); // Usamos la libreria para leerlo todo
		
		// Preparamos el objeto de StringsOrd para ordenar
		StringsOrd ord = new StringsOrd();
		
		// Ordenamos:
		ord.selectionSort(array); // Podriamos haber usad cualquiera de los algoritmoss
		
		// Iteramos con un bucle por cada elemento del array
		// Y lo guardamos  en el archivo de salida
		// Uso un foreach, si no sabeis lo que es mirad el ejercicio e03 
		// o buscad en google
		
		for(String s : array) {
			
			archivo_salida.print(" " + s);
			
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

