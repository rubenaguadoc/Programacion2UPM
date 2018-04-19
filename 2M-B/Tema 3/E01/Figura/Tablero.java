package figura;
import stdlib.*;
import java.awt.Color;
/** 
 * Tablero. 
 * Tablero gráfico.
 * @author Javier Galve  
 * @version 1.0     17/03/2017
 */
public class Tablero 
{
  
  public static final int XMAX = 800;
  public static final int YMAX = 800;
  public static final int XMIN = 0;
  public static final int YMIN = 0;
  public static final int ESCALAX = 400;
  public static final int ESCALAY = 400;
  public static final double GROSORPINCEL = 0.008;
  public static final Color COLOR_FONDO = StdDraw.CYAN;
  
  public static void iniciar () 
  {  
    StdDraw.setCanvasSize(XMAX, YMAX);
    StdDraw.setXscale(0, ESCALAX);
    StdDraw.setYscale(0, ESCALAY);
    StdDraw.setPenRadius(GROSORPINCEL);
    StdDraw.setPenColor(StdDraw.RED);
  }  
  public static void iniciarAnimacion () 
  {  
    iniciar();
    StdDraw.enableDoubleBuffering();
  }  
  
}  

