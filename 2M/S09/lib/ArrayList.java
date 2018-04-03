package lib;

import java.util.Arrays;

/**
 * Implementaci�n del TAD List mediante un array (ArrayList).
 * @since 07/03/2018
 * @version 1.0.1     14/03/2018   JGF
 * @author JMB y JGF
 *
 */
public class ArrayList<E> implements ListInterface<E>
{
  private static final int TAMANO = 100;
  private E[] elementos;
  private int longitud;

  @SuppressWarnings("unchecked")
  public ArrayList() {
    elementos = (E[]) new Object[TAMANO];
    longitud = 0;
  }
  public String toString ()
  {
    String resultado = "[";
    for (int i = 0; i < longitud; i++)
    {
      resultado = resultado + elementos[i];
      if (i < longitud-1)
        resultado = resultado + ",";
    }
    resultado = resultado + "]";
    return "(" + longitud + "," + resultado + ")";
  }
  public void add (int index, E element)
    throws IndexOutOfBoundsException
  {
    if (index < 0 || index > size())
      throw new IndexOutOfBoundsException("" + index);
    else
    {
      for (int i = longitud; i > index; i--)
        elementos[i] = elementos[i-1];
      elementos[index] = element;
      longitud = longitud + 1;
    }
  }
  public E get (int index) throws IndexOutOfBoundsException
  {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("" + index);
    else
      return (E)elementos[index];
  }
  public int size()
  {
    return longitud;
  }
  public void set (int index, E element)
    throws IndexOutOfBoundsException
  {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("" + index);
    else
      elementos[index] = element;
  }
  public int indexOf (E element)
  {
    int i = 0;
    boolean esta = false;
    while ((i < longitud) && !esta)
      if (element == elementos[i])
      esta = true;
    else
      i = i + 1;
    return (esta)? i : -1;
  }
  public void removeElementAt (int index)
    throws IndexOutOfBoundsException
  {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("" + index);
    else
    {
      for (int i = index; i < longitud-1; i++)
        elementos[i] = elementos[i+1];
      longitud = longitud - 1;
    }
  }
  public boolean remove (E elem)
  {
    int pos = indexOf(elem);
    boolean encontrado;
    if (pos <= -1)
      encontrado = false;
    else
    {
      encontrado = true;
      removeElementAt(pos);
    }
    return encontrado;
  }

}
