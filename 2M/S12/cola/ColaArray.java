package cola;

/**
 * Implementaci'on del TAD Cola<br>
 * @since 26/4/18
 * @version 1.0
 * @author Ruben Aguado
 */
import java.util.Arrays;

public class ColaArray<E> implements Cola<E>{
  private final int MAX_ELEMENTOS = 10;
  private int ppo;
  private int fin;
  private E[] elementos;

  @SuppressWarnings("unchecked")
  public ColaArray (int n) throws MemoriaExcesiva{
    if (n > MAX_ELEMENTOS) {
      throw new MemoriaExcesiva();
    }
    elementos = (E[]) new Object[MAX_ELEMENTOS];
  }

  public String toString () {
    return "Cola [Principio: " + ppo + "; Fin: " + fin + "; Elementos: " + Arrays.toString(elementos) + "]";
  }

  public boolean estaVacia () {
    return ppo == fin;
  }

  public E primero() throws ColaVacia {
    if (estaVacia()) {
      throw new ColaVacia("No se puede devolver el primer elemento porque la cola esta vacia.");
    }
    return elementos[ppo];
  }

  public void encolar (E elem) throws ArrayIndexOutOfBoundsException {
    elementos[fin] = elem;
    fin++;
  }

  public void desencolar (){
    if (estaVacia()) {
      return;
    }
    elementos[ppo] = null;
    ppo++;
  }

  public int size() {
    return fin - ppo;
  }

}
