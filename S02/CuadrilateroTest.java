/**
 * Pruebas de la clase Cuadrilatero<br>
 * @since 8/2/2017
 * @version 1.0
 * @author JMB
 */
public class CuadrilateroTest
{
//  OPERACIONES PARTICULARES  ---------------------------------------
/**
 * POST: resultado es la cadena de caracteres que representa a la
 *       clase de cuadrilatero [Cuadrado,Trapezoide] para c IN [1,6]
 */
  static String verClaseCuadrilatero (int c)
  {
    switch (c)
    {
      case 1  : return "Cuadrado";
      case 2  : return "Rectangulo";
      case 3  : return "Rombo";
      case 4  : return "Romboide";
      case 5  : return "Trapecio";
      default : return "Trapezoide";
    }
  }
//  DECLARACIONES DE CONSTANTES DE PRUEBAS  -------------------------

  static Punto p00 = new Punto(0.0,0.0);
  static Punto p02 = new Punto(0.0,2.0);
  static Punto p22 = new Punto(2.0,2.0);
  static Punto p20 = new Punto(2.0,0.0);
  static Punto p01 = new Punto(0.0,1.0);
  static Punto p21 = new Punto(2.0,1.0);
  static Punto p12 = new Punto(1.0,2.0);
  static Punto p1_2 = new Punto(1.0,-2.0);
  static Punto p11 = new Punto(1.0,1.0);
  static Punto p30 = new Punto(3.0,0.0);
  static Punto p31 = new Punto(3.0,1.0);
  static Punto p13 = new Punto(1.0,3.0);
  static Punto p32 = new Punto(3.0,2.0);

  static Cuadrilatero cuadrado =
    new Cuadrilatero (p00,p02,p22,p20);
  static Cuadrilatero rectangulo =
    new Cuadrilatero (p00,p01,p21,p20);
  static Cuadrilatero rombo =
    new Cuadrilatero (p00,p12,p20,p1_2);
  static Cuadrilatero romboide =
    new Cuadrilatero (p00,p11,p31,p20);
  static Cuadrilatero trapecio =
    new Cuadrilatero (p00,p11,p21,p30);
  static Cuadrilatero trapezoide =
    new Cuadrilatero (p00,p13,p32,p20);

//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  static int prueba1_1 = cuadrado.queCuadrilatero();
  static int prueba1_2 = rectangulo.queCuadrilatero();
  static int prueba1_3 = rombo.queCuadrilatero();
  static int prueba1_4 = romboide.queCuadrilatero();
  static int prueba1_5 = trapecio.queCuadrilatero();
  static int prueba1_6 = trapezoide.queCuadrilatero();
  static boolean prueba1_queCuadrilatero =
    (prueba1_1 == cuadrado.CUADRADO) &&
    (prueba1_2 == rectangulo.RECTANGULO) &&
    (prueba1_3 == rombo.ROMBO) &&
    (prueba1_4 == romboide.ROMBOIDE) &&
    (prueba1_5 == trapecio.TRAPECIO) &&
    (prueba1_6 == trapezoide.TRAPEZOIDE);

  static double prueba2_1 = cuadrado.area();
  static double prueba2_2 = rectangulo.area();
  static double prueba2_3 = rombo.area();
  static double prueba2_4 = romboide.area();
  static boolean prueba2_area =
    (prueba2_1 == 4.0) && (prueba2_2 == 2.0) &&
    (prueba2_3 == 4.0) && (prueba2_4 == 2.0);

  static double prueba3_1 = cuadrado.perimetro();
  static double prueba3_2 = rectangulo.perimetro();
  static double prueba3_3 = rombo.perimetro();
  static double prueba3_4 = romboide.perimetro();
  static boolean prueba3_perimetro =
    (prueba3_1 == 8.0) &&
    (prueba3_2 == 6.0) &&
    (prueba3_3 == 4*Math.sqrt(5.0)) &&
    (prueba3_4 == 4.0 + 2*Math.sqrt(2.0));

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args)
  {
    System.out.println("PRUEBA1_queCuadrilatero: " +
                       prueba1_queCuadrilatero);
    System.out.println("PRUEBA2_area: " + prueba2_area);
    System.out.println("PRUEBA3_perimetro: " + prueba3_perimetro);
  }
}
