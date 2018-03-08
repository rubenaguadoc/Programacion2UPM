/**
 * Especificación del TAD Punto<br>
 * @since 19/02/2018
 * @version 1.0
 * @author JMB
 */
public interface Punto
{
// OPERADORES  ------------------------------------------------------
/**
 * POST: resultado es la cadena de caracteres formada por los
 *       atributos del objeto
 */
  public String toString ();
/**
 * POST: resultado es la abscisa del objeto
 */
   public double getX ();
/**
 * POST: resultado es la ordenada del objeto
 */
   public double getY ();
/**
 * POST: Modifica la abscisa del objeto por "abscisa"
 */
   public void setX (double abscisa);
/**
 * POST: Modifica la ordenada del objeto por "ordenada"
 */
   public void setY (double ordenada);
/**
 * POST: resultado es cierto si el punto "a" es igual al objeto y
 *       es falso e.o.c.
 */
  public boolean esIgual (Punto a);
/**
 * POST: resultado es la distancia euclídea entre "p" y el objeto
 */
  public double distancia (Punto p);
}
