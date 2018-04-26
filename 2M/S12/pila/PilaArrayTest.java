package pila;

/**
 * Prueba de la implementacion de Pila, PilaArray<br>
 * @since 9/05/2016 --> 23/4/18
 * @version 2.0
 * @author JMB y JGF
 */
public class PilaArrayTest
{
//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------

  static Pila<Integer> pde0; //pde = pila-de-enteros
  static Pila<Integer> pde0erronea;
  static Pila<Integer> pde1;
  static Pila<Integer> pde2;
  static Pila<Integer> pde3;
  static Pila<Integer> pde5;

  public static void resetearPilas ()
  {
    try
    {
      pde0 = new PilaArray<Integer>(10);
      pde1 = new PilaArray<Integer>(10);
      pde2 = new PilaArray<Integer>(10);
      pde3 = new PilaArray<Integer>(10);
      pde5 = new PilaArray<Integer>(5);
      //pde0 erronea = new PilaArray<Integer>(20); //Salta excepci�n
    }
    catch (MemoriaExcesiva e)
    {
      System.out.println(" Error en constructor de PilaArray");
      e.printStackTrace(); //Para saber en qu� l�nea se produce el error.
    }
  }
  public static void cargarPilas ()
  {
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
    System.out.println("pde0 -> " + pde0);
    System.out.println("pde1 -> " + pde1);
    System.out.println("pde2 -> " + pde2);
    System.out.println("pde3 -> " + pde3);
    System.out.println("pde5 -> " + pde5);
  }
  public static void apilar0Enteros ()
  {
    resetearPilas();
    try
    {
      System.out.println("cima de la pila = " + pde0.cima());
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println ("Error en apilar0Enteros() --> No hay cima");
    }
  }
  public static void apilar3Enteros ()
  {
    resetearPilas();
    System.out.println("  Apilando en pde3  ");
    pde3.apilar(200);
    System.out.println("apilar(200) ==> Cima: " + pde3.cima());
    pde3.apilar(300);
    System.out.println("apilar(300) ==> Cima: " + pde3.cima());
    pde3.apilar(400);
    System.out.println("apilar(400) ==> Cima: " + pde3.cima());
    try
    {
      System.out.println("  Desapilando en pde3  ");
      pde3.desapilar();
      System.out.println("desapilar() ==> Cima: " + pde3.cima());
      pde3.desapilar();
      System.out.println("desapilar() ==> Cima: " + pde3.cima());
      pde3.desapilar();
      //Destapar la l�nea siguiente para comprobar error:
      //System.out.println("desapilar() ==> Cima: " + pde3.cima());
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println ("Error en apilar3Enteros() --> No hay cima");
      //e.printStackTrace();
    }
  }
  static boolean pruebaEstaVacia ()
  {
    resetearPilas();
    cargarPilas();
    return
      pde0.estaVacia() == true &&
      pde2.estaVacia() == false &&
      pde3.estaVacia() == false &&
      pde5.estaVacia() == false ;
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
      //pde5.apilar(250); // PilaLlena
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.println ("Error en apilar() --> PilaLlena");
      mostrar();
      //e.printStackTrace(); //Para saber en qu� l�nea se produce el error.
    }
  }
  static void pruebaDesapilar ()
  {
    resetearPilas();
    cargarPilas();

    pde0.desapilar(); //no provoca ning�n efecto en pde0
    pde1.desapilar();
    pde2.desapilar();
    pde3.desapilar();
    pde5.desapilar();
    mostrar();
  }

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args) throws MemoriaExcesiva
  {
    resetearPilas();
    cargarPilas();
    mostrar();
    apilar0Enteros();
    apilar3Enteros();
    System.out.println("  pruebaEstaVacia() = " + pruebaEstaVacia());
    System.out.println("  pruebaApilar()  ");
    pruebaApilar();
    System.out.println("  pruebaDesapilar()  ");
    pruebaDesapilar();
  }
}
