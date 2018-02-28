/** 
 * Pruebas del TAD PuntoTupla<br>
 * @since 19/2/2018
 * @version 1.0
 * @author JMB  
 */

public class PuntoTuplaTest
{
//  OPERACIONES PARTICULARES  ---------------------------------------
/**
 * PRE: "p" está creado
 * POST: resultado es "p" actualizado con los valores
 *       (abscisa,ordenada) para (x,y).
 */ 
  static Punto setPunto (Punto p, double abscisa, double ordenada)
  {
    p.setX(abscisa);
    p.setY(ordenada);
    return p;
  }   
//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------
  
  static Punto p00 = new PuntoTupla(0.0,0.0);
  static Punto p34 = new PuntoTupla(3.0,4.0);
  static Punto p30 = new PuntoTupla(3.0,0.0);
  static Punto p54 = new PuntoTupla(5.0,4.0);
  static Punto p34Bis = new PuntoTupla(3.0,4.0);
  
//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  static double prueba1_1 = p34.getX();
  static double prueba1_2 = p34.getY();
  static boolean prueba1_getters =
    (prueba1_1 == 3.0) && (prueba1_2 == 4.0);

  static Punto p34Bis1 = setPunto(p34Bis,-6.0,-8.0);
    // Se modifica "p34Bis"
  
  static double prueba2_1 = p34Bis.getX();
  static double prueba2_2 = p34Bis.getY();
  static boolean prueba2_setters =
    (prueba2_1 == -6.0) && (prueba2_2 == -8.0);  
  
  static Punto p34Bis2 = setPunto(p34Bis,3.0,4.0);
    // Se restaura "p34Bis"
  
  static String prueba3_1 = p00.toString();
  static String prueba3_2 = p34.toString();
  static String prueba3_3 = p34.toString();
  static boolean prueba3_toString =
    (prueba3_1.equals("(0,00;0,00)") == true) &&
    (prueba3_2.equals("(3,00;4,00)") == true) &&
    (prueba3_3.equals("(3,0;4,0)") == false);  

  static boolean prueba4_1 = p34.esIgual(p34);
  static boolean prueba4_2 = p34.esIgual(p34Bis);
  static boolean prueba4_3 = p34.esIgual(p54);
  static boolean prueba4_esIgual =
    (prueba4_1 == true) && (prueba4_2 == true) &&
    (prueba4_3 == false);
  
  static double prueba5_1 = p00.distancia(p30);
  static double prueba5_2 = p00.distancia(p34);
  static double prueba5_3 = p54.distancia(p34);
  static boolean prueba5_distancia =
    (prueba5_1 == 3.0) && (prueba5_2 == 5.0) && (prueba5_3 == 2.0);
      
//  PROGRAMA PRINCIPAL  ---------------------------------------------
  
  public static void main(String[] args)
  {
    System.out.println("PRUEBA1_getters: " + prueba1_getters);
    System.out.println("PRUEBA2_setters: " + prueba2_setters);
    System.out.println("PRUEBA3_toString: " + prueba3_toString);
    System.out.println("PRUEBA4_esIgual: " + prueba4_esIgual);
    System.out.println("PRUEBA5_distancia: " + prueba5_distancia);
  }
}