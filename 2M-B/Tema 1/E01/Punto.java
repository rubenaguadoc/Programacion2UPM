package t01.e01;

import java.text.DecimalFormat; 
import stdlib.*;



/** 
 * TAD Punto.
 * @since 26/02/2018
 * @version 1.0     
 * @author Javier Galve
 * 
 * Punto = (x, y : double) 
 *  INV (p : Punto) = p.x>=0 and p.y>=0
 * Representa un punto de coordenadas reales (x, y).
 */
public class Punto {
	
  private double x;
  private double y; 
  /**
   * POST: Constructor de Punto: Crea espacio en memoria 
   *       para un Punto.
   */
  public Punto () {
  }
  /**
   * POST: Constructor de Punto: Construye un dato 
   *       de tipo Punto a partir de las coordenadas 
   *       x e y.
   */
  public Punto (double x, double y) {
    this.x = x;
    this.y = y;
  }
  /**
   * toString () : String 
   * POST: Visualizador de Punto: convierte este 
   *       Punto a String.
   */
  public String toString () {
    DecimalFormat f = new DecimalFormat ("0.00");
    return "(" + f.format(x) + ", " + f.format(y) + ")";
  }
  /**
   * esIgual (p : Punto) : boolean
   * POST: Comparador de Punto: determina si este Punto 
   *       es igual a p.
   */
  public boolean esIgual (Punto p) {
    return x == p.x && y == p.y;
  } 
  /**
   * distanciaAlOrigen () : double
   * POST: Calcula la distancia de este Punto al origen de 
   *       coordenadas medida como pasos a dar sobre las X y las Y.
   */
  public double distanciaAlOrigen () {
    return x + y;
  }
  public double x () {
    return x;
  }  
  public double y () {
    return y;
  }  
  public void ponerX (double x) {
    this.x = x;
  }  
  public void ponerY (double y) {
    this.y = y;
  }  
  /**
   * mover (dx, dy : double)
   * EFECTO: Mueve este punto según (dx, dy).
   */
  public void mover (double dx, double dy) {
    x = x + dx;
    y = y + dy;
  }
  /**
   * traslacion (dx, dy : double) : Punto
   * POST: Crea el nuevo Punto que queda al trasladar ésta 
   *       (dx, dy).
   */
  public Punto traslacion (double dx, double dy) {
    return new Punto(x + dx, y + dy);
  }
  /**
   * pintar ()
   * EFECTO: Pinta este punto en el lienzo.
   */
  public void pintar () {
    StdDraw.point(x, y);
  }
  /**
   * clon () : Punto
   * POST: Crea un copia de este punto.
   */
  public Punto clon () {
    return new Punto(x, y);
  }
  
}

