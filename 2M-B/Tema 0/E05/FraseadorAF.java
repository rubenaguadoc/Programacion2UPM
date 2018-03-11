package t00.e05;

import stdlib.In;

/** 
 * El fraseador procaz
 * @since 8/02/2017
 * @version 1.0
 * @author Javier Galve y @PrinceKiwii
 */
class FraseadorAF	{
	
   static String[] lasFrases = new String[100];
   // Estamos asignando 100 de espacio a esto, por el proposito del ejercicio supongo   
	
  /*
   * longitud (frases : String[]) : Entero
   * POST: Calcula la longitud de <frases>
   * @Javier Galve este nombre para esta funcion no es muy bueno...
   */
   public static int longitud(String[] frases) {
	   
	   // Os explico; el profesor decidio que como maximo, el frases : String[] 
	   // va a tener X espacios. Lo que (creo que) esta pidiendo es contar la cantidad
	   // de frases que hay hasta que nos encontremos con una frase vacia
	   // es decir, una frase que ocupe 0x28 bytes en memoria 
	   // o en otras palabras , una frase que sea null, aka vacia.
	   // null es dificil de explicar
	   // pero basicamente es "nada"
	   // pero realmente no es nada, seria mas bien como una referencia a la nada
	   // pero creo que si que ocupa algo en memoria (minimos)
	   // Vamos a hacer esto con un for y no con un foreach pq es mas practico
	   // El foreach es muy situacional
	   // Explico: para hacer este problema, el foreach tine que inicializar una variable
	   // cosa que internamente ya esta haciendo, 
	   // asi que en memoria tendriamos 0x4 * 2 = 0x8 bytes
	   // sin embargo, usando un for solo tendriamos 0x4 bytes
	   // en resumen, usar un for es mas optimo
	   
	   // Algoritmo:
	   int i = 0; // vamos a tener que devover este contador despues del bucle
	   // Tenemos que encontrar una frase vacia, mientras no la tengamos, found = false
	   boolean found = false; 
	   // Una vez la tengamos, entonces el bucle se saldra
	   for(; i < frases.length && !found; ++i) {
		   
		   // comprobamos si frases[i] es null
		   if(frases[i] == null) {
			   
			   found = true; // Encontramos una frase vacia, found = true, bucle no seguira iterando
			   
		   }
		   
	   }
	   
	   return i - 1; // i - 1? por que - 1? Aqui teneis la explicacion:
	   // Sin importar el tipo de bucle (while, for, etc), tendriamos 
	   // que sumar 1 a i despues de cada iteracion. El problema aqui es 
	   // que en a universidad no nos dejan usar 'break'. Y sin un break
	   // la manera de evitar esta suma seria en un while, con un else 
	   // de esta manera:
	   /*
	    int i = 0;
	    while(i < frases.length && !found) {
	    
		    if(frases[i] == null) {
		    
		    	found = true;
		    
		    }
		    else {
		    
		    	++i o i++ o i = i + 1;
		    
		    }
		    
	    }
	    */
	   // Esto hara que en el caso de que se haya encontrado una frase 'null'
	   // no se anada nada al contador.
	   // con un bucle for, tendriamos que restar 1 a i en el if(frases[i] == null)
	   // Y eso, podria resultar muy confuso
	   // Por ello, esta es una situacion en la que un break si que seria bastante util
	   /*
	    for(; i < frases.length; ++i) {
		   
		   // comprobamos si frases[i] es null
		   if(frases[i] == null) {
			   
			   break; // Encontramos una frase vacia, 'rompemos' el bucle,
			   // y asi evitamos la suma
			   
		   }
		   
	   }
	   
	   return i;
	    */
	   // Como veis, esto es mucho mas facil de entender.
	   // Pero weno, no nos dejan asi que teneis que restarle uno a la basura esta
	   
   }
   //------------------------------------------------------------------
   
  /*
   * fraseAleatoria (frases : String[]) : String
   * POST: Devuelve una frase aleatoria de <frases>
   */
   public static String fraseAleatoria(String[] ayy_lmao) {
	   
	   // Bueno, queremo una frase Aleatoria que no este vacia
	   // asi que tenemos que llamar a longitud
	   // como en longitud devolviamos i + 1 porque de verdad queriamos la longitud
	   // y no la posicion del elemento en cuestion
	   // Tenemos que restarle 1 al resultado de longitud
	   // Esto se puede cambiar todo si simplemnte cambiamos el return de longitud
	   // a return i; pero eso NO seria devolver la longitud
	   // Asi que esta basura es basura muy embasurada
	   // ALGORITMO:
	   int i = longitud(ayy_lmao) - 1; // Determinamos la longitud real de las frases
	   // Le restamos uno porque lo que nos interesa es el maximo indice al que podemos
	   // acceder, y no la longitud real del array de frases.
	   
	   int r = (int)(Math.random() * i); 
	   // Calculamos un numero aleatorio dentro del intervalo 0...i
	   
	   String frase = ayy_lmao[r]; // Ya hemos elegido una frase aleatoria
	   // y la hemos guardado en frase
	   
	   // Antipasta Scope hehe xd
	   {
		   
		   char[] bob = frase.toCharArray();
		   String hehe = bob.toString();
		   bob = hehe.toCharArray();
		   hehe = bob.toString();
		   
	   }
	   // Cuz antipasta
	   
	   return frase;
	   
   }
   //------------------------------------------------------------------
   
  /*
   * cargar (archivo : String; frases : String[])
   * EFECTO: Carga las frases de <archivo> en <frases>
   */
   public static void cargar(String archivo, String[] frases) {
	   
	   // Primero tenemos que preparar el archivo de entrada
	   In entrada = new In(archivo); // Lo Cargamos en memoria
	   
	   // Podriamos hacer esto de varias maneras, pero la verdad es que me da pereza;
	   // La manera mas sencilla seria usar frases = entrada.readAllStrings(); 
	   // que es una funcion que viene ya con la libreria.   
	   // esta funcion lo que hace es leer todos los datos del tipo String en el archivo
	   // y ponerlos en nuestras frases.
	   // El problema de esto, es que estaria mal, pq el profesor lo que quiere es que
	   // carguemos un maximo de Strings, porque cuando declara lasFrases
	   // esta usando un tamano maximo, lo cual es estupido
	   // pero bueno, supongo que lo hara para haceros pensar mas
	   // en cualquier caso, asi es como lo haria yo:

	   int c = 0; // Creamos un contador
	   while(!entrada.isEmpty() && c < frases.length) {
		   
		   frases[c] = entrada.readString();
		   c++; // lmao
		   
	   }
	   // Tambien se puede hacer con un bucle for
	   // pero seamos sinceros, queria hacer la bromita de c++
	   // y me quedaba mejor con un while xD
	   
   }
   //------------------------------------------------------------------
   
  /*
   * escribir (frases : String[])
   * EFECTO: Escribe <frases> en la salida estándar, 
   *         una por línea.
   */
  public static void escribir(String[] frases) {
	  
	  // Aqui tenemos que imprimir todas las frases en la salida estadar aka la consola
	  // Como ya sabeis, para estos casos no me gusta usar los for, prefiero los foreach
	  // Pero en cualquier caso, para que veais como funciona el foreach (si os da pereza
	  // mirar el e03) os voy a poner las dos maneras:
	  // Foreach:
	  
	  System.out.println("Escribiendo Frases");
	  
	  // Foreach:
	  //for(String s : frases) {
		  
		  //System.out.printf("%s%n", s);
		  // Esto es un printf:
		  // %s dice que queremos sustituir ese % con un dato del tipo String
		  // Por eso pasamos como argumento la 's'
		  // %n quiere decir que sustituimos el % con una nueva linea, equivalente a '\n'
		  // El equivalente println seria:
		  //System.out.println(s);
		  
	  //}
	  
	  // El bucle for equivalente a este foreach seria:
	  int len = longitud(frases); // calculamos la longitud de las frases
	  for(int i = 0; i < len; ++i/*/i++/i = i + 1*/) {
	   	String s = frases[i];
	   	System.out.println(s);
	  }
	  // uso longitud(frases) en lugar de frases.length pq no quiero imprimir los nulls
	  
  }
  //------------------------------------------------------------------
 
  // Main Method
  public static void main (String[] args)	{
	  
    // 1 - Cargar las frases:
	  
    cargar("misFrases.txt", lasFrases);  
    
    // 2 - Prueba: Escribir todas las frases:
    
    escribir(lasFrases);  
    
    // 2 - Escribir una frase aleatoria:
    
    System.out.println("La Frase Aleatoria: " + fraseAleatoria(lasFrases));
    
  } 
  //------------------------------------------------------------------
  
}
/*
 ⢠⠤⣤⠀⠤⡤⠄⢠⡤⢤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ 
⢸⠲⣏⠀⢀⡇⠀⢸⡗⠚⢀⣤⣶⣾⣿⣷⣶⣤⣄⠀⠀⣀⣤⣤⣴⣦⣤⡀⠀⠀⠀⠀⠀⠀⠀ 
⠈⠀⠈⠀⠉⠉⠁⠈⠁⣴⣿⣿⣿⡿⠿⣛⣛⠻⠿⣧⢻⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣫⣵⣾⣿⣿⣿⡿⠷⠦⠔⣶⣶⣶⣶⣶⠶⠶⠶⠤⡀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⠿⠛⢁⣀⣌⣿⣿⣷⣶⣈⠿⣒⣒⣭⣭⣭⣭⣑⣒⠄⠀⠀
⠀⠀⠀⠀⠀⠀⣠⡎⣾⣿⣿⣿⣿⢫⣡⡥⠶⠿⣛⠛⠋⠳⢶⣶⣾⣜⣫⣭⣷⠖⡁⠀⠐⢶⣯⡆⠀ 
⠀⠀⠀⣰⣿⣷⣿⣿⣿⣿⣿⣷⣖⢟⡻⢿⠃⢸⠱⠶⠀⠿⠟⡻⠿⣿⡏⠀⠅⠛⠀⣘⠟⠁⠀ ⠀
⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣮⣥⣤⣴⣤⣦⠄⣠⣾⣿⡻⠿⠾⠿⠿⠟⠛⠁⠀⠀⠀ ⠀
⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣭⣶⣿⣿⣿⣿⣿⣷⣿⣿⣿⣧⡀⠀⠀⠀⠀ ⠀
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀ ⠀
⢿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢩⡤⠶⠶⠶⠦⠬⣉⣛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⣋⣡⠀⠀⠀ ⠀
⠘⣿⣿⣿⣿⣿⣿⣟⢿⣧⣙⠓⢒⣚⡛⠳⠶⠤⢬⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⡄⠀⠀⠀⠀ ⠀
⠀⠈⠻⢿⣿⣿⣿⣿⣶⣽⣿⣿⣿⣿⣿⣿⣷⣶⣶⣶⣤⣤⣤⣤⣤⣤⡥⠄⠀⠀⠀⠀⠀⠀ 
⠀⠀⠀⠀⠐⠒⠭⢭⣛⣛⡻⠿⠿⠿⠿⣿⣿⣿⣿⣿⠿ ....3
 */
