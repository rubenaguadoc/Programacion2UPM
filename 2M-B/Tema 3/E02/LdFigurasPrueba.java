package e02;

import stdlib.*;
import java.awt.Color;
import figura.*;
import list.ArrayList;

/** 
 * Pruebas de LdFiguras.
 * 
 * @since 17/04/2017  
 * @version 1.1    17/04/2018  Javier Galve
 * @author Javier Galve
 */
public class LdFigurasPrueba
{
  
  final static int CANVAS_SIZE = 400;
  
  public static Figura c1;
  public static Figura c2;
  public static Figura c3;
  public static Figura r1;
  public static Figura r2;
  public static Figura d1;
  public static Figura d2;

  static LdFiguras ldf0;
  static LdFiguras ldf1;
  static LdFiguras ldf2;
  static LdFiguras ldf3;
  static LdFiguras ldf5;
  
  static LdFiguras ldf1Replica;
  static LdFiguras ldf2Replica;
  static LdFiguras ldf3Replica;

  // PRE: n EN [0, 6)
  Color color (int n)
  {
    if (n==0)
      return StdDraw.MAGENTA;
    else if (n==1)
      return StdDraw.BLUE;
    else if (n==2)
      return StdDraw.GREEN;
    else if (n==3) 
      return StdDraw.RED;
    else if (n==4)
      return StdDraw.BLACK;
    else 
      return StdDraw.YELLOW;
  }
  public static int aleatorio (int n)
  { 
    return (int)(Math.random() * Math.abs(n+1));
  }
  public static void resetear ()
  {
    FiguraPruebas.resetear();
    c1 = new Circulo(new Punto(10, 20), 15);
    c2 = new Circulo(new Punto(40, 20), 10);
    c3 = new Circulo(new Punto(aleatorio(CANVAS_SIZE), 
                               aleatorio(CANVAS_SIZE)), 
                     aleatorio(2*CANVAS_SIZE/10));

    r1 = new Rectangulo(new Punto(50, 80), 200, 100);
    r2 = new Rectangulo(new Punto(40, 20), 50, 100);
    d1 = new Dot(new Punto(100, 100));
    d2 = new Dot(new Punto(45, 35));    

    ldf0 = new LdFiguras();
    
    ldf1 = new LdFiguras();
    ldf1.add(d1); 
    
    ldf2 = new LdFiguras();
    ldf2.add(r2); 
    ldf2.add(r1); 
    
    ldf3 = new LdFiguras();
    ldf3.add(c1); 
    ldf3.add(c2); 
    ldf3.add(c3); 
    
    ldf5 = new LdFiguras();
    ldf5.add(c1); 
    ldf5.add(r1); 
    ldf5.add(d1); 
    ldf5.add(c2);
    ldf5.add(r2);   
  }
  public static void mostrar ()
  {
    resetear();
    System.out.println("ldf0 = " + ldf0);
    System.out.println("ldf1 = " + ldf1);
    System.out.println("ldf2 = " + ldf2);
    System.out.println("ldf3 = " + ldf3);
    System.out.println("ldf5 = " + ldf5);
  }
  public static void pruebaPintar ()
  { 
    resetear();
    Tablero.iniciar();
    ldf1.pintar();
    ldf2.pintar();
    ldf3.pintar();
    ldf5.pintar();
    //ldf3 = ldf3.caer();
    ldf3.pintar();
  }
 /*
  * Genera una LdFiguras compuesta por un número aleatorio
  * de ellas. Cada figura se localiza en un punto aleatorio
  * del lienzo y tiene un tamaño aleatorio. 
  */
  public static LdFiguras generaFiguras ()
  {
	  
	  int length = aleatorio(20);
	  LdFiguras ldFig = new LdFiguras();
	  for(int i = 0; i < length; ++i) {
		  
		  int tipoFigura = aleatorio(3);
		  
		  Figura f;
		  
		  if(tipoFigura == 1) {
			  
			  f = new Dot(new Punto(aleatorio(CANVAS_SIZE), aleatorio(CANVAS_SIZE)));
			  
		  }
		  else if(tipoFigura == 2) {
			  
			  f = new Rectangulo(new Punto(aleatorio(CANVAS_SIZE), aleatorio(CANVAS_SIZE)), aleatorio(2*CANVAS_SIZE/10), aleatorio(2*CANVAS_SIZE/10));
			  
		  }
		  else {
			  
			  f = new Circulo(new Punto(aleatorio(CANVAS_SIZE), aleatorio(CANVAS_SIZE)), aleatorio(4*CANVAS_SIZE/10));
			  
		  }
		  
		  ldFig.add(f);
		  
	  }
	  return ldFig;
	  
  }
  public static void pruebaPintarAleatorias ()
  {
    Tablero.iniciar();
    generaFiguras().pintar();
  }
  public static void pruebaCaer () 
  {
    Tablero.iniciar();
    LdFiguras ldf = generaFiguras();
    for (int i = 1; i<=25; i++)
    {
      StdDraw.clear();
      ldf.caer(20);
      ldf.pintar();
      StdDraw.show();
      StdDraw.pause(1000);
    }
  }  
  public static void main (String args[])
  {     
    mostrar();
    //
    //Gráficos:
    pruebaPintar();
    pruebaPintarAleatorias();
    //
    //Animación:
    pruebaCaer();
  }
} 