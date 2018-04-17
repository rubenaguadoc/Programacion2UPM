package figura;
/**
 * Implementación del TAD Punto<br>
 * Representa un punto de una retícula entera<br>
 * {@code Punto = (int x, int y)}<br>
 * @since 16/4/2018
 * @version 1.0
 * @author JGF y JMB
 */
public class Punto implements IPunto
{
  private int x;
  private int y; 

  public Punto (int x1, int y1) 
  {
    x = x1;
    y = y1;
  }
  public String toString ()
  {  
    return new String("(" + x +  ", " + y + ")"); 
  } 
  public int getX ()
  {
    return x;
  }  
  public int getY ()
  {
    return y;
  }    
  public boolean equals (IPunto pp)
  {
    Punto p = (Punto) pp;
    return (x == p.x) && (y == p.y);
  }
  public int distA0 () 
  {
    return x + y; 
  }
  public void mover (int dx, int dy) 
  {
    x = x + dx;
    y = y + dy;
  }
  
}