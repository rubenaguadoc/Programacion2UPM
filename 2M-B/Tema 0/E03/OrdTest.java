package t00.e03;

public class OrdTest {

	
	// Esta es una funcion auxiiar que estoy creando para asignarle valores pseudo-aleatorios a cada elemento
	public static void poblarArray(int[] a) {
		
		for(int i = 0x0; i < a.length; ++i) {
			
			a[i] = (int)(Math.random() * 0x2A + 0x1); // Formula casera cuz antipasta
			
			// Basicamente aqui lo que estoy haciendo es iterar usando un bucle, por cada elemento del array
			// Y una vez tengamos un elemento, lo que hacemos es generar un numero de 0..1 y multiplicarlo 
			// por 0x2A. Si no sabeis que numero es 0x2A, solo os dare una pista
			// Los numeros que use en este archivo no van a estar en sistema decimal
			// En cualquier caso, la razon por laque multiplicamos es porque queremos que nos salga un numero
			// mayor que 0 o 1, porque sino solo tendriamos 2 posibles enteros
			// Luego le sumamos 0x1 (= 1) para no incluir el numero 0.
			// Finalmente, usamos 'casting' para convertir el numero real que nos aparece a un numero entero
			
		}
		
	}
	//--------------------------------------------------------------------------
	
	// Aqui desordenamos el array como nos apetezca lmao
	public static void hacerleCosasRarasALaPapaya(int[] a) {
		
		
		// Iteramos de 0..a.lenght
		for(int i = 0x0; i < a.length; ++i) {
			
			// generamos aleatoriamente la posicion que vamos a cambiar:
			int pos_final = (int)(Math.random() * a.length);
			// usamos a.length y no a.length - 1 pq sabemos que el rango de este
			// generador siempre va a ser de 0..a.length - 1
			// Si usaramos a.length - 1 entonces tendriamos rango 0..a.length - 2
			
			// Y aqui permutamos las posiciones:
			// Es Decir, para permutar:
			// creamos una variable temporal y guardamos a[pos_inicial] para no perderlo
						
			int temp = a[i]; 
			
			// ahora aqui sustituimos la a[pos_inicial] con la a[pos_final]
			
			a[i] = a[pos_final];
			
			// Si no hubieramos guardado a[pos_inicial] en una variable temporal
			// hubieramos acabado con que a[pos_inicial] y a[pos_final] serian 
			// completamente iguales, es decir, habriamos duplicado a[pos_final]
			
			a[pos_final] = temp;
			// decimos que a[pos_final] es temp
			
		}
		
	}
	//--------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		// Quiere que hagamos pruebas con el archivo Ord
		// Pero desde un archivo llamado OrdTest
		// Esto tiene 2 soluciones: 
		// O poner encima de la clase import Ord para importar 
		// las funciones que tenga Ord.java
		// O inicializando un objeto:
		Ord ord = new Ord();
		// ^^^ Esta es la manera preferida, ya que estamos dando OOP
		// (Object Oriented Programming), ya os hago el trabajo de Google
		
		// Ademas, nos pide que sigamos las pruebas en el siguiente formato:
		// Escribir(dato)
		// Operacion(dato)
		// Escribir(dato)
		// Asi que vamos a ello
		
		// Para empezar, necesitamos un Array de enteros:
		
		int[] papaya = new int[10]; // El tamaño no importa ;)
		// papaya cuz antipasta
		
		// ahora podemos empezar a hacer todas las pruebas que necesitan un array
		// Que sepais que no lo voy a hacer en orden tal y como aparecen en el archivo
		
		// Empecemos con 'aString(a : int[])
		String str = ord.aString(papaya);
		System.out.println(str);
		// Os parece extraña la notacion Ord.aString() ?
		// Bueno, eso os lo explico. En Java, y en muchisimos otros lenguajes, los objectos son estructuras que 
		// contienen informacion y funciones y demas
		// para  acceder a esta informacion, se usa la notacion del puntito
		// asi que para acceder a algo que sea 'public', usaremos la siguiente notacion:
		// [NOMBRE_DEL_OBJETO].[DATO A ACCEDER]
		// o en el caso de una funcion:
		// [NOMBRE_DEL_OBJECTO].funcion()
		// Las funciones dentro de un objeto se llaman Metodos (o Methods)
		
		// Output : { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
		// por ahora, todo correcto
		// vamos a probar mi funcion auxiliar:
		poblarArray(papaya);
		str = Ord.aString(papaya); // Acabamos de cambiar papaya, por lo que str no sera igual al str anterior
		System.out.println(str);
		// Output: { 26, 17, 2, 20, 4, 14, 33, 33, 6, 6 } 
		// (al ser aleatorio, el mio es distinto del tuyo)
		
		// Bueno, mi funcion auxiliar funciona, continuemos las pruebas
		
		// Ordenamos usando el algoritmo de la burbuja
		ord.ordenarBurbuja(papaya);
		System.out.println("La papaya antes era: " + str
							+ "\nLa papaya ahora es: " + ord.aString(papaya));
		
		// Esa \n solo anade una nueva linea, para no tener que poner 2 prints
		// Output: 
		//La papaya antes era: { 30, 17, 19, 33, 1, 18, 18, 3, 22, 3 }
		//La papaya ahora es: { 1, 3, 3, 17, 18, 18, 19, 22, 30, 33 }
		
		// Ahora vamos a probar otra funcion auxiliar que me apetecia crear
		// esta funcion desordenara una coleccion asi a lo random
		// miam.exe >> hehe xd
		hacerleCosasRarasALaPapaya(papaya); // le hacemos cosas raras a nuestro array
		str = Ord.aString(papaya); // de nuevo lo pasams a string
		// Esto funciona, confiad en mi *_*
		// AHora podemos pedir que lo ordenen mediante insercion
		
		ord.ordenarInsercion(papaya);
		
		System.out.println("La papaya antes era: " + str
						+ "\nLa papaya ahora es: " + ord.aString(papaya));
		
		// Output: 
		// La papaya antes era: { 26, 30, 42, 34, 31, 26, 38, 28, 24, 25 }
		// La papaya ahora es: { 24, 25, 26, 26, 28, 30, 31, 34, 38, 42 }
		
		// Volvemos a desordenar el array para la ultima prueba:
		
		hacerleCosasRarasALaPapaya(papaya);
		str = ord.aString(papaya);
		ord.ordenarSeleccion(papaya);
		System.out.println("La papaya antes era: " + str
						+ "\nLa papaya ahora es: " + ord.aString(papaya));
		
		// Output:
		// La papaya antes era: { 24, 35, 10, 27, 32, 28, 13, 31, 13, 24 }
		// La papaya ahora es: { 10, 13, 13, 24, 24, 27, 28, 31, 32, 35 }
		
		
		// Ahora pasamos a la segunda parte, crear el archivo FicheroNumerosOrd.java
		// Podeis ojearlo, haremos las pruebas aqui
		
		FicheroNumerosOrd f = new FicheroNumerosOrd(); // Lo inicializamos
		f.ordenar("miam_1.txt", "miam_ordenado.txt");
		// y llamaos la funcion
		// estoy usando miam_1.txt porque ya lo tenia de los anteriores ejercicios
		// Output:
		// miam_1.txt >> 4 19 13 6 0 2 14 5 6 18 
		// miam_ordenado.txt >>  0 2 4 5 6 6 13 14 18 19
		
		// Y ya estaria

		
	}
	
}
