package t01.e04;

import java.awt.Color;

import stdlib.StdDraw;
import t01.e01.Punto;
/**
 * Circulo = (centro : Punto, radio : double)
 * Representa un círculo en la pantalla.
 * Un círculo viene definido por su centro, de coordenadas reales
 * y su radio (double).
 * 
 * @since   24/03/2017
 * @version 1.1   26/03/2018
 * @author Javier Galve
 */
public class Circulo
{
  private Punto centro;
  private double radio;
  private Color color;
  
  public Circulo (Punto centro, double radio)
  {
    this.centro = centro;
    this.radio = radio;
    this.color = Color.BLACK;
  } 
  public Circulo (Punto centro, double radio, Color color)
  {
    this.centro = centro;
    this.radio = radio;
    this.color = color;
  } 
  public Punto centro () { 
    return centro;
  }   
  public double radio () { 
    return radio;
  }   
  public Color color () { 
    return color;
  }   
  public void ponerCentro (Punto centro) { 
    this.centro = centro;
  }   
  public void ponerRadio (double radio) { 
    this.radio = radio;
  }   
  public void ponerColor (Color color) { 
    this.color = color;
  }   
  /**
   * toString () : String 
   * POST: Visualizador de Circulo.
   */
  public String toString () {
    return "(" + centro.toString() + ", " + radio + ")";
  }
  /**
   * esIgual (c : Circulo) : boolean
   * POST: Comparador de Circulo: determina si este Circulo
   *       es igual a c.
   */
  public boolean esIgual (Circulo c) {
    return 
      centro.esIgual(c.centro) && 
      radio == c.radio;
  }  
  /**
   * distanciaAlOrigen () : double
   * POST: Calcula la distancia de este Circulo al origen de 
   *       coordenadas medida como pasos a dar sobre las X y las Y.
   */
  public double distanciaAlOrigen () {
    return centro.distanciaAlOrigen();
  }
  /**
   * mover (dx, dy : double)
   * EFECTO: Mueve este circulo según (dx, dy).
   */
  public void mover (int dx, int dy) {
    this.centro.mover(dx, dy);
  }
  /**
   * traslacion (dx, dy : double) : Punto
   * POST: Crea el nuevo Circuloque queda al trasladar éste 
   *       (dx, dy).
   */
  public Circulo traslacion (int dx, int dy) {
    return new Circulo(centro.traslacion(dx, dy), radio, color);
  }
  /**
   * pintar ()
   * EFECTO: Pinta este circulo en el lienzo.
   */
  public void pintar () {
    StdDraw.setPenColor(color);
    StdDraw.circle(centro.x(), centro.y(), radio);
    StdDraw.setPenColor(StdDraw.BLACK);
  }  
  /**
   * pintarRelleno ()
   * EFECTO: Pinta este circulo con relleno en el lienzo.
   */
  public void pintarRelleno () {
    StdDraw.setPenColor(color);
    StdDraw.filledCircle(centro.x(), centro.y(), radio);
    StdDraw.setPenColor(StdDraw.BLACK);
  }  
  /**
   * concentricoInterior (d : double) : Circulo 
   * POST: Crea un nuevo Circulo concentrico interior a éste a 
   *       una distancia d.
   */
  public Circulo concentricoInterior (double d) {
    return new Circulo(centro.clon(), radio-d);
  }

}

__$$_$__________$_$$
_$$_$_$________$_$__$
_$$__$__$______$_$___$
__$___$__$____$_$____$
_ _$__$__$___$__$____$
___$___$__$__$__$$__$
___$$__$__$§$$$__§_$
____$___________$§$
_____$$__________$$
_____$$___________$....
_____$____________$
_____$_§$________$§_____$$$$$$$$$
_____$_§:-)______:-)§$__$$_________$$
____$_$$§___________$______________$$
____o_______________$$_______________$$
____$________________$_____$__________$$
____$$_____$$$$$___$$______$___________$$
___$__$$§___$$$___§$_________$$________$$___$$
___$_____$___$___$________$$____$_____$$__$$$$
___$$__$___$$$$$__$_____$$______$____$$$$$$$
___$$__$_________$___$$________$____$$
____$$$$$________$$$$$________$$$$$$
