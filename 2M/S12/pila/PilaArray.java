package pila;

/**
 * Implementaci'on del TAD Pila<br>
 * @since 26/4/18
 * @version 1.0
 * @author Ruben Aguado
 */
import java.util.Arrays;

public class PilaArray<E> implements Pila<E>{
  private final int MAX_ELEMENTOS = 20;
  private int longitud;
  private E[] elementos;

  @SuppressWarnings("unchecked")
  public PilaArray(int n) throws MemoriaExcesiva {
    if (n > MAX_ELEMENTOS) {
      throw new MemoriaExcesiva("Pila demasiado grande, debe ser menor de " + MAX_ELEMENTOS);
    }
    elementos = (E[]) new Object[n];
  }

  public String toString () {
    return "Pila[Longitud: " + longitud + "; Longitud Maxima: " + MAX_ELEMENTOS + "; Elementos: " + Arrays.toString(elementos) + "]";
  }

  public boolean estaVacia () {
    return longitud == 0;
  }

  public E cima() throws ArrayIndexOutOfBoundsException {
    return elementos[longitud - 1];
  }

  public void apilar (E elem) throws ArrayIndexOutOfBoundsException {
    elementos[longitud] = elem;
    longitud++;
  }

  public void desapilar () throws ArrayIndexOutOfBoundsException {
    if (estaVacia()) {
      throw new ArrayIndexOutOfBoundsException();
    }
    elementos[longitud] = null;
    longitud--;
  }

  public int size() {
    return longitud;
  }

}
