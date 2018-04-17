package figura;
/**
 * Implementación del TAD Figura<br>
 * Representa figuras planas en una retícula entera<br>
 * {@code Figura = (Punto posicion)}<br>
 * @since 16/4/2018
 * @version 1.0
 * @author JGF y JMB
 */
public class Figura implements IFigura
{
  private Punto posicion;

  public Figura (Punto pos) 
  {
    posicion = pos;
  }
  public String toString ()
  {
    return "Figura(" + posicion.toString() + ")";
  }
  public Punto getPosicion ()
  {
    return posicion;
  }  
  public boolean equals (Figura f) 
  {
    return posicion.equals(f.posicion);
  }
  public int distA0 ()
  {
    return posicion.distA0(); 
  }
  public int area ()
  { 
    return 0;
  }
  public int perimetro ()
  { 
    return 0;
  }
  public void mover (int dx, int dy) 
  {
    posicion.mover(dx, dy);
  }

}
