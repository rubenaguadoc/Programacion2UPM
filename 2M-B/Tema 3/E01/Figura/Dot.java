package figura;

import stdlib.StdDraw;

/** 
 * Representa un p�xel en la pantalla.
 * 
 * @since 17/04/2017  
 * @version 1.1    17/04/2018  Javier Galve
 * @author Javier Galve
 */
public class Dot extends Figura
{
  public Dot (Punto posicion) 
  {
    super(posicion);
  }
  public String toString ()
  {
    return "Dot(" + super.toString() + ")";
  }
  public boolean equals (Dot d)
  {
    return super.getPosicion().equals(d.getPosicion());
  }
  public int distA0 ()
  {
    return super.getPosicion().distA0();
  }
  public int area ()
  {
    return 0; 
  }
  public int perimetro ()
  {
    return 0; 
  }
  
  public void pintar () 
  {
	  
	  StdDraw.point(this.getPosicion().getX(), this.getPosicion().getY());
	  
  }  
  
  public void mover (int dx, int dy) 
  {
	  
	  super.mover(dx, dy);
	  
  }
  @Override
  public Dot traslacion (int dx, int dy) 
  {
	  
	Punto p = new Punto(this.getPosicion().x + dx, this.getPosicion().y + dy);
    Dot d = new Dot(p);
    return d;
    
  }
  
}
