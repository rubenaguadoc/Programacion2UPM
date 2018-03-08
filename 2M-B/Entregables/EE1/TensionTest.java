package ee1;


/** 
 * Pruebas del TAD Tension<br>
 * @since 22/2/2018
 * @version 1.1  06/03/2018
 * @author JMB y JGF
 */

public class TensionTest
{
  static Tension t1 = new Tension(8.0, 13.0);  // ok
  static Tension t2 = new Tension(9.0, 16.0);  // alta
  static Tension t3 = new Tension(10.0, 13.0); // hiper
  static Tension t4 = new Tension(8.0, 16.0);  // alta
  static Tension t5 = new Tension(10.0, 15.0); // hiper
  static Tension t6 = new Tension(5.0, 9.0);   // hipo
  static Tension t5Bis = new Tension(10.0, 15.0); // hiper
  
  static void mostrar ()
  {
    System.out.println("t1 = " + t1);
    System.out.println("t2 = " + t2);
    System.out.println("t3 = " + t3);
    System.out.println("t4 = " + t4);
    System.out.println("t5 = " + t5);
    System.out.println("t6 = " + t6);
  }
  static boolean testEsIgual () {
    return
      t5.esIgual(t6) == false &&
      t5.esIgual(t5Bis) == true;
  }
  static boolean testEsNormal () {
    return
      t1.esNormal() == true &&
      t2.esNormal() == false &&
      t6.esNormal() == false;     
  }
  static boolean testEsAlta () {
    return
      t1.esAlta() == false &&
      t3.esAlta() == true &&
      t4.esAlta() == true;
  }
  static boolean testPulso () {
    return
      t1.pulso() == 5.0 &&
      t3.pulso() == 3.0 &&
      t6.pulso() == 4.0;
  }
  public static void main(String[] args)
  {
    mostrar();
    System.out.println("testEsNormal() = " + testEsNormal());
    System.out.println("testEsAlta() =" + testEsAlta());
    System.out.println("testPulso() = " + testPulso());
    System.out.println("testEsIgual() = " + testEsIgual());
  }
}
