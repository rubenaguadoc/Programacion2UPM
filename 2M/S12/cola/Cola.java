package cola;

/**
 * Especificaci�n del TAD Cola<br>
 * @since 24/4/18
 * @version 1.0
 * @author JMB
 */
public interface Cola<E>
{
/**
 * POST: resultado es la cadena de caracteres formada por los
 *       atributos del objeto.
 */
  public String toString ();
/**
 * POST: Comprueba si la cola esta vacia.
 */
  public boolean estaVacia ();
/**
 * PRE: La cola no esta vacia.
 * POST: Devuelve el primer elemento (el del extremo anterior).
 */
  public E primero() throws ColaVacia;
/**
 * POST: A�ade el elemento "elem" en el extremo posterior.
 */
  public void encolar (E elem) throws ArrayIndexOutOfBoundsException;
/**
 * POST: Elimina el primer elemento (el del extremo anterior).
*/
  public void desencolar ();
/*
 * POST: Resultado es el n�mero de elementos del objeto.
 */
  public int size();

}
