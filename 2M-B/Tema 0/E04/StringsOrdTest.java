package t00.e04;


/*
 * @author Prince Kiwii
 * Siempre se me olvida escribir esto ekis de
 * 
 */
public class StringsOrdTest {

	// Main Method
	public static void main(String[] args) {
		
		// Preparamos el objeto para nuestras pruebas
		StringsOrd ord = new StringsOrd();
		
		// Ahora creamos un array de Strings
		String[] miam = {"AAA",
						"AAAA",
						"AAA",
						"ABC", 
						"CBACBAABCDE",
						"ABCDEFGHIJKLMN",
						" A",
						"POLLO"
						};
		
		System.out.println("BUBBLE SORT");
		System.out.println(ord.aString(miam));
		ord.bubbleSort(miam);
		System.out.println(ord.aString(miam));
		// Output: {  A, AAA, AAA, AAAA, ABC, ABCDEFGHIJKLMN, CBACBAABCDE, POLLO }
		
		// Ahora creo otro porque me da toda la pereza
		String[] miam_2 = {"AAA",
							"AAAA",
							"AAA",
							"ABC", 
							"CBACBAABCDE",
							"ABCDEFGHIJKLMN",
							" A",
							"POLLO"
							};
		
		System.out.println("SELECTION SORT");
		
		System.out.println(ord.aString(miam_2));
		ord.selectionSort(miam_2);
		System.out.println(ord.aString(miam_2));
		
		// Output: {  A, AAA, AAA, AAAA, ABC, ABCDEFGHIJKLMN, CBACBAABCDE, POLLO }
		
		// Para estas cosas, use una funcion auxiliar que yo mismo he creado 
		// llamada comparador
		// lo hice para que vierais la logica de esta funcion
		// pero que sepais que java tiene una funcion mejor
		// llamada .compareTo()
		// Y en particular otra mas llamada .compareToIgnoreCase() 
		// Que sepais que normalmente las librerias estandar de un lenguaje
		// vienen con esa clase de cosas incluidas
		
		// Asi que para el ultimo ejemplo, con el insertionSort, 
		// usare la libreria de java y el .compareToIgnoreCase
		
		//  otra vez creo otro array desordenado
		String[] miam_3 = {"AAA",
							"AAAA",
							"AAA",
							"ABC", 
							"CBACBAABCDE",
							"ABCDEFGHIJKLMN",
							" A",
							"POLLO"
							};
		
		System.out.println("INSERTION SORT");
		System.out.println(ord.aString(miam_3));
		ord.insertionSort(miam_3);
		System.out.println(ord.aString(miam_3));
		
		// Output: {  A, AAA, AAA, AAAA, ABC, ABCDEFGHIJKLMN, CBACBAABCDE, POLLO }
		// ez
		
		FicheroStringsOrd f = new FicheroStringsOrd(); // Creamos el objeto
		
		f.generarArchivo("miam_Strings.txt"); // Ahora con Strings! lel
		// Output:
		// miam_Strings.txt <<  AAA AAAA AAA ABC CBACBAABCDE ABCDEFGHIJKLMN  A POLLO
		//kek
		f.ordenar("miam_Strings.txt", "miam_Strings_2.txt"); // miam!
		//Output:
		// miam_Strings2.txt >>  A AAA AAA AAAA ABC ABCDEFGHIJKLMN CBACBAABCDE POLLO
		
		// Y ya estaria!
		
		 
	}
	
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
 \=/     |===========| I    | + W + |   I |===========|     \=/
 |  I   |           |       |_______|     |           |   I  |
 |      |           |       |||||||||     |           |      |
 |      |           |   I   ||vvvvv|| I   |           |      |
_-_-|______|-----------|_____||     ||_____|-----------|______|-_-_
 /________\         /______||     ||______\         /________\
|__________|-------|________\_____/________|-------|__________|



*/


