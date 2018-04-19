package figura;
/** 
 * Representa un punto del plano cartesiano ZxZ.
 * 
 * @since 17/04/2017  
 * @version 1.1    17/04/2018  Javier Galve
 * @author Javier Galve
 */
public class Punto 
{
  int x;
  int y; 
  public Punto (int x, int y) 
  {
    this.x = x;
    this.y = y;
  }
  public int getX () 
  {
    return x;
  }  
  public int getY () 
  {
    return y;
  }  
  public String toString ()
  {  
    return new String("(" + x +  ", " + y + ")"); 
  }   
  public boolean equals (Punto p)
  {
    return x==p.x && y==p.y;
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
  public Punto traslacion (int dx, int dy) 
  {
    return new Punto(x + dx, y + dy);
  }
  
}


