package figura;
/**
 * Implementación de una Figura-->Circulo<br>
 * {@code Circulo = (int radio)}<br>
 * @since 16/4/2018
 * @version 1.0
 * @author JGF y JMB
 */
public class Circulo extends Figura
{
  private int radio;
  
  public Circulo (Punto centro, int rad)
  {
    super(centro);
    radio = rad;
  }
  public String toString ()
  {
    return "Circulo(" + super.toString() + ", " + radio + ")";
  }
  public Punto getCentro ()
  {
    return super.getPosicion();
  }  
  public int getRadio ()
  {
    return radio;
  }  
  public boolean equals (IFigura f) 
  {
    Circulo c = (Circulo) f;
    return super.equals(c.getCentro()) && (radio == c.radio);
  }
  public int distA0 ()
  {
    return getCentro().distA0(); 
  }
  public int area ()
  { 
    return (int)(Math.PI*radio*radio);
  }
  public void mover (int dx, int dy)
  {
    super.getPosicion().mover(dx,dy);
  }

}