package t01.e04;


import stdlib.StdDraw;
import t01.e01.Punto;
/** 
 * Programa CirculoPrueba. 
 * Pruebas de la clase Circulo.
 * @author Javier Galve  
 * @version 1.0     26/02/2018
 */
public class CirculoPrueba {
 
  public static Circulo c0;
  public static Circulo c1;
  public static Circulo c2;
  public static Circulo c3;
  public static Circulo c4;
  public static Circulo c5;
  public static Circulo c6;
  public static Circulo c1Replicante;
  /**
   * Vuelve los objetos de prueba a su estado inicial.
   */
  public static void resetear () {
    c0 = new Circulo(new Punto(0, 0), 4);
    c1 = new Circulo(new Punto(10, 20), 40);
    c2 = new Circulo(new Punto(20, 40), 10);
    c3 = new Circulo(new Punto(3, 4), 4);
    c4 = new Circulo(new Punto(8, 6), 2);
    c5 = new Circulo(new Punto(20, 20), 20);
    c6 = new Circulo(new Punto(40, 40), 10, StdDraw.RED);
    c1Replicante = new Circulo(new Punto(10, 20), 40, StdDraw.BLUE);
  }
  /**
   * Muestra los objetos de prueba en modo texto.
   */
  public static void mostrar () 
  {  
    System.out.println("c0 = " + c0); 
    System.out.println("c1 = " + c1); 
    System.out.println("c2 = " + c2); 
    System.out.println("c3 = " + c3); 
    System.out.println("c4 = " + c4); 
    System.out.println("c5 = " + c5); 
    System.out.println("c6 = " + c6); 
    System.out.println("c1Replicante = " + c1Replicante); 
  }
  //PRUEBAS de distanciaAlOrigen:
  static boolean prueba1DistanciaAlOrigen () 
  {
    resetear();
    return c0.distanciaAlOrigen()==0;
  }
  static boolean prueba2DistanciaAlOrigen ()
  {
    resetear();
    return c3.distanciaAlOrigen()==7;
  }
  static boolean prueba3DistanciaAlOrigen ()
  {  
    resetear();
    return c4.distanciaAlOrigen()==14;
  }
  static boolean pruebaDistanciaAlOrigen ()
  {
    return 
      prueba1DistanciaAlOrigen() &&
      prueba2DistanciaAlOrigen() &&
      prueba3DistanciaAlOrigen();
  }
  //PRUEBAS de traslacion:
  //
  //PRUEBAS de mover:
  //
  public static void main (String[] args) {  
    //Inicialización:
    resetear();
    //Constructores:
    mostrar();
    //Selectores:
    System.out.println("c0.centro() = " + c0.centro()); 
    System.out.println("c0.radio() = " + c0.radio()); 
    //Comparadores:
    System.out.println(c1 + "==" + c1Replicante + " = " + 
                       (c1==c1Replicante));
    System.out.println(c1 + ".esIgual(" + c1Replicante + ") = " + 
                       c1.esIgual(c1Replicante));   
    //Modificadores:
    System.out.println("c5 = " + c5);
    System.out.println("c5.ponerCentro(new Punto(40, 40));"); 
    c5.ponerCentro(new Punto(40, 40));
    //traslacion:
    System.out.println("c5 = " + c5);   
    System.out.println("c5.traslacion(20, 20) = " + 
                       c5.traslacion(20, 20));
    System.out.println("c5 = " + c5);
    //mover:
    System.out.println("c5.mover(20, 20);"); 
    c5.mover(20, 20);
    System.out.println("c5 = " + c5);   
    System.out.println("c5.traslacion(20, 20) = " + 
                       c5.traslacion(20, 20));
    //PRUEBAS:
    System.out.println("pruebaDistanciaAlOrigen() = " + 
                       pruebaDistanciaAlOrigen());
    //Modo Gráfico:
    StdDraw.setXscale(0, 50);
    StdDraw.setYscale(0, 50);
    StdDraw.setPenRadius(0.002);
    c3.pintar();
    c4.pintar();
    c6.pintar();
  }

}  

__$$_$__________$_$$
_$$_$_$________$_$__$
_$$__$__$______$_$___$
__$___$__$____$_$____$
_ _$__$__$___$__$____$
___$___$__$__$__$$__$
___$$__$__$§$$$__§_$
____$___________$§$
_____$$__________$$
_____$$___________$....
_____$____________$
_____$_§$________$§_____$$$$$$$$$
_____$_§:-)______:-)§$__$$_________$$
____$_$$§___________$______________$$
____o_______________$$_______________$$
____$________________$_____$__________$$
____$$_____$$$$$___$$______$___________$$
___$__$$§___$$$___§$_________$$________$$___$$
___$_____$___$___$________$$____$_____$$__$$$$
___$$__$___$$$$$__$_____$$______$____$$$$$$$
___$$__$_________$___$$________$____$$
____$$$$$________$$$$$________$$$$$$
  