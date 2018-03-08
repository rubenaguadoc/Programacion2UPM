/**
 * Especificacion del TAD Tension<br>
 * @since 06/03/2018
 * @version 1.0
 * @author Ruben Aguado Cosano
 */
public interface Tension {
  /**
  * POST: resultado es la cadena de caracteres formada por los atributos del objeto
  */
  public String toString();
  /**
  * POST: resultado es la presion alta del objeto
  */
  public double getAlta();
  /**
  * POST: resultado es la presion baja del objeto
  */
  public double getBaja();
  /**
  * POST: devuelve verdadero si la presión baja se encuentre en el intervalo [7,9] y la alta en el [12,14], falso e.c.o.c.
  */
  public boolean esNormal();
  /**
  * POST: devuelve verdadero si la presión baja se encuentre por encima del intervalo [7,9] o la alta por encima del [12,14], falso e.c.o.c.
  */
  public boolean esAlta();
  /**
  * POST: devuelve la diferencia entera entre la tension alta y la baja del objeto
  */
  public int pulso();
  /**
  * POST: devuelve verdadero si la presion baja y la presion alta del objeto son iguales a las del objeto c, falso e.c.o.c
  */
  public boolean esIgual(Tension c); // Comparador
}
