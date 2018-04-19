package figura;
import stdlib.*;
//import java.awt.Color;
/** 
 * Representa figuras geom�tricas.
 * 
 * @since 17/04/2017  
 * @version 1.1    17/04/2018  Javier Galve
 * @author Javier Galve
 */
public class Figura implements IFigura 
{
  private Punto posicion;
  //private Color color;
  public Figura (Punto posicion) 
  {
    this.posicion = posicion;
  }
//  public Figura (Punto posicion, Color color) 
//  {
//    this.posicion = posicion;
//    this.color = color;
//  }
  public Punto getPosicion ()
  {
    return posicion;
  }  
//  public Color getColor ()
//  {
//    return color;
//  }  
  public String toString ()
  {
    return "Figura(" + posicion.toString() + ")";
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
  //public int area (); //solo si se declara abstract!!
  public int perimetro ()
  { 
    return 0;
  }
  public void pintar () 
  {
  }  
  public void mover (int dx, int dy) 
  {
	  
	  this.getPosicion().mover(dx, dy);
	  // OR
	  this.posicion.x += dx;
	  this.posicion.y += dy;
	  
  }
  public Figura traslacion (int dx, int dy)
  {
    return null;
  }

}
