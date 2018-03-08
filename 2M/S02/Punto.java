/**
 * Implementación del compuesto Punto<br>
 * {@code Punto = (Entero x, y)}<br>
 * @since 7/02/2017 > 13/2/17
 * @version 1.1
 * @author JMB
 */
import java.text.DecimalFormat;  // para ajustar los decimales

class Punto
{
// CONSTANTES  ------------------------------------------------------
// ATRIBUTOS  -------------------------------------------------------
   private double x, y;
// CONSTRUCTORES  ---------------------------------------------------
   public Punto (double abscisa, double ordenada)
   {
     x = abscisa;
     y = ordenada;
   }
// SELECTORES  ------------------------------------------------------
   public double getX ()
   {
      return x;
   }
   public double getY ()
   {
      return y;
   }
// MODIFICADORES  ---------------------------------------------------
   public void setX (double abscisa)
   {
      x = abscisa;
   }
   public void setY (double ordenada)
   {
      y = ordenada;
   }
// OPERACIONES  -----------------------------------------------------
/**
 * POST: resultado es la cadena de caracteres formada por los
 *       atributos del objeto
 */
  public String toString ()
  {
    DecimalFormat f = new DecimalFormat ("0.00");
    return "(" + f.format(x) + ";" + f.format(y) + ")";
  }
/**
 * POST: resultado es cierto si "a" es igual al objeto y
 *       es falso e.o.c.
 */
  public boolean esIgual (Punto a)
  {
    return (a.x == x) && (a.y == y);
  }
/**
 * PRE: cierto
 * POST: resultado es la distancia euclídea entre "p" y el objeto
 */
  public double distancia (Punto p)
  {
    return Math.sqrt ((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
  }
}
