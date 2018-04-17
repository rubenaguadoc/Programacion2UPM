package figura;
/**
 * Especificación del TAD Figura<br>
 * Representa figuras planas en una retícula entera<br>
 * @since 16/4/2018
 * @version 1.0
 * @author JGF y JMB
 */
public interface IFigura
{
/**
 * POST: resultado es la cadena de caracteres formada por los
 *       atributos del objeto
 */
  public String toString ();
/**
 * POST: resultado es el punto de referencia del objeto
 */  
  public Punto getPosicion ();
/**
 * POST: resultado es cierto si "f" es identico al objeto y es
 *       falso e.o.c.
 */
  public boolean equals (Figura f);
/**
 * POST: resultado es el minimo numero de pasos de reticula que hay del
 *       origen al objeto.
 */
  public int distA0 ();
/**
 * POST: resultado es el area del objeto.
 *       falso e.o.c.
 */
  public int area ();
/**
 * POST: resultado es el perimetro del objeto.
 */
  public int perimetro ();
/**
 * POST: Traslada el objeto segun (dx,dy)
 */
  public void mover (int dx, int dy);

}
