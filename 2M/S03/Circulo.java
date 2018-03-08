/**
 * Especificación del TAD Circulo<br>
 * @since 22/02/2018
 * @version 1.0
 * @author Rubén Aguado Cosano
 */
public interface Circulo{
  public final int DISJUNTAS = 1;
  public final int TANGENTES = 2;
  public final int SECANTES  = 3;
  /**
  * POST: resultado es la cadena de caracteres formada por los atributos del objeto
  */
  public String toString();
  /**
  * POST: resultado es el punto centro de la circunferencia
  */
  public Punto getCentro();
  /**
  * POST: resultado es el radio de la circunferencia
  */
  public double getRadio();
  /**
  * POST: modifica el punto centro de la circunferencia
  */
  public void setCentro(Punto centro);
  /**
  * POST: modifica el radio de la circunferencia
  */
  public void setRadio(double radio);
  /**
  * POST: devuelve verdadero si "c" es igual al objeto, falso e.o.c
  */
  public boolean esIgual(Circulo c);
  /**
  * POST: devuelve el circulo con el mismo centro, y la mitad de radio que el objeto
  */
  public Circulo concentricoMitad();
  /**
  * POST: devuelve el circulo simetrico al objeto con respecto al origen
  */
  public Circulo simetricoOrigen();
  /**
  * POST: devuelve un entero representativo de la posición relativa entre "c" y el objeto
  */
  public int posicionRelativa(Circulo c);
}
