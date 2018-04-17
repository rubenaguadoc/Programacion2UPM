package figura;
/**
 * Implementación de una Figura-->Dot<br>
 * Un Dot es un elemento de la reticula ZxZ
 * @since 16/4/2018
 * @version 1.0
 * @author JGF y JMB
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
  public boolean equals (IFigura f) 
  {
    Dot d = (Dot) f;
    return super.getPosicion().equals(d.getPosicion());
  }
  public int distA0 ()
  {
    return super.getPosicion().distA0();
  }
  
}