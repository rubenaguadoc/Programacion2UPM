package t01.e01;

import stdlib.*;
/** 
 * Programa PuntoGrafico. 
 * Aplicación gráfica con Punto.
 * 
 * @since 2/02/2016
 * @version 1.2       26/02/2018
 * @author Javier Galve  
 */

public class PuntoGrafico {
  
  public static void iniciarGraficos () 
  {  
    StdDraw.enableDoubleBuffering();
    StdDraw.setXscale(0, 100);
    StdDraw.setYscale(0, 100);
    StdDraw.setPenRadius(0.05);
  }  
  public static void animarPunto (Punto p) 
  {
    StdDraw.clear();
    p.pintar();
    StdDraw.show();
    StdDraw.pause(500);
  }
  public static void animacion () 
  {
    PuntoPrueba.resetear();
    iniciarGraficos();   
    StdDraw.pause(3000);
    for (int i = 1; i<=25; i++)
    {  
      animarPunto(PuntoPrueba.p0);
      PuntoPrueba.p0 = PuntoPrueba.p0.traslacion(5, 5);
    }
  }  
  public static void main (String[] args) {
    animacion();   
  }  
  
}
