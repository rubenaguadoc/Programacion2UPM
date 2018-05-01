package e02;



import stdlib.*;
/**
 * Prueba de una pila acotada de enteros<br>
 * @since 9/05/2016
 * @version 2.1  24/04/2018
 * @author JMB y JGF
 */

public class PilaArrayTest {
  
  static PilaArray<Integer> pde0; //pde = pila-de-enteros
  static PilaArray<Integer> pde0erronea;
  static PilaArray<Integer> pde1;
  static PilaArray<Integer> pde2;
  static PilaArray<Integer> pde3;
  static PilaArray<Integer> pde5;
  
  public static void resetearPilas ()
  {  
    try
    {
      pde0 = new PilaArray<Integer>(10);
      pde1 = new PilaArray<Integer>(10);
      pde2 = new PilaArray<Integer>(10);
      pde3 = new PilaArray<Integer>(10);
      pde5 = new PilaArray<Integer>(5);
      //pde0erronea = new PilaArray<Integer>(PilaArray.maximoTama�o()+1); //Salta excepci�n
    }
    catch (MemoriaExcesiva e)
    {
      System.out.println(" Error en constructor de PilaArray");
      e.printStackTrace(); //Para saber en qu� l�nea se produce el error.
    }
  }
  public static void cargarPilas () {
    resetearPilas();
    
    pde1.apilar(1); 
    
    pde2.apilar(1); 
    pde2.apilar(3); 
    
    pde3.apilar(1); 
    pde3.apilar(3); 
    pde3.apilar(5); 
    
    pde5.apilar(1); 
    pde5.apilar(3); 
    pde5.apilar(5); 
    pde5.apilar(7);
    pde5.apilar(9);
  }
  public static void mostrar ()
  {
    System.out.println("pde0 = " + pde0);
    System.out.println("pde1 = " + pde1);
    System.out.println("pde2 = " + pde2);
    System.out.println("pde3 = " + pde3);
    System.out.println("pde5 = " + pde5);
  }
  static boolean pruebaEstaVacia ()
  {
    return false;
  }
  static void pruebaApilar ()
  {
    resetearPilas();
    cargarPilas();
    try
    {   
      pde0.apilar(50);
      pde1.apilar(100);
      pde2.apilar(150);
      pde3.apilar(200);
      pde5.apilar(250); //saltara ArrayIndexOutOfBoundsException - PilaLlenaException
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println ("Error en: apilar -> PilaLlena");
      mostrar();
      e.printStackTrace(); //Para saber en qu� l�nea se produce el error.
    }
  }
  static void pruebaDesapilar ()
  {
    resetearPilas();
    cargarPilas();
    //desapilar NO hace saltar ninguna excepci�n!
    pde0.desapilar(); //no provoca ning�n efecto en pde0
    pde1.desapilar();
    pde2.desapilar();
    pde3.desapilar();
    pde5.desapilar(); 
    mostrar();
  }
  public static void apilar0YDesapilar1 () 
  {
    resetearPilas();
    try 
    {
      System.out.println("cima de la pila = " + pde0.cima());
    }
    catch (ArrayIndexOutOfBoundsException e) 
    {
      System.out.println ("Error en: apilar0YDesapilar1");
    }
  }
  public static void apilar2YDesapilar3 () 
  { 
  }
  public static void apilar3YDesapilar3 () 
  { 
  }
    /*
   * ACCI�N escribirAlReves () 
   * EFECTO: 
   *   Lee n�meros de la entrada est�ndar y los escribe al rev�s.
   *   Los n�meros vienen separados por espacios o saltos
   *   de l�nea. 
   *   El final viene marcado con <ctrl><d>.
   * PAUTA:
   *   Utilizar un pila PilaArray<Integer>
   */
  public static void escribirAlReves () 
  { 
	  
	  try {
		  
		PilaArray<Integer> pa = new PilaArray<Integer>(10);
		for(int i = 0; i < 10; ++i) {
			
			pa.apilar(StdIn.readInt());
			
		}
		System.out.println(pa.toString());
		String str = "(" + pa.maximoTamano() + ", [";
		for(int i = 0; i < 10; ++i) {
			
			str += (pa.maximoTamano() == i + 1)? pa.cima() : pa.cima() + ", ";
			pa.desapilar();
			
			
		}
		
		str += "])";
		System.out.println(str);
		
	} 
	catch (MemoriaExcesiva e) {
		
		e.printStackTrace();
		
	}
	  
  }
  public static void main (String[] args) 
  {
    //Las pruebas son independientes entre s�.
    //Ejecutar bloque a bloque tapando y destapando. 
    //Cada bloque viene separado con un comentario de l�nea "//".
    //
    resetearPilas();
    cargarPilas();
    mostrar();
    //
    System.out.println("apilar0YDesapilar1();");
    apilar0YDesapilar1();
    //
    System.out.println("apilar2YDesapilar3();");
    apilar2YDesapilar3();
    //
    System.out.println("apilar3YDesapilar3();");
    apilar2YDesapilar3();
    //
    System.out.println("pruebaEstaVacia() = " + pruebaEstaVacia());
    //
   System.out.println("pruebaApilar();");
   pruebaApilar();
    //
    System.out.println("pruebaDesapilar();");
    pruebaDesapilar();
    //
    System.out.println("escribirAlReves();");
    escribirAlReves();
  } 
}