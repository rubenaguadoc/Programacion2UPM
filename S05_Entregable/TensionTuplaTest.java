/** 
 * Pruebas del TAD TensionTupla<br>
 * @since 22/2/2018
 * @version 1.0
 * @author JMB  
 */

public class TensionTuplaTest
{
  static void mostrar ()
  {
    System.out.println("t1: " + t1);
    System.out.println("t2: " + t2);
    System.out.println("t3: " + t3);
    System.out.println("t4: " + t4);
    System.out.println("t5: " + t5);
    System.out.println("t6: " + t6);
  }
  
//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------
  
  static Tension t1 = new TensionTupla (8.0,13.0);  // chachi
  static Tension t2 = new TensionTupla (9.0,16.0);  // alta
  static Tension t3 = new TensionTupla (10.0,13.0); // hiper
  static Tension t4 = new TensionTupla (8.0,16.0);  // alta
  static Tension t5 = new TensionTupla (10.0,15.0); // hiper
  static Tension t6 = new TensionTupla (5.0,9.0);   // hipo
  static Tension t5Bis = new TensionTupla (10.0,15.0); // hiper
  
//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  static boolean prueba1_1 = t1.esNormal();
  static boolean prueba1_2 = t2.esNormal();
  static boolean prueba1_3 = t6.esNormal();
  static boolean prueba1_esNormal =
    (prueba1_1 == true) && (prueba1_2 == false)&& (prueba1_3 == false);

  static boolean prueba2_1 = t1.esAlta();
  static boolean prueba2_2 = t3.esAlta();
  static boolean prueba2_3 = t4.esAlta();
  static boolean prueba2_esAlta =
    (prueba2_1 == false) && (prueba2_2 == true)&& (prueba2_3 == true);

  static double prueba3_1 = t1.pulso();
  static double prueba3_2 = t3.pulso();
  static double prueba3_3 = t6.pulso();
  static boolean prueba3_pulso =
    (prueba3_1 == 5.0) && (prueba3_2 == 3.0)&& (prueba3_3 == 4.0);
  
  static boolean prueba4_1 = t5.esIgual(t6);
  static boolean prueba4_2 = t5.esIgual(t5Bis);
  static boolean prueba4_esIgual =
    (prueba4_1 == false) && (prueba4_2 == true);
  
//  PROGRAMA PRINCIPAL  ---------------------------------------------
  
  public static void main(String[] args)
  {
    mostrar();
    System.out.println("PRUEBA1_esNormal: " + prueba1_esNormal);
    System.out.println("PRUEBA2_esAlta: " + prueba2_esAlta);
    System.out.println("PRUEBA3_pulso: " + prueba3_pulso);
    System.out.println("PRUEBA4_esIgual: " + prueba4_esIgual);
  }
}