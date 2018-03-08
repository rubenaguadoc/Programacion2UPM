/**
 * Implementación del TAD Punto<br>
 * {@code Punto = (Entero x, y)}<br>
 * @since 19/2/2018
 * @version 1.0
 * @author JMB
 */
import java.text.DecimalFormat;  // para ajustar los decimales

public class PuntoTupla implements Punto
{
   private double x, y;

   public PuntoTupla (double abscisa, double ordenada)
   {
     x = abscisa;
     y = ordenada;
   }
   public double getX ()
   {
     return x;
   }
   public double getY ()
   {
     return y;
   }
   public void setX (double abscisa)
   {
     x = abscisa;
   }
   public void setY (double ordenada)
   {
     y = ordenada;
   }
  public String toString ()
  {
    DecimalFormat f = new DecimalFormat ("0.00");
    return "(" + f.format(x) + ";" + f.format(y) + ")";
  }
  public boolean esIgual (Punto a)
  {
    PuntoTupla p = (PuntoTupla) a;
    return (p.x == x) && (p.y == y);
  }
  public double distancia (Punto a)
  {
    PuntoTupla p = (PuntoTupla) a;
    return Math.sqrt ((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
  }
}
