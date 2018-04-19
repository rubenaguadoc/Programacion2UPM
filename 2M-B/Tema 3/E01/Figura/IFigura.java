package figura;
//import java.awt.Color;
/** 
 * Representa figuras geométricas (Interfaz).
 * 
 * @since 17/04/2017  
 * @version 1.1    17/04/2018  Javier Galve
 * @author Javier Galve
 */
public interface IFigura
{
  public Punto getPosicion ();
//  public Color getColor ();
  public String toString ();
  public boolean equals (Figura f);
  public int distA0 ();
  public int area ();
  public int perimetro ();
  public void pintar ();
  public void mover (int dx, int dy);
  public Figura traslacion (int dx, int dy);
}
