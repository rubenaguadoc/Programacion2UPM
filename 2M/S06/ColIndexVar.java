/**
 * Especificación de una colección acotada con ocupacion variable<br>
 * {@code elemento = Entero}<br>
 * @since 12/03/2018
 * @version 1.0
 * @author JMB
 */
public interface ColIndexVar
{
/**
 * POST: resultado es la cadena de caracteres formada por los
 *       atributos del objeto
 */
  public String toString ();
/**
 * POST: Resultado es el número de elementos del objeto.
 */
  public int size();
/**
 * PRE: pos IN [0,size()-1]
 * POST: resultado es el elemento del objeto que esta en la
 *       posición "pos".
 */
  public int get (int pos);
/**
 * PRE: pos IN [0,size()-1]
 * POST: modifica el elemento del objeto que esta en la posición "pos".
 */
  public void set (int pos, int elem);
/**
 * PRE: pos IN [0,size()]
 * POST: Añade el elemento "elem" al objeto, poniéndolo en la
 *       posicion "pos".
 */
  public void add (int pos, int elem);
/*
 * PRE: pos IN [0,size()-1]
 * POST: Elimina del objeto el elemento que está en la posición
 *       "pos". El objeto pasa a tener un elemento menos.
*/
  public void remove (int pos);
/*
 * POST: restaura la "col" con los valores de "origen".
*/
  public void restaurar (ColIndexVar inicial);

}