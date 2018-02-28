/**
 * Implementaci�n del compuesto Cuadrilatero<br>
 * {@code Cuadrilatero = CIPunto}<br>
 * {@code INV(Cuadrilatero) = Los cuatro puntos deben estar ordenados
 *  en el sentido de las agujas del reloj y deben determinar una
 *  figura convexa.}<br>
 * @since 15-02-2018
 * @version 1.0
 * @author Rub�n Aguado
 */
public class Cuadrilatero {
// CONSTANTES  ------------------------------------------------------
  private final int vertices = 4;
  // Constantes de la clase de cuadril�teros
  public final int CUADRADO   = 1;
  public final int RECTANGULO = 2;
  public final int ROMBO      = 3;
  public final int ROMBOIDE   = 4;
  public final int TRAPECIO   = 5;
  public final int TRAPEZOIDE = 6;
// ATRIBUTOS  -------------------------------------------------------
  private Punto[] cuadri;
// CONSTRUCTORES  ---------------------------------------------------
  public Cuadrilatero (Punto p1, Punto p2, Punto p3, Punto p4) {
    cuadri = new Punto[vertices];
    cuadri[0] = p1;
    cuadri[1] = p2;
    cuadri[2] = p3;
    cuadri[3] = p4;
  }
//  OPERACIONES  ----------------------------------------------------
/**
 * POST: resultado es el area del triangulo de vertices
 *       "p1", "p2" y "p3" (mitad del determinante)
 */
  private double areaTriangulo (Punto p1, Punto p2, Punto p3) {
    return 0.5 * Math.abs(
      p1.getX() * p2.getY() +
      p3.getX() * p1.getY() +
      p2.getX() * p3.getY() -
      p3.getX() * p2.getY() -
      p2.getX() * p1.getY() -
      p1.getX() * p3.getY() );
  }
/**
 * POST: resultado es el area del objeto
 */
  public double area () {
    return
      areaTriangulo(cuadri[0], cuadri[1], cuadri[2]) +
      areaTriangulo(cuadri[0], cuadri[2], cuadri[3]);
  }
/**
 * POST: resultado es el perimetro del objeto
 */
  public double perimetro () {
    return
      cuadri[0].distancia(cuadri[1]) +
      cuadri[1].distancia(cuadri[2]) +
      cuadri[2].distancia(cuadri[3]) +
      cuadri[3].distancia(cuadri[0]);
  }
/**
 * POST: resultado es el n�mero de paralelas del objeto
 */
  public int paralelas () {
    boolean paralelas01_23 =
      ((cuadri[0].getX()-cuadri[1].getX()) *
       (cuadri[2].getY()-cuadri[3].getY())) ==
      ((cuadri[2].getX()-cuadri[3].getX()) *
       (cuadri[0].getY()-cuadri[1].getY()));
    boolean paralelas03_12 =
      ((cuadri[0].getX()-cuadri[3].getX()) *
       (cuadri[1].getY()-cuadri[2].getY())) ==
      ((cuadri[1].getX()-cuadri[2].getX()) *
       (cuadri[0].getY()-cuadri[3].getY()));
    if (paralelas01_23 && paralelas03_12)
      return 2;
    else if (paralelas01_23 || paralelas03_12)
      return 1;
    else
      return 0;
  }
/**
 * POST: resultado es si los tres puntos forman o no un angulo recto
 */
  public boolean perpendiculares (Punto p1, Punto p2, Punto p3) {
    double v1x = p1.getX() - p2.getX();
    double v1y = p1.getY() - p2.getY();
    double v2x = p2.getX() - p3.getX();
    double v2y = p2.getY() - p3.getY();
    double determinante = v1x * v2x + v1y * v2y;
    return determinante == 0.0;
  }
/**
 * POST: resultado es la clase de cuadrilatero del objeto
 */
  public int queCuadrilatero () {
    int paralelas = paralelas();
    switch (paralelas){
      case 1:
        return TRAPECIO;
      case 0:
        return TRAPEZOIDE;
    }
    if (cuadri[0].distancia(cuadri[1]) == cuadri[1].distancia(cuadri[2])) {
      if(perpendiculares(cuadri[0], cuadri[1], cuadri[2])) {
        return CUADRADO;
      } else {
        return ROMBO;
      }
    }else{
      if(perpendiculares(cuadri[0], cuadri[1], cuadri[2])) {
        return RECTANGULO;
      } else {
        return ROMBOIDE;
      }
    }
  }
}
