package figura;
import stdlib.*;
import java.awt.Color;
/** 
 * Representa un rect�ngulo.
 * 
 * @since 17/04/2017  
 * @version 1.1    17/04/2018  Javier Galve
 * @author Javier Galve
 */
public class Rectangulo extends Figura
{
  private int anchura;
  private int altura;
  
  public Rectangulo (Punto centro, int anchura, int altura) 
  {
    super(centro);
    this.anchura = anchura;
    this.altura = altura;
  }
  
  public Rectangulo (Punto centro, int anchura, int altura, Color color) 
  {
     super(centro);
//    super(centro, color);
    this.anchura = anchura;
    this.altura = altura;
  }
  
  public Punto getCentro ()
  {
    return super.getPosicion();
  }  
  
  public int getAnchura() { 
    return anchura;
  }   
  
  public int getAltura() { 
    return altura;
  }   
  
  public String toString () 
  {
    return 
      "Rectangulo(" + super.toString() + 
      ", " + this.anchura + 
      ", " + this.altura + ")";
  }
  
  public boolean equals (Rectangulo r) 
  {
    return 
      super.equals(r.getCentro()) &&
      this.anchura==r.anchura &&
      this.altura==r.altura;
  }
  
  public int distA0 ()
  {
    return getCentro().distA0(); 
  }
  
  public int area ()
  {
    return this.anchura * this.altura;
  }
  
  public int perimetro ()
  {
    return 2 * this.anchura + 2 * this.altura;
  }
  
  public void pintar () 
  {
	  
	  StdDraw.rectangle(super.getPosicion().getX(), super.getPosicion().getY(), this.anchura / 2, this.altura / 2);
	  
  }  
  
  public void mover (int dx, int dy) 
  {
	  super.mover(dx, dy);
	  
  }
  
  public Figura traslacion (int dx, int dy) 
  {
    Rectangulo r = new Rectangulo(this.getCentro(), this.getPosicion().getX() + dx, this.getPosicion().getY() + dy, null);
    return r;
  }
  
}
