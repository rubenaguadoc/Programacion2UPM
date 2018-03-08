/**
 * Prueba de AgendaTupla<br>
 * @since 27/02/2018
 * @version 1.0
 * @author JMB
 */
public class AgendaTuplaTest
{
//  OPERACIONES PARTICULARES  ---------------------------------------

//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------

  static Agenda agenda1;

  static Contacto prueba1_1;
  static Contacto prueba1_2;
  static Contacto prueba1_3;
  static Contacto prueba2_1;
  static Contacto prueba2_2;
  static Contacto prueba2_3;
  static Contacto prueba3_1;
  static Contacto prueba3_2;
  static Contacto prueba3_3;
  static Contacto prueba4_1;
  static Contacto prueba4_2;
  static Contacto prueba4_3;
  static Contacto prueba5_1;
  static Contacto prueba5_2;
  static Contacto prueba5_3;
  static int prueba6_1;
  static int prueba6_2;
  static int prueba6_3;

  public static void resetear ()
  {
    agenda1 = new AgendaTupla(10);
    ContactoTuplaTest.resetear();
    agenda1.poner(ContactoTuplaTest.c11);
    agenda1.poner(ContactoTuplaTest.c21);
    agenda1.poner(ContactoTuplaTest.c31);
    agenda1.poner(ContactoTuplaTest.c41);
    agenda1.poner(ContactoTuplaTest.c51);
  }
  static void mostrar ()
  {
    System.out.println("agenda1 = \n" + agenda1);
  }

//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  public static boolean prueba1_buscarNombre ()
  {
    resetear();
    prueba1_1 = agenda1.buscarNombre("Elinela");
    prueba1_2 = agenda1.buscarNombre("Sharif");
    prueba1_3 = agenda1.buscarNombre("Ida");
    boolean resultado = (prueba1_1.esIgual(ContactoTuplaTest.c11)) &&
                        (prueba1_2.esIgual(ContactoTuplaTest.c51)) &&
                        (prueba1_3.esIgual(ContactoTuplaTest.c31));
    return resultado;
  }
  public static boolean prueba2_buscarNumero ()
  {
    resetear();
    prueba2_1 = agenda1.buscarNumero(123456);
    prueba2_2 = agenda1.buscarNumero(983210);
    prueba2_3 = agenda1.buscarNumero(567890);
    boolean resultado = (prueba2_1.esIgual(ContactoTuplaTest.c11)) &&
                        (prueba2_2.esIgual(ContactoTuplaTest.c51)) &&
                        (prueba2_3.esIgual(ContactoTuplaTest.c31));
    return resultado;
  }
  public static boolean prueba3_poner ()
  {
    resetear();
    agenda1.poner(ContactoTuplaTest.c61);
    agenda1.poner(ContactoTuplaTest.c71);
    agenda1.poner(ContactoTuplaTest.c12);
    prueba3_1 = agenda1.buscarNombre("Laura");
    prueba3_2 = agenda1.buscarNombre("Karla");
    prueba3_3 = agenda1.buscarNumero(234567);
    boolean resultado = (prueba3_1.esIgual(ContactoTuplaTest.c61)) &&
                        (prueba3_2.esIgual(ContactoTuplaTest.c71)) &&
                        (prueba3_3.esIgual(ContactoTuplaTest.c12));
    if (!resultado) mostrar();  // En caso de fallo
    return resultado;
  }
  public static boolean prueba4_quitar ()
  {
    resetear();
    // Se quitan Elinela, Daniel y Pablo
    agenda1.quitar(ContactoTuplaTest.c11);  // Elinela por Sharif
    agenda1.quitar(ContactoTuplaTest.c41);  // Daniel
    agenda1.quitar(ContactoTuplaTest.c21);  // Pablo por Ida
    // Quedan Sharif e Ida
    prueba4_1 = agenda1.buscarNombre("Sharif");
    prueba4_2 = agenda1.buscarNombre("Ida");
    prueba4_3 = agenda1.buscarNombre("Daniel");
    boolean resultado = (prueba4_1.esIgual(ContactoTuplaTest.c51)) &&
                        (prueba4_2.esIgual(ContactoTuplaTest.c31)) &&
                        (prueba4_3 == null);
    if (!resultado) mostrar();  // En caso de fallo
    return resultado;
  }

  public static boolean prueba5_cambiartelf ()
  {
    resetear();
    // Cambiar telefono de Elinela, Daniel y Sharif
    agenda1.cambiarTelefono(ContactoTuplaTest.c11, 1234);  // Cambiar telf de Elinela
    agenda1.cambiarTelefono(ContactoTuplaTest.c41, 4321);  // Cambiar telf de Daniel
    agenda1.cambiarTelefono(ContactoTuplaTest.c51, 1324);  // Cambiar telf de Sharif
    prueba5_1 = agenda1.buscarNombre("Elinela");
    prueba5_2 = agenda1.buscarNombre("Daniel");
    prueba5_3 = agenda1.buscarNombre("Sharif");
    boolean resultado = (prueba5_1.getTelefono() == 1234) &&
                        (prueba5_2.getTelefono() == 4321) &&
                        (prueba5_3.getTelefono() == 1324);
    if (!resultado) mostrar();  // En caso de fallo
    return resultado;
  }

  public static boolean prueba6_contarNumerosConPrefijo()
  {
    resetear();
    // Contar cuantos telefonos empiezan por 98, 12, 21
    prueba6_1 = agenda1.contarPrefijo(98);  // Contar cuantos telefonos empiezan por 98
    prueba6_2 = agenda1.contarPrefijo(12);  // Contar cuantos telefonos empiezan por 12
    prueba6_3 = agenda1.contarPrefijo(21);  // Contar cuantos telefonos empiezan por 21
    boolean resultado = (prueba6_1 == 2) &&
                        (prueba6_2 == 1) &&
                        (prueba6_3 == 0);
    if (!resultado) mostrar();  // En caso de fallo
    return resultado;
  }

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args)
  {
    resetear();
    mostrar();
    System.out.println("prueba1_buscarNombre: " +
                       prueba1_buscarNombre());
    System.out.println("prueba2_buscarNumero: " +
                       prueba2_buscarNumero());
    System.out.println("prueba3_poner: " + prueba3_poner());
    System.out.println("prueba4_quitar: " + prueba4_quitar());
    System.out.println("prueba5_cambiartelf: " + prueba5_cambiartelf());
    System.out.println("prueba6_contarNumerosConPrefijo: " + prueba6_contarNumerosConPrefijo());
  }
}
