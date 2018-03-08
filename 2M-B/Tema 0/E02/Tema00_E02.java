package t00.e02;

import stdlib.In;
import stdlib.Out;
import stdlib.StdIn;

/** 
 * Lectura y escritura en archivos de texto.
 * @since 29/11/2017
 * @version 1.1    05/02/2018
 * @author Javier Galve y solucion por @PrinceKiwii
 */
class Tema00_E02	{
	
  /*
   * suma (n : Entero) : Entero
   * POST: Devuelve la suma de n números leídos de la 
   *       entrada estándar.
   *       Los números vienen números separados por espacios 
   *       o saltos de línea. 
   *       El final viene marcado con <ctrl><d>.
   */
  static int suma (int n)	{
	  
    int resultado = 0;
    
    for (int i=1; i<=n; i++) {
    	
    	resultado = resultado + StdIn.readInt();
    	
    }
      
    return resultado;
  
  }
  //-----------------------------------------------
  
  /*
   * suma () : Entero
   * POST: Devuelve la suma de los números leídos de la 
   *       entrada estándar. Se desconoce a priori cuántos 
   *       números vendrán. 
   *       Los números vienen separados por espacios 
   *       o saltos de línea. 
   *       El final viene marcado con <ctrl><d>.
   */
   
  	static int suma () {
	  
	    int resultado = 0;
	    while (!StdIn.isEmpty())	{
	    	
	       resultado = resultado + StdIn.readInt();
	       
	    }  
	    
	    return resultado;
	    
	  }
  //-----------------------------------------------
  	
  /*
   * suma (archivo : String) : Entero
   * POST: Devuelve la suma de los números leídos de un 
   *       archivo de entrada de nombre <archivo>. Se 
   *       desconoce a priori cuántos números vendrán en 
   *       <archivo>.
   */
  	static int suma (String archivo)	{
  	  
  	    In f = new In(archivo);
  	    int resultado = 0;
  	    
  	    while (!f.isEmpty())	{
  	    	
  	       resultado = resultado + f.readInt();
  	       
  	    }   
  	    
  	    return resultado;
  	  }
  //-----------------------------------------------

  /*
   * media (n : Entero) : Entero
   * POST: Devuelve la media de n números leídos de la 
   *       entrada estándar.
   */
  	
  	static int media (int n) {
  	  
	    int resultado = 0;
	    // Inicializamos una variable para guardar la suma
	    
	    // Luego iremos desde 0...n, y cada vez 
	    // iremos sumandole una entrade al resultado
	    
	    for(int i = 0; i < n; ++i) {
	    	
	    	resultado += StdIn.readInt();
	    	
	    }
	    
	    // finalmente devolvemos usando la formula de la media
	    
	    return (int)(resultado / n);
	    
	  }
  //-----------------------------------------------
  	
  /*
   * media (archivo : String) : Entero
   * POST: Devuelve la media de los números leídos de un 
   *       archivo de entrada de nombre <archivo>. Se 
   *       desconoce a priori cuántos números vendrán en 
   *       <archivo>.
   */

  
  	
  	static int media (String archivo)	{
    	  
  	    In f = new In(archivo);
  	    // Accedemos al archivo, y lo preparamos en memoria
  	    
  	    int resultado = 0;
  	    // Iniciamos un contador para saber
  	    // cuantos numeros hay para luego usar la formula
  	    int i = 0; 
  	    
  	    // Sumamos hasta que no haya nada mas en el archivo
  	    while (!f.isEmpty())	{
  	    	
  	    	++i;
  	       resultado = resultado + f.readInt();
  	       
  	    }   
  	    
  	    // Usamos la formula
  	    return (int)(resultado/i);
  	  }
  //-----------------------------------------------
  	
  /*
   * existe (archivo : String; n : Entero): Booleano
   * POST: Determina si existe un número <n> en un 
   *       archivo de entrada de nombre <archivo>.
   */
  static boolean existe (String archivo, int n)	{ 
	  
    In f = new In(archivo);
    boolean resultado = false;
    while (!f.isEmpty() && !resultado)	{
    	
       if (f.readInt() == n) {
    	   
    	   resultado = true;
    	   
       }
       
    }   
    
    return resultado;
    
  }
  //-----------------------------------------------

  /*
   * todos (archivo : String; n : Entero): Booleano
   * POST: Determina si todos los números del  
   *       archivo de entrada de nombre <archivo>
   *       son iguales a <n>.
   */

  static boolean todos(String archivo, int n) {
	  
	  // Seguramente el profesor querra que primero 
	  // comprobeis si <n> existe en el archivo:
	  if(!existe(archivo, n)) {
		  
		  return false;
		  
	  }
	  
	  // Realmente, esto en esta situacion no es eficiente, asi que 
	  // podriais saltaroslo.
	  
	  boolean retn = true; // Boolean return
	  // Lo inicializamos a true, a priori pensamos que si es cierto
	  
	  In f = new In(archivo); // Cargamos el archivo en memoria (o al menos el objeto)
	  
	  // Mientras el archivo no este vacio y retn sea cierto
	  while(!f.isEmpty() && retn) {
		  
		  
		  // Si alguno de los datos del archivo no es n, retn es falso
		  if(f.readInt() != n) {
			  
			  retn = false;
			  
		  }
		  
	  }
	  
	  return retn;
	  
	  
  }
  //-----------------------------------------------
  
  /*
   * copiar (entrada, salida : String; numero : Entero)
   * EFECTO: Genera en el archivo <salida> una copia del 
   *         archivo <entrada>.
   */
  static void copiar (String entrada, String salida)	{ 
	  
    In ent = new In(entrada);
    Out sal = new Out(salida);
    while (!ent.isEmpty())	{
    	
      sal.print(" " + ent.readInt());
      
    } 
    
  }
  //-----------------------------------------------
  
  /*
   * filtrar (entrada, salida : String; numero : Entero)
   * EFECTO: Genera un archivo <salida> eliminando todas las 
   *         apariciones de <numero> del archivo <entrada>.
   */
  static void filtrar (String entrada, String salida, int numero)	{ 
	  
	    In ent = new In(entrada);
	    Out sal = new Out(salida);
	    
	    // Preparamos los archivos
	    
	    
	    // Mientras entrada no este vacia, vamos a leer los datos
	    while (!ent.isEmpty())	{
	    	
	    	// Los almacenamos en una variable local
	    	// en la scope del while
	      int n = ent.readInt();
	      // Si n no es igual al numero, entones lo anadimos 
	      // Si lo fuera, lo saltamos
	      if(n != numero) {
	    	  
	    	  sal.print(" " + n);
	    	  
	      }
	      
	    } 
	    
	  }
	  //-----------------------------------------------
	  
  /*
   * incrementar (entrada, salida : String; delta : Entero)
   * EFECTO: Genera un archivo <salida> incrementando todos los
   *         números del archivo <entrada> en <delta>.
   */
  static void incrementar (String entrada, String salida, int delta)	{ 
	   
	    // Preparamos los archivos
	    In ent = new In(entrada);
	    Out sal = new Out(salida);
	 

	    // Mientras entrada no este vacia, vamos a leer los datos
	    while (!ent.isEmpty())	{
	    	
	    	// Obtenemos el dato en entrada, y le sumamos delta
	    	// Guardamos todo en una variable local
	    	// para que quede mas limpio
	    	int n = ent.readInt() + delta;
	    	// Lo anadimos al archivo de salida
	    	sal.print(" " + n);
	    	
	      }
	      
	  } 
	  //-----------------------------------------------
  
  public static void main (String[] args)	{
	  
	  // Lo primero segun el enunciado, es pasar pruebas en las operaciones 
	  // que se nos da desde el principio. Asi que vamos a hacerlo:
	  
	  System.out.println("Suma 1...5 = " + suma(5));
	  
	  String nombre_del_archivo = "miam_1.txt"; 
	  // Lo llamo asi porque tengo un archivo del anterior ejercicio con datos 
	  // que se llama miam_1.txt
	  
	  // En este archivo estan los siguientes datos: 4 19 13 6 0 2 14 5 6 18 
	  
	  // Este deberia existir
	  System.out.println("Existe? :: " + existe(nombre_del_archivo, 5));
	  
	  // Este NO PUEDE existir
	  System.out.println("Existe? :: " + existe(nombre_del_archivo, 43));
	  
	  // Aqui copiamos los contenidos de un archivo a otro;
	  
	  String entrada = nombre_del_archivo;
	  String salida = nombre_del_archivo + "(Copia).txt";
	  copiar(entrada, salida);
	  System.out.println("Copia Realizada con exito: Contenidos de "
			  			+ entrada 
			  			+ " copiados a "
			  			+ salida);
	  
	  // Ahora deberiamos tener 2 archivos con el mismo contenido.
	  // En este caso miam_1.txt y miam_1.txt(Copia).txt
	  
	  
	  // Segunda Parte: Implementar las funciones que se nos piden
	  
	  // Empecemos con: suma()
	  
	  // System.out.println(suma());
	  
	  
	  /*
	   * 
	   * IMPORTANTE: Aqui hay un problema.
	   * Por alguna razon, esta basura de libreria hara que todo
	   * StdIn se encuentre en el estado empty al darle Ctrl + D.
	   * Esto implica que ninguna funcion que aparezca despues de una
	   * que necesita el Ctrl + D funciona. 
	   * 
	   * TODO: Bug #1
	   * Naturaleza del bug:
	   * 
	  public boolean hasNext() {
        ensureOpen();
        saveState();
        while (!sourceClosed) {
            if (hasTokenInBuffer())
                return revertState(true);
            readInput();
      }
        boolean result = hasTokenInBuffer();
        return revertState(result);
    }
	   * 
	   * If scanner is closed, we'll get an exception
	   * Ctrl + D is a shortcut to KILL the SCANNER
	   * Therefore there will always be an issue
	   * because the .isEmpty Function is garbage
	   * 
	   * 
	   */
	  
	  // Al hacer la suma 1..5 se puede apreciar que da 15
	  // como deberia ser
	  
	  // Aqui comparamos las copias previamente creadas 
	  // usando la nueva funcion suma(nombre_del_archivo)
	  // usamos 'entrada' y 'salida' porque estas son 
	  // las variables que guardan los nombres de los archivos
	  
	  System.out.println("Son las copias iguales? " + (suma(entrada) == suma(salida)));
	  
	  // AHora vamos con las medias que acabamos de crear:
	  
	  System.out.println("Media: " + media(5));
	  
	  // Calculamos la media en los datos de un archivo
	  System.out.println("Media en " + entrada + ": " + media(entrada)); 
	  
	  
	  
	  // Todos()
	  // ya sabemos que eso deberia ser falso: no todos los datos son 1
	  System.out.println("TODOS: " + todos(entrada, 1));
	  
	  // Para el resto, cambiamos el nombre de las salidas
	  salida = "miam_filtro.txt";
	  filtrar(entrada, salida, 5);
	  
	  // miam_1.txt >> 4 19 13 6 0 2 14 5 6 18 
	  
	  // Output: 
	  // miam_filtro.txt >>  4 19 13 6 0 2 14 6 18
	  
	  // Como se puede ver, funciona correctamente
	  
	  salida = "miam_incremento.txt";
	  incrementar(entrada, salida, 1);
	  
	  // Output:
	  // miam_incremento.txt >>  5 20 14 7 1 3 15 6 7 19
	  
	  // Y finalmente, este tambien funciona bien.
	  // ale, me voy a cenar
	  
  }
  //-----------------------------------------------
  
  
  /*
   * THANK YOU MARIO!
   * BUT OUR PRINCESS IS IN
   * ANOTHER CASTLE
   * 
   *      			  | |__|__|__|__|__|__|__|__|__|_|                         
 __    __    __       |_|___|___|___|___|___|___|___||       __    __    __   
|__|  |__|  |__|      |___|___|___|___|___|___|___|__|      |__|  |__|  |__|   
|__|__|__|__|__|       \____________________________/       |__|__|__|__|__|   
|_|___|___|___||        |_|___|___|___|___|___|___||        |_|___|___|___||
|___|___|___|__|        |___|___|___|___|___|___|__|        |___|___|___|__|   
 \_|__|__|___|/          \________________________/          \_|__|__|__|_/    
  \__|____|__/            |___|___|___|___|___|__|            \__|__|__|_/     
   |||_|_|_||             |_|___|___|___|___|__|_|             |_|_|_|_||      
   ||_|_|||_|__    __    _| _  __ |_ __  _ __  _ |_    __    __||_|_|_|_|      
   |_|_|_|_||__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|_|_|_|_||      
   ||_|||_|||___|___|___|___|___|___|___|___|___|___|___|___|__||_|_|_|_|      
   |_|_|_|_||_|___|___|___|___|___|___|___|___|___|___|___|___||_|_|_|_||      
   ||_|_|_|_|___|___|___|___|___|___|___|___|___|___|___|___|__||_|_|_|_|      
   |_|||_|_||_|___|___|___|___|___|___|___|___|___|___|___|___||_|_|_|_||      
   ||_|_|_|_|___|___|___|___|___|_/| | | \__|___|___|___|___|__||_|_|_|_|      
   |_|_|_|_||_|___|___|___|___|__/ | | | |\___|___|___|___|___||_|_|_|_||      
   ||_|_|_|||___|___|___|___|___|| | | | | |____|___|___|___|__||_|_|_|_|      
   |_|_|_|_||_|___|___|___|___|_|| | | | | |__|___|___|___|___||_|_|_|_||      
  /___|___|__\__|___|___|___|___|| | | | | |____|___|___|___|_/_|___|__|_\     
 |_|_|_|_|_|_||___|___|___|___|_|| | | | | |__|___|___|___|__|_|__|__|__|_|    
 ||_|_|_|_|_|_|_|___|___|___|___||_|_|_|_|_|____|___|___|____|___|__|__|__|    
   * 
   */
  // hehe xd
  
}  