/**
 * Calculo de la coleccion de tensiones arteriales mas altas<br>
 * de lo normal del historico de un paciente<br>
 * @since 1/3/18
 * @version 1.0
 * @author JMB
 */

import java.util.Arrays;

class TensionesMasAltas
{

// El hist�rico de tensiones es un array

// VISUALIZADOR DEL HIST�RICO  --------------------------------------

/*
 * FUNCION verCITension (CITension historico) ---> Cadena
 * PRE: cierto
 * POST: resultado es la cadena de caracteres formada por los
 *       elementos de "historico"
*/
public static String verCITension(Tension[] historico){
  return Arrays.toString(historico);
}

// FUNCI�N PRINCIPAL  -----------------------------------------------

/*
 * FUNCION  lasTAltas (CITension historico) ---> CITension
 * PRE: cierto
 * POST: resultado es la coleccion de tensiones de "historico"
 *       m�s altas de lo normal.
*/
public static Tension[] lasTAltas(Tension[] historico){
  int l = 0;
  for(int i = 0; i < historico.length; i++) {
    if (historico[i].esAlta()) {
      l ++;
    }
  }
  Tension[] historicoAltas = new Tension[l];
  l = 0;
  for(int i = 0; i < historico.length; i++) {
    if (historico[i].esAlta()) {
      historicoAltas[l] = historico[i];
      l ++;
    }
  }
  return historicoAltas;
}


//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------

  static Tension t1 = new TensionTupla (8.0,13.0);  // chachi
  static Tension t2 = new TensionTupla (9.0,16.0);  // alta
  static Tension t3 = new TensionTupla (10.0,13.0); // hiper
  static Tension t4 = new TensionTupla (8.0,16.0);  // alta
  static Tension t5 = new TensionTupla (10.0,15.0); // hiper
  static Tension t6 = new TensionTupla (5.0,9.0);   // hipo
  static Tension t5Bis = new TensionTupla (10.0,15.0); // hiper

  static Tension[] lista1 = {t1,t6};
  static Tension[] lista2 = {t1,t2,t3,t4,t5,t6};

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args)
  {
    System.out.println("Prueba_lasTAltas:" +
                       verCITension(lasTAltas(lista1)));
    System.out.println("Prueba_lasTAltas:" +
                       verCITension(lasTAltas(lista2)));
  }

}
