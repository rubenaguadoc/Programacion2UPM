package pila;

/**
 * Especificaci�n del TAD Pila<br>
 * @since 9/05/2016 -> 23/4/18
 * @version 1.1
 * @author JMB
 */
public interface Pila<E>
{
/**
 * POST: resultado es la cadena de caracteres formada por los
 *       atributos del objeto
 */
  public String toString ();
/**
 * POST: Comprueba si la pila esta vacia
 */
  public boolean estaVacia ();
/**
 * PRE: La pila no esta vacia
 * POST: Devuelve el elemento que esta en la cima de la pila.
 */
  public E cima() throws ArrayIndexOutOfBoundsException;
/**
 * POST: A�ade el elemento "elem" a la cima de la pila
 */
  public void apilar (E elem) throws ArrayIndexOutOfBoundsException;
/**
 * POST: Elimina el elemento de la cima de la pila
*/
  public void desapilar ();
/*
 * POST: Resultado es el n�mero de elementos del objeto.
 */
  public int size();

}
