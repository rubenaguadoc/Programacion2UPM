package academia;
/**
 * Prueba de AlumnoTupla<br>
 * @since 2/4/18
 * @version 1.0
 * @author JMB
 */
public class AlumnoTuplaTest
{
//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------

  static Alumno a1;
  static Alumno a2;
  static Alumno a3;
  static Alumno a4;
  static Alumno a5;

  static String prueba1_1;
  static String prueba1_2;
  static double prueba2_1;
  static double prueba2_2;
  static double prueba3_1;
  static double prueba3_2;
  static boolean prueba4_1;
  static boolean prueba4_2;
  static String prueba5_1;
  static String prueba5_2;

  public static void resetear ()
  {
    a1 = new AlumnoTupla("Lalo","Pas","Costa");
    a2 = new AlumnoTupla("Lola","Pérez","Cos");
    a3 = new AlumnoTupla("Luis","Pirlo","Casa");
    a4 = new AlumnoTupla("Lola","Prego","Cosío");
    a5 = new AlumnoTupla("Lolo","Prieto","Cosa");
  }
  public static void mostrar ()
  {
    System.out.println("Alumno1 = " + a1);
    System.out.println("Alumno2 = " + a2);
    System.out.println("Alumno3 = " + a3);
    System.out.println("Alumno4 = " + a4);
    System.out.println("Alumno5 = " + a5);
  }

//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  public static boolean prueba1_getNombreCompleto ()
  {
    resetear();
    prueba1_1 = a3.getNombreCompleto();
    prueba1_2 = a5.getNombreCompleto();
    boolean resultado = prueba1_1.equals("Pirlo Casa, Luis") &&
                        prueba1_2.equals("Prieto Cosa, Lolo");
    return resultado;
  }
  public static boolean prueba2_getParciales ()
  {
    resetear();
    prueba2_1 = a2.getPrimerParcial();
    prueba2_2 = a2.getSegundoParcial();
    boolean resultado = (prueba2_1 == 0.0) &&
                        (prueba2_2 == 0.0);
    return resultado;
  }
  public static boolean prueba3_setParciales ()
  {
    resetear();
    a3.setPrimerParcial(7.0);
    a3.setSegundoParcial(5.0);
    prueba3_1 = a3.getPrimerParcial();
    prueba3_2 = a3.getSegundoParcial();
    boolean resultado = (prueba3_1 == 7.0) &&
                        (prueba3_2 == 5.0);
    return resultado;
  }
  public static boolean prueba4_equals ()
  {
    resetear();
    Alumno aa4 = new AlumnoTupla("Lola","Prego","Cosío");
    Alumno aaa4 = new AlumnoTupla("Lolas","Prego","Cosío");
    prueba4_1 = a4.equals(aa4);
    prueba4_2 = a4.equals(aaa4);
    boolean resultado = (prueba4_1 == true) &&
                        (prueba4_2 == false);
    return resultado;
  }
  public static boolean prueba5_clave ()
  {
    resetear();
    prueba5_1 = a2.clave();
    prueba5_2 = a4.clave();
    boolean resultado = prueba5_1.equals("Perez Cos, Lola") &&
                        prueba5_2.equals("Prego Cosio, Lola");
    return resultado;
  }

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args)
  {
    resetear();
    mostrar();
    System.out.println ("a2.clave(): " + a2.clave());
    System.out.println ("a3.clave(): " + a3.clave());
    System.out.println ("Compara claves: a2 con a3 = " +
                        a2.clave().compareTo(a3.clave()));
    System.out.println("prueba1_getNombreCompleto = " +
                       prueba1_getNombreCompleto());
    System.out.println("prueba2_getParciales = " +
                       prueba2_getParciales());
    System.out.println("prueba3_setParciales = " +
                       prueba3_setParciales());
    System.out.println("prueba4_equals = " + prueba4_equals());
    System.out.println("prueba5_clave = " + prueba5_clave());
  }
}
