package t00.e01;

// Imports
// #include <stdlib>

import stdlib.In;
import stdlib.Out;
import stdlib.StdIn;

/** 
 * E/S estándar y manejo de ficheros.
 * @since 29/11/2017
 * @version 1.1.1    07/02/2018
 * @author Javier Galve y solucion por @PrinceKiwii
 */

class Tema00_E01	{
	
  /*
   * aString (a : Entero[]) : String
   * POST: Visualizador de un array de enteros: 
   *       convierte los datos del array <a> en un String.
   */
  static String aString (int[] a)  {
	  
    String s = "[ ";
    
    for (int i=0; i<=a.length-1; i++) {
    	
      if (i!=0) {  
    	  
        s = s + ", ";
        
      }
      
      s = s + a[i];
      
    }  
    
    return s + " ]";
  }          
  //-----------------------------------------------------------
  
  /*
   * escribirArray (a : Entero[])
   * EFECTO: Muestra el array <a> en la salida estándar.
   *         Todos los elementos de <a> en la misma línea 
   *         y con un espacio en blanco de separación 
   *         delante de cada uno.
   *         Salta una línea al final.
   */ 
  static void escribirArray (int[] a)  {
	  
    for (int i=0; i < a.length; i++) {
    	
    	System.out.print(" " + a[i]);
    	
    }

    System.out.println( );
    
  }
  //-----------------------------------------------------------
  
  /*
   * escribirArray (numeros : Entero[]; archivo :  String)
   * EFECTO:
   */
  static void escribirArray (int[] numeros, String archivo) { 
	  
    Out f = new Out(archivo);
    
    for (int i=0; i<=numeros.length-1; i++) {
    	
    	f.print(" " + numeros[i]);
    	
    }
      
  }
  //-----------------------------------------------------------
  
  /*
   * escribirAleatorios (n : Entero)
   * EFECTO:
   */
  static void escribirAleatorios (int n) {
	  
    for (int i=1; i<=n; i++) {
    	
        System.out.print((int)(10*Math.random()) + " ");
    	
    }
    
    System.out.println();
  }
  //-----------------------------------------------------------
  
  /*
   * escribirAleatorios (archivo : String; n, m : Entero)
   * EFECTO:
   */
  static void escribirAleatorios (String archivo, int n, int m) { 
	  
    Out f = new Out(archivo);
    
    for (int i=1; i<=n; i++) {
    	
        f.print((int)(m*Math.random()) + " ");
    	
    }
    
  }
  //-----------------------------------------------------------
  
  /*
   * aleatorios (m, n : Entero) : Entero[]
   * POST:
   */
  static int[] aleatorios (int m, int n)  {
	  
    int[] resultado = new int[n];
    
    for (int i=0; i<resultado.length; i++)    {
    	
      resultado[i] = (int)(m*Math.random());
      
    }  
    
    return resultado;
    
  }
  //-----------------------------------------------------------
  
  
  /*
   * leerArray () : Entero[]
   * POST: 
   */
  static int[] leerArray ()  {
	  
    int longitud = StdIn.readInt();
    int[] resultado = new int[longitud];
    
    for (int i=0; i<resultado.length; i++)	{
    	
      resultado[i] = StdIn.readInt();
      
    }  
    
    return resultado;
    
  }
  //-----------------------------------------------------------
  
   /*
   * leerArray (n : Entero; archivo : String) : Entero[]
   * POST: 
   */
  static int[] leerArray (int n, String archivo) {
	  
    In f = new In(archivo);
    int[] resultado = new int[n];
    
    for (int i=0; i<=n-1; i++) {
    	
    	resultado[i] = f.readInt();
    	
    }
      
    return resultado;
    
  }
  //-----------------------------------------------------------
  
    /*
   * suma () : Entero
   * POST:
   */
  static int suma () {
	  
    int resultado = 0;
    while (!StdIn.isEmpty())	{
    	
       resultado = resultado + StdIn.readInt();
       
    }  
    
    return resultado;
    
  }
  //-----------------------------------------------------------
  
  /*
   * suma (archivo : String) : Entero
   * POST:
   */
  static int suma (String archivo)	{
	  
    In f = new In(archivo);
    int resultado = 0;
    int n = 0; // Esta n no sirve para nada, no se pq la puso el profesor
    
    while (!f.isEmpty())	{
    	
       resultado = resultado + f.readInt();
       
    }   
    
    return resultado;
  }
  //-----------------------------------------------------------
  
  // Main Method
  public static void main(String[] args) {
	  
	  // En este ejercicio hay que probar, y determinar lo que hace cada funcion
	  // Luego hay que escribir el efecto donde ponga 'post' o 'efecto'
	  // encima de cada funcion.
	  // Pero me da pereza, asi que de eso os encargais vosotros
	  // Aqui teneis explicaciones detalladas de cada cosa
	  
	  // Vamos a hacer las pruebas de cada funcion. 
	  // Empecemos con la primera, 'aString()'
	  
	  // Lo primero, necesitamos un array de enteros
	  int[] a = new int[10]; 
	  
	  // Como todavia no cambiamos nada en este array,
	  // deberian ser todo 0s
	  // Comprobemos:
	  
	  String s = aString(a); // Convertimos el array en un String
	  System.out.println(s); // Imprimimos en l consola nuestro String
	  
	  // Output: [ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ]
	  
	  // Ahorita a la segunda, 'escribirArray()'
	  
	  escribirArray(a); 
	  // Ya teniamos creado el array 'a', asi que usaremos esto
	  // para comprobar.
	  
	  // Output:  0 0 0 0 0 0 0 0 0 0
	  
	  // Podemos observar que los resultados son coherentes
	  
	  // Toca la tercera, 'escribirArray(archivo)'
	  
	  String nombre_del_archivo = "miam_0.txt"; // El nombre del archivo que queremos
	  
	  escribirArray(a, nombre_del_archivo);
	  // Aqui pasamos lo que necesitamos como argumentos de la funcion
	  // En este caso un array que contenga los datos que queremos
	  // y un String que contenga el nombre del archivo
	  System.out.println("el array "
			  			+ aString(a)
			  			+ " fue escrito en "
			  			+ nombre_del_archivo
			  			+ " correctamente!");
	  // Al buscar este archivo, nos damos cuenta de que  lo que hace es guardar 
	  // el array dentro de un archivo de texto llamado 'miam_0'
	  
	  // Output: miam_0.txt >>  0 0 0 0 0 0 0 0 0 0
	  
	  // A la cuarta, 'escribirAleatorios()'
	  escribirAleatorios(10);
	  
	  // Output: 7 7 7 9 9 1 0 8 9 9 
	  // Si corremos el programas mas veces, se puede apreciar que es un 
	  // generador pseudo-aleatorio de <n> numeros enteros
	  
	  // La siguiente es 'escribirAleatorios(archivo)
	  
	  // Vamos a necesitar un nombre para el archivo
	  // Me apetece usar uno distinto para llenar mi portatil de ficheros basura
	  // por que soy un poco tonto
	  // asi que voy a llamarlo 'miam_2'
	  // No necesitamos declarar una nueva variable para esto, 
	  // basta con modificar una existente: nombre_del_archivo
	  nombre_del_archivo = "miam_1.txt";
	  
	  escribirAleatorios(nombre_del_archivo,10, 20);
	  
	  // Output: miam_1 >> 12 18 2 8 8 1 16 6 0 11 
	  
	  // Si se hacen muchas mas pruebas, se podra observar que el parametro <n>
	  // se refiere a la cantidad de numeros generados, y <m> es el maximo
	  // valor de los numeros generados
	  
	  // La siguiente es 'aleatorios()'
	  // que pesadez... matenme pls
	  
	  System.out.println(aString(aleatorios(10, 10)));
	  
	  // Output: [ 3, 4, 0, 7, 2, 9, 4, 4, 9, 7 ]
	  // una vez mas, se esta generando un arra de enteros pseudo-aleatorio
	  // donde n es la cantidad de elementos en el array
	  // y <m> es el maximo valor que toman.
	  // Bueno en realidad el maximo valor que pueden tomar es (m - 1)
	  // pero eso es pq para cada n_i :: 0 <= n_i <= m - 1, lo cual efectivamente
	  // da un rango de valores igual a 20
	  
	  
	  // Ya casi esta.....
	  // Ahora toca 'leerArray() o algo por el estilo
	  
	  System.out.println(aString(leerArray()));
	  
	  // Input:
	  /*
	   * > 10 :: Esto se refiere a la cantidad de elementos que queremos
	   * > 1  :: El Primer Elemento que queremos en el array
	   * > (Sigue asi del 1 al 10) (Voy a ahogarme en mis propias lagrimas)
	   * > 10 :: En este caso, como hemos introducido 1...10, este es el ultimo elemento
	   */
	  // Output: [ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]
	  
	  // Simplemente nos pide la cantidad de elementos que queremos, y luego
	  // nos obliga a introducirlos en la consola uno a uno 
	  // hasta que queramos morir
	  
	  // Toca mas de lo mismo pero con archivos. k asko
	  
	  // Bueno para empezar esta es una operacion de lectura
	  // asi que necesitamos un archivo del que leer
	  // ya habiamos guardado datos en el archivo miam_1.txt
	  // asi que vamos a leer de ahi. hehe xd
	  
	  // nombre_del_archivo = "miam_1.txt" En este momento, esto es asi pq no 
	  // hemos cambiado el nombre desde la ultima vez que lo usamos
	  System.out.println("It's me, Mahrio!"); // do it 4 the memes
	  System.out.println(aString(leerArray(8, nombre_del_archivo)));
	  System.out.println(aString(leerArray(10, nombre_del_archivo)));
	  
	  // Aqui os podeis da cuenta de que esta leyendo del archivo los primeros
	  // <n> numeros enteros, y los esta guardando de nuevo en memoria en un array
	  // Que pasara si poneis un n > el numero de enteros en el archivo?
	  // HA AHHAHAHAHAHAHAHAHHAHAHAH HAHAHAHHA 
	  // k os da error >_<
	  
	  // Output: [ 13, 17, 13, 19, 6, 15, 14, 0 ]
	  // Output: [ 13, 17, 13, 19, 6, 15, 14, 0, 13, 0 ]
	  
	  // AHora la penultima:
	  //int SSssssssSSSsssSSSSSssssSSSSSSSsssSSSSuma = suma();
	  //System.out.println(SSssssssSSSsssSSSSSssssSSSSSSSsssSSSSuma);
	  // Os pide numeros para sumar hasta que no escribais nada. 
	  // Output: 231498 ,despues de haber anadido una hermosa cantidad de numeros
	  // Para quepare de sumar, debes hacer Ctrl + D because Retraso_Mental = 1
	  
	  // Y finalmente, tobby es libre:
	  
	  // Aqui tambien necesitamos pasar el nombre del archivo
	  // porque es de donde va a sumar
	  
	  int bob_smith = suma(nombre_del_archivo);
	  System.out.println("La suma de los valores en " 
			  			+ nombre_del_archivo
			  			+ " es : " + bob_smith);
	  // Output: La suma de los valores en miam_1.txt es : 87
	  
  }
  //-----------------------------------------------------------
  
}  

/*
	Thank you Mario!
	But Our Princess is in another castle.
	
                      						            o
                                          _---|         _ _ _ _ _
                                       o   ---|     o   ]-I-I-I-[
                      _ _ _ _ _ _  _---|      | _---|    \ ` ' /
                      ]-I-I-I-I-[   ---|      |  ---|    |.   |
                       \ `   '_/       |     / \    |    | /^\|
                        [*]  __|       ^    / ^ \   ^    | |*||
                        |__   ,|      / \  /    `\ / \   | ===|
                     ___| ___ ,|__   /    /=_=_=_=\   \  |,  _|
                     I_I__I_I__I_I  (====(_________)___|_|____|____
                     \-\--|-|--/-/  |     I  [ ]__I I_I__|____I_I_|
                      |[]      '|   | []  |`__  . [  \-\--|-|--/-/
                      |.   | |' |___|_____I___|___I___|---------|
                     / \| []   .|_|-|_|-|-|_|-|_|-|_|-| []   [] |
                    <===>  |   .|-=-=-=-=-=-=-=-=-=-=-|   |    / \
                    ] []|`   [] ||.|.|.|.|.|.|.|.|.|.||-      <===>
                    ] []| ` |   |/////////\\\\\\\\\\.||__.  | |[] [
                    <===>     ' ||||| |   |   | ||||.||  []   <===>
                     \T/  | |-- ||||| | O | O | ||||.|| . |'   \T/
                      |      . _||||| |   |   | ||||.|| |     | |
                   ../|' v . | .|||||/____|____\|||| /|. . | . ./
                    |//\............/...........\........../../\\\


*/
