/**
 * Pruebas del TAD CirculoTupla<br>
 * @since 19/2/2018
 * @version 1.0
 * @author JMB
 */
public class CirculoTuplaTest
{
//  OPERACIONES PARTICULARES  ---------------------------------------
/**
 * POST: resultado es la cadena de caracteres que representa a la
 *       posicion relativa de dos circulos.
 */
  static String verPosi (int pos)
  {
    switch (pos)
    {
      case 1  : return "Disjuntas";
      case 2  : return "Tangentes";
      default : return "Secantes";
    }
  }
//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------

  static Punto p00  = new PuntoTupla(0.0,0.0);
  static Punto p10  = new PuntoTupla(1.0,0.0);
  static Punto p22  = new PuntoTupla(2.0,2.0);
  static Punto p31  = new PuntoTupla(3.0,-1.0);
  static Punto p050 = new PuntoTupla(0.5,0.0);
  static Punto p30  = new PuntoTupla(3.0,0.0);

  static Circulo c1 = new CirculoTupla(p00,2.0);
  static Circulo c2 = new CirculoTupla(p22,1.0);
  static Circulo c3 = new CirculoTupla(p31,4.0);

// Contraejemplos para circulos concentricos y simetricos
  static Circulo c1Concentrico = new CirculoTupla(p00,1.0);
  static Circulo c3Concentrico = new CirculoTupla(p31,2.0);
    static Punto p_2_2 = new PuntoTupla(-2.0,-2.0);
    static Punto p_31  = new PuntoTupla(-3.0,1.0);
  static Circulo c2Simetrico = new CirculoTupla(p_2_2,1.0);
  static Circulo c3Simetrico = new CirculoTupla(p_31,4.0);

// Ejemplos de circunferencias interiores a "c1":
  static Circulo concen_disj = new CirculoTupla(p00,1.0);
  static Circulo concen_sec  = new CirculoTupla(p00,2.0);
  static Circulo tangen1     = new CirculoTupla(p10,1.0);
  static Circulo tangen2     = new CirculoTupla(p050,1.5);
  static Circulo sec         = new CirculoTupla(p050,2.0);
  static Circulo disj        = new CirculoTupla(p050,1.0);

// Ejemplos de circunferencias exteriores a "c1"
  static Circulo tangen_ext = new CirculoTupla(p30,1.0);
  static Circulo disjun_ext = new CirculoTupla(p30,0.5);
  static Circulo sec_ext    = new CirculoTupla(p30,2.0);

//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  static int prueba1_1 = c1.posicionRelativa(sec_ext);
  static int prueba1_2 = c1.posicionRelativa(disjun_ext);
  static int prueba1_3 = c1.posicionRelativa(tangen_ext);
  static int prueba1_4 = c1.posicionRelativa(concen_sec);
  static int prueba1_5 = c1.posicionRelativa(tangen1);
  static int prueba1_6 = c1.posicionRelativa(tangen2);
  static int prueba1_7 = c1.posicionRelativa(sec);
  static int prueba1_8 = c1.posicionRelativa(disj);
  static int prueba1_9 = c1.posicionRelativa(concen_disj);
  static boolean prueba1_posicionRelativa =
    (prueba1_1 == Circulo.SECANTES) &&
    (prueba1_2 == Circulo.DISJUNTAS) &&
    (prueba1_3 == Circulo.TANGENTES) &&
    (prueba1_4 == Circulo.SECANTES) &&
    (prueba1_5 == Circulo.TANGENTES) &&
    (prueba1_6 == Circulo.TANGENTES) &&
    (prueba1_7 == Circulo.SECANTES) &&
    (prueba1_8 == Circulo.DISJUNTAS) &&
    (prueba1_9 == Circulo.DISJUNTAS);

  static Circulo prueba2_1 = c1.concentricoMitad();
  static Circulo prueba2_2 = c3.concentricoMitad();
  static boolean prueba2_concentricoMitad =
    (prueba2_1.esIgual(c1Concentrico) == true) &&
    (prueba2_2.esIgual(c3Concentrico) == true);

  static Circulo prueba3_1 = c2.simetricoOrigen();
  static Circulo prueba3_2 = c3.simetricoOrigen();
  static boolean prueba3_simetricoOrigen =
    (prueba3_1.esIgual(c2Simetrico) == true) &&
    (prueba3_2.esIgual(c3Simetrico) == true);

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args)
  {
    System.out.println("PRUEBA1_posicionRelativa: " +
                       prueba1_posicionRelativa);
    System.out.println("PRUEBA2_concentricoMitad: " +
                       prueba2_concentricoMitad);
    System.out.println("PRUEBA3_simetricoOrigen: " +
                       prueba3_simetricoOrigen);
  }
}
