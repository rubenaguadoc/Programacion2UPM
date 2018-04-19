package figura;
import stdlib.*;
/** 
 * Pruebas de figuras geom�tricas.
 * 
 * @since 17/04/2017  
 * @version 1.1    17/04/2018  Javier Galve
 * @author Javier Galve
 */
public class FiguraPruebas
{
  public static Punto p1;
  public static Punto p2;

  public static Figura d1;
  public static Figura d2;

  public static Figura r1;
  public static Figura r2;

  public static Figura f1;
  public static Figura f2;

  public static Figura c1;
  public static Figura c2;
  
  public static Rectangulo r5;
  
  public static void resetear ()
  {
    p1 = new Punto(10, 20);
    p2 = new Punto(20, 20);   

    d1 = new Dot(new Punto(10, 20));
    d2 = new Dot(new Punto(40, 20));

    r1 = new Rectangulo(new Punto(10, 20), 40, 20);
    r2 = new Rectangulo(new Punto(40, 20), 50, 10);
    r5 = new Rectangulo(new Punto(100, 100), 200, 100);

    c1 = new Circulo(new Punto(10, 20), 15);
    c2 = new Circulo(new Punto(40, 20), 10);

    f1 = new Figura(new Punto(10, 20));
    f2 = new Figura(new Punto(10, 20));
  }
  public static void mostrar () 
  {
    resetear();
    
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);
    
    System.out.println("d1 = " + d1);
    System.out.println("d2 = " + d2);

    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
    System.out.println("r5 = " + r5);
    
    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
  }
  public static void pruebaPintar () 
  {
    resetear();
    Tablero.iniciar();
    d1.pintar();
    d2.pintar();
    r1.pintar();
    r2.pintar();
    r5.pintar();
    c1.pintar();
    c2.pintar();
  }
  public static boolean pruebaDistA0 ()
  {
    resetear();
    return
      p1.distA0()==30 &&
      p2.distA0()==40 &&
      c1.distA0()==30 &&
      c2.distA0()==60 &&
      r1.distA0()==30 &&
      r2.distA0()==60 &&
      d1.distA0()==30 &&
      d2.distA0()==60;
  }
  public static boolean pruebaArea ()
  {
    resetear();
    return
      c1.area()==3*15*15 &&
      r1.area()==20*40;
  }
  static boolean pruebaPerimetro ()
  {
    return
      r1.perimetro()==120 &&   
      r2.perimetro()==120;
  }
  public static void pruebaPolimorfismo () 
  {
    System.out.println("pruebaPolimorfismo... ");
    resetear();
    System.out.println("Figura -> f1 = " + f1);  
    f1 = c1;
    System.out.println("Circulo -> f1 = " + f1);
    f1 = r1;
    System.out.println("Rectangulo -> f1 = " + f1);
    f1 = d1;
    System.out.println("Dot -> f1 = " + f1);
  }
  public static void pruebaCasting () 
  {
    System.out.println("pruebaCasting... ");
    resetear();
    Circulo c3 = new Circulo(new Punto(100, 200), 150);
    System.out.println("Circulo -> c3 = " + c3);
    Figura f3 = new Figura(new Punto(50, 70));
    System.out.println("Tipo Figura -> f3 = " + f3);
//    System.out.println("Tipo Circulo -> (Circulo)f3 = " + (Circulo)f3);  //Error!!
    f3 = c3;
    System.out.println("Tipo Figura -> f3 = " + f3);
    System.out.println("Tipo Circulo -> (Circulo)f3 = " + (Circulo)f3);
    //
    f3 = r2;
    System.out.println("Tipo Figura -> f3 = " + f3);
    System.out.println("Tipo Rectangulo -> (Rectangulo)f3 = " + (Rectangulo)f3); 
//    System.out.println("Tipo Circulo -> (Circulo)f3 = " + (Circulo)f3); //Error!!
  }
  public static void pruebaMoverGrafico () 
  {
    resetear();
    Tablero.iniciar();
    r1.pintar();
    r1.mover(50, 50);
    r1.pintar();
    r1.mover(50, 50);
    r1.pintar();
    r1.mover(50, 50);
    r1.pintar();
    //
    c1.pintar();
    c1.mover(50, 0);
    c1.pintar();
    c1.mover(50, 0);
    c1.pintar();
    c1.mover(50, 0);
    c1.pintar();
  }
  public static void pruebaTraslacionGrafico () 
  {
    resetear();
    Tablero.iniciar();
    r1.pintar();
    r1.traslacion(50, 50).pintar();
    r1.traslacion(50, 50).traslacion(50, 50).pintar();
  }
  public static void pruebaAnimacion() 
  {
    resetear();
    Tablero.iniciarAnimacion();    
    r1.pintar();
    for (int i=1; i<=15; i++)
    {
      StdDraw.clear();
      r1.mover(20, 20);
      r1.pintar();
      StdDraw.show();
      StdDraw.pause(500);
    }
    c1.pintar();
    for (int i=1; i<=15; i++)
    {
      StdDraw.clear();
      c1.mover(20, 0);
      c1.pintar();
      StdDraw.show();
      StdDraw.pause(500);
    }
  }
  public static void main (String[] args) 
  {
    //Constructores y mostrar en modo texto:
    mostrar();
    //
    //Gr�ficos:
    pruebaPintar();
    //
    //Pruebas de Operaciones:
    System.out.println("pruebaDistA0() = " + pruebaDistA0());
    System.out.println("pruebaArea() = " + pruebaArea());
    System.out.println("pruebaPerimetro() = " + pruebaPerimetro());
    //
    //Ligadura din�mica:
    pruebaPolimorfismo();
    pruebaCasting();
    //Gr�ficos:
    pruebaMoverGrafico(); 
    pruebaTraslacionGrafico();
    //
    //Animaci�n:
    pruebaAnimacion();

  }
  
}