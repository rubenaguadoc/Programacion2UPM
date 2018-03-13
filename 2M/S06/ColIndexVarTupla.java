/**
 * Implementacion de una coleccion acotada con ocupacion variable<br>
 * @since 13/03/2018
 * @version 1.0
 * @author RAC
 */

import java.util.Arrays;

public class ColIndexVarTupla implements ColIndexVar {
  private int[] elementos;
  private int longitud;
  private int longitudInit;

  public ColIndexVarTupla(int lon){
    longitudInit = lon;
    elementos = new int[lon];
    longitud = 0;
  }

  public String toString () {
    return Arrays.toString(elementos);
  }

  public int size() {
    return longitud;
  }

  public int get (int pos) {
    return elementos[pos];
  }

  public void set (int pos, int elem) {
    elementos[pos] = elem;
  }

  public void add (int pos, int elem) {
    for (int i = longitud; i > pos; i--) {
      elementos[i] = elementos[i - 1];
    }
    elementos[pos] = elem;
    longitud++;
  }

  public void remove (int pos) {
    for (int i = pos; i < longitud; i++) {
      elementos[i] = elementos[i + 1];
    }
    longitud--;
  }

  public void restaurar (ColIndexVar inicial) {
    elementos = new int[longitudInit];
  }
}
