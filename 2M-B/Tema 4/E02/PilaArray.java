package e02;

/**
 * Implementaci�n de una pila acotada<br>
 * {@code PilaArray = (longitud : int, elementos : E[] )}<br>
 * {@code INV(p : PilaArray) = (longitud(p)>0) and
 *                             (longitud(p)<=MAX_ELEMENTOS)}<br>
 * @since 9/05/2016
 * @version 2.0  23/04/2018
 * @author JMB y JGF
 */
public class PilaArray<E>
{
  private int longitud;
  private E[] elementos;
  private static final int MAX_ELEMENTOS = 10;
  
  public static int maximoTamano () 
  {
    return MAX_ELEMENTOS;
  }
  @SuppressWarnings("unchecked")
  /*
   * PRE: n <= MAx_ELEMENTOS
   * POST: Crea una pila con un array de tama�o n.
   */
  public PilaArray (int n) throws MemoriaExcesiva
  {
    if (n > MAX_ELEMENTOS)
      throw new MemoriaExcesiva("");
    else
    {  
      longitud = 0;
      elementos = (E[])new Object[n];
    }
  }
  /*
   * POST: Comprueba si la pila es vacia
   */
  public boolean estaVacia ()
  {
    return this.longitud == 0;
  }
  /*
   * PRE: La pila no esta vacia
   * POST: Devuelve el elemento que esta en la cima de la pila.
   */
  public E cima () throws ArrayIndexOutOfBoundsException //PilaVaciaException
  {
    return this.elementos[longitud - 1];
  }
  /*
   * PRE: La pila no est� llena
   * EFECTO: A�ade el elemento "elem" a la cima de la pila
   */
  public void apilar (E elem) throws ArrayIndexOutOfBoundsException //PilaLlenaException
  {
	  
	  if(longitud < MAX_ELEMENTOS) {
		  
		  this.elementos[longitud] = elem;
		  ++longitud;
		  
	  }
	  else {
		  
		  System.out.println("Hubo un error...");
		  throw new ArrayIndexOutOfBoundsException();
		  
	  }
	  
  }
  /*
   * EFECTO: Elimina el elemento de la cima de la pila
   */
  public void desapilar () 
  {
	  
	  --longitud;
	  
  }
  /*
   * POST: Devuelve el n�mero de elementos de la pila.
   */
  public int size ()
  {
    return longitud;
  }
  /*
   POST: resultado es la cadena de caracteres formada por los
   atributos del objeto
   */
  public String toString ()
  {
    String resultado = "[";
    for (int i = 0; i < longitud; i++)
    {
      resultado = resultado + elementos[i];
      if (i < longitud-1)
        resultado = resultado + ", ";
    }
    resultado = resultado + "]";
    return "(" + longitud + ", " + resultado + ")";
  }
}