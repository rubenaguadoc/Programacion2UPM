/**
 * Prueba del TAD ComplejoTupla<br>
 * @since 9/02/2018
 * @version 1.0
 * @author JMB
 */
public class ComplejoTuplaTest
{
//  OPERACIONES PARTICULARES  ---------------------------------------

//  CONSTANTES DE PRUEBAS  ------------------------------------------

  static Complejo c1 = new ComplejoTupla(6.0,45.0);
  static Complejo c2 = new ComplejoTupla(3.0,15.0);
  static Complejo c3 = new ComplejoTupla(2.0,30.0);

  static Complejo res1 = new ComplejoTupla(6.0,-45.0);   // conjugado
  static Complejo res2 = new ComplejoTupla(0.5,-30.0);   // inverso
  static Complejo res3 = new ComplejoTupla(18.0,60.0);   // producto
  static Complejo res4 = new ComplejoTupla(2.0,30.0);    // cociente
  static Complejo res5 = new ComplejoTupla(2.0,90.0);    // girar
  static Complejo res6 = new ComplejoTupla(216.0,135.0); // potencia
  static Complejo res7 = new ComplejoTupla(1.3480061545972777,247.5);

//  PRUEBAS  --------------------------------------------------------

  static Complejo prueba1 = c1.conjugado();
  static Complejo prueba2 = c3.inverso();
  static Complejo prueba3 = c1.multiplicar(c2);
  static Complejo prueba4 = c1.dividir(c2);
  static Complejo prueba5 = c3.girar(60.0);
  static Complejo prueba6 = c1.potencia(3);
  static Complejo prueba7 = c1.raiz(4,6);

  static boolean prueba1_Conjugado   = prueba1.esIgual(res1);
  static boolean prueba2_Inverso     = prueba2.esIgual(res2);
  static boolean prueba3_Multiplicar = prueba3.esIgual(res3);
  static boolean prueba4_Dividir     = prueba4.esIgual(res4);
  static boolean prueba5_Girar       = prueba5.esIgual(res5);
  static boolean prueba6_Potencia    = prueba6.esIgual(res6);
  static boolean prueba7_Raiz        = prueba7.esIgual(res7);

  static boolean pruebaFinal =
    prueba1_Conjugado && prueba2_Inverso && prueba3_Multiplicar &&
    prueba4_Dividir && prueba5_Girar && prueba6_Potencia &&
    prueba7_Raiz;

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args)
  {
    System.out.println("Resultado = " + pruebaFinal);
    System.out.println();
    if (!pruebaFinal)
    {
      boolean[] pruebas =
        {true,prueba1_Conjugado,prueba2_Inverso,prueba3_Multiplicar,
         prueba4_Dividir,prueba5_Girar,prueba6_Potencia,prueba7_Raiz};
      for (int i=1; i<pruebas.length; i++)
        if (!pruebas[i])
          System.out.println("Falla la prueba: " + i);
    }
  }
}
