package t00.e03;


/** 
 * Implementación de Algoritmos de Ordenación.
 * @author Javier Galve
 * @since 6/02/2017
 * @version 1.2.1   7/02/2017
 */

public class Ord	{
	
  //Método de la BURBUJA
  private static void permutar(int[] a, int i, int j) { 
	  
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
    
  }
  //-----------------------------------------------------------------
  
  private static void burbujaArriba(int[] a, int pos) { 
	  
    for (int i=a.length-1; i>=pos+1; i--) {
    	
    	if (!(a[i-1] <= a[i])) {
    		
  	      permutar (a, i-1, i);
    		
    	}
    	
    }
      
  }
  //-----------------------------------------------------------------
  
  /*
   * ACCIÓN ordenarBurbuja (Entero[] a)
   * EFECTO: Ordena a de manera creciente por el método 
   *         de la burbuja.
   */
  public static void ordenarBurbuja (int[] a) { 
	  
    for (int i=0; i<a.length; i++) {
    	
        // Poner en su sitio el elemento desordenado más pequeño:
        burbujaArriba (a, i);
        // Encoger la parte desordenada del array 
    	
    }
    // (avanzando con la i).
  }
  //-----------------------------------------------------------------
  
  
  /*
   * FUNCIÓN aString (Entero[] a)--> String
   * POST: Visualizador de un array de enteros: 
   *       convierte los datos del array en un String.
   */
  public static String aString(int[] a) {

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
  
  //Método de SELECCIÓN
  /*
   * FUNCIÓN posicionDelMinimo (Entero[], Natural inicio) --> Natural
   * PRE: longitud(a) >= 1
   * POST: Calcula la posición del elemento más pequeño del subarray 
   *       a[inicio..longitud(a)-1]
   */
  private static int posicionDelMinimo (int[] a, int inicio) { 
  
	  int posMin = inicio;
	  for (int i = inicio+1; i<=a.length-1; i++) {
		  
		  if (a[i] < a[posMin]) {
			
			  posMin = i;
		  
		  }
		  
	  }
	  
	  return posMin;
  
  }
  
  /*
   * ACCIÓN ordenarSeleccion (Entero[] a)
   * EFECTO: Ordena a de manera creciente por el método 
   *         de selección.
   */
  public static void ordenarSeleccion (int[] a) {
	  
    int posMin;  
    for (int i = 0; i<=a.length-1; i++) {
    	
      //En cada iteracion, un elemento es incorporado 
      //a su lugar correcto.
      //Buscar la posicion del elemento desordenado 
      //más pequeño:
      posMin = posicionDelMinimo(a, i); 
      //Poner el minimo en el sitio correcto
      permutar(a, i, posMin);
      
    }         
    
  }
  //-----------------------------------------------------------------
  
  //Método de INSERCIÓN
  /*
   * FUNCIÓN posicionDondePonerlo (Entero[] a, 
   *                               Natural fin, 
   *                               Natural valor) --> Natural
   * PRE: longitud(a[0..fin]) >= 1 /\ a[0..fin] está ordenado 
   *      crecientemente
   * POST: Calcula la posición del primer elemento de "a[0..fin]" 
   *       mayor que "valor"
   */
  private static int posicionDondePonerlo (int[] a, int fin, int valor) { 
	  
    int i = 0;  
    boolean encontrado = false;  
    
    while (i <= fin && !encontrado) {
    	
      if (a[i] > valor) {
    	  
        encontrado = true;
        
      }    
      else {
    	  
        i = i + 1;
      
      }  
      
    }
    
    return i;
  
  }
  //-----------------------------------------------------------------
  
  
  private static void abrirHueco (int[] a, int inicio, int fin) { 
	  
    for (int i = fin; i>=inicio; i--) {
    	
      a[i+1] = a[i];
      
    }
    
  }
  //-----------------------------------------------------------------
  
  /*
   * ACCIÓN ordenarInsercion (Entero[] a)
   * EFECTO: Ordena a de manera creciente por el método 
   *         de inserción.
   */
  public static void ordenarInsercion (int[] a) {
	  
    int valor;  
    int pos;  
    for (int i = 1; i<=a.length-1; i++) {
    	
	// La parte ordenada tiene un el. al ppio
	// En cada iteracion, el primer elemento de la parte 
	// desordenada es insertado en la parte ordenada (a[0..i-1]).
	// Buscar la posicion del primer elemento mayor: 
	// que el actual:
      pos = posicionDondePonerlo(a, i-1, a[i]);
      valor = a[i];
      //Abrir hueco para poner el elemento:
      abrirHueco(a, pos, i-1);
      //Insertar el valor actual:
      a[pos] = valor;
      
    }
    
  }
  //-----------------------------------------------------------------
  
  
}  
