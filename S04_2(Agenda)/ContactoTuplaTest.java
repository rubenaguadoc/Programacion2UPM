/**
 * Prueba de ContactoTupla<br>
 * @since 27/02/2018
 * @version 1.0
 * @author JMB
 */
public class ContactoTuplaTest
{
//  OPERACIONES PARTICULARES  ---------------------------------------

//  CONSTANTES DE PRUEBAS  ------------------------------------------
  
  static Contacto c11;
  static Contacto c12 = new ContactoTupla("Elinela",234567);
  static Contacto c21;
  static Contacto c22 = new ContactoTupla("Pablo",456789);
  static Contacto c31;
  static Contacto c32 = new ContactoTupla("Ida",654321);
  static Contacto c32_clon = new ContactoTupla("Ida",654321);
  static Contacto c41;
  static Contacto c51;
  static Contacto c61 = new ContactoTupla("Laura",654000);
  static Contacto c71 = new ContactoTupla("Karla",654111);
    
//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  public static void resetear ()
  {
    c11 = new ContactoTupla("Elinela",123456);
    c21 = new ContactoTupla("Pablo",345678);
    c31 = new ContactoTupla("Ida",567890);
    c41 = new ContactoTupla("Daniel",987654);
    c51 = new ContactoTupla("Sharif",983210);
  }
  public static void mostrar ()
  {
    System.out.println("Contacto1 = " + c11);
    System.out.println("Contacto2 = " + c21);
    System.out.println("Contacto3 = " + c31);
    System.out.println("Contacto4 = " + c41);
    System.out.println("Contacto5 = " + c51);
  }

//  DECLARACIONES DE PRUEBAS  ---------------------------------------
  
 static String prueba1_1 = c12.getNombre();
  static double prueba1_2 = c22.getTelefono();
  static boolean prueba1_getters =
    prueba1_1.equals("Elinela") && (prueba1_2 == 456789);
  
  static boolean prueba2_1 = c12.esIgual(c32);
  static boolean prueba2_2 = c32.esIgual(c32_clon);
  static boolean prueba2_3 = c22.igualNombre("Pablo");
  static boolean prueba2_4 = c22.igualTelefono(111111);
  static boolean prueba2_iguales =
    (prueba2_1 == false) && (prueba2_2 == true) &&
    (prueba2_3 == true) && (prueba2_4 == false);  

//  PROGRAMA PRINCIPAL  ---------------------------------------------
  
  public static void main (String[] args)
  {
    resetear();
    mostrar();
    System.out.println("PRUEBA1_getters: " + prueba1_getters);
    System.out.println("PRUEBA2_iguales: " + prueba2_iguales);
  }
}