/**
 * Prueba de ColIndexVarTupla<br>
 * @since 12/03/2018
 * @version 1.0
 * @author JMB
 */
public class ColIndexVarTuplaTest
{
//  OPERACIONES PARTICULARES  ---------------------------------------
/**
 * POST: resultado es la ColIndexVar formada por los elementos de
 *       "colArray"
 */
  static public ColIndexVar consColIndexVar (int[] colArray)
  {
    ColIndexVar resultado = new ColIndexVarTupla(colArray.length+10);
    for (int i = 0; i < colArray.length; i++)
      resultado.add(i,colArray[i]);
    return resultado;
  }
//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------
  
  static int[] ninguno = {};
  static int[] todos10 = {0,1,2,3,4,5,6,7,8,9};

  static ColIndexVar col10, col0;
  static int prueba1_1, prueba1_2, prueba1_3;
  static int prueba2_1, prueba2_2, prueba2_3;
  static int prueba3_1, prueba3_2, prueba3_3;

  public static void resetear ()
  {
    col10 = consColIndexVar(todos10);
  }
  static void mostrar ()
  {
    System.out.println("col10 = " + col10);
  }    
  
//  DECLARACIONES DE PRUEBAS  ---------------------------------------
  
  public static boolean prueba1_add ()
  {
    resetear();
    col10.add(0,11);           // 1º  el 11
    col10.add(5,55);           // 5º  el 55
    col10.add(9,99);           // 9º  el 99
    prueba1_1 = col10.get(0);
    prueba1_2 = col10.get(5);
    prueba1_3 = col10.get(9);
    boolean resultado = (prueba1_1 == 11) &&
                        (prueba1_2 == 55) &&
                        (prueba1_3 == 99);
    return resultado;
  }
  public static boolean prueba2_set ()
  {
    resetear();
    col10.set(0,11);           // 1º  el 11
    col10.set(5,55);           // 5º  el 55
    col10.set(9,99);           // 9º el 99
    prueba2_1 = col10.get(0);
    prueba2_2 = col10.get(5);
    prueba2_3 = col10.get(9);
    boolean resultado = (prueba2_1 == 11) &&
                        (prueba2_2 == 55) &&
                        (prueba2_3 == 99);
    return resultado;
  }
  public static boolean prueba3_remove ()
  {
    resetear();
    col10.remove(0);           // 1 por el 0
    col10.remove(5);           // 7 por el 6
    col10.remove(7);           // sera el ultimo
    prueba3_1 = col10.get(0);  // 1
    prueba3_2 = col10.get(5);  // 7
    prueba3_3 = col10.get(6);  // 8
    boolean resultado = (prueba3_1 == 1) &&
                        (prueba3_2 == 7) &&
                        (prueba3_3 == 8);
    return resultado;
  }

//  PROGRAMA PRINCIPAL  ---------------------------------------------
  
  public static void main(String[] args)
  {
    resetear();
    mostrar();
    System.out.println("prueba1_add: " + prueba1_add());
    mostrar();
    System.out.println("prueba2_set: " + prueba2_set());
    mostrar();
    System.out.println("prueba3_remove: " + prueba3_remove());
    mostrar();
  }
}