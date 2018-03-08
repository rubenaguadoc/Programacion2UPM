/**
 * Especificacion del TAD Complejo<br>
 * @since 27/02/2018
 * @version 1.0
 * @author Ruben Aguado Cosano
*/

interface Complejo{
  /**
  * POST: Visualizador
  */
  public String toString();
  /**
  * POST: Cambia el modulo del objeto
  */
  public void setMod(double modulus);
  /**
  * POST: Cambia el argumento del objeto
  */
  public void setArg(double argument);
  /**
  * POST: Devuelve el modulo del objeto
  */
  public double getMod();
  /**
  * POST: Devuelve el argumento del objeto
  */
  public double getArg();
  /**
  * POST: resultado es cierto si el objeto es igual a "c" y es falso e.o.c
  */
  public boolean esIgual (Complejo c);
  /**
  * POST: resultado es el complejo conjugado del objeto. El que tiene el mismo modulo y argumento opuesto
  */
  public Complejo conjugado ();
  /**
  * POST: resultado es el complejo inverso del objeto. El que tiene como modulo el modulo inverso y el argumento opuesto.
  */
  public Complejo inverso ();
  /**
  * POST: resultado es el complejo producto del objeto y "c": El que tiene como modulo, el producto de los modulos y como argumento, la suma de los argumentos.
  */
  public Complejo multiplicar (Complejo c);
  /**
  * POST: resultado es el complejo cociente del objeto y "c": El que tiene como modulo, el cociente de los modulos y como argumento, la resta de los argumentos.
  */
  public Complejo dividir (Complejo c);
  /**
  * POST: resultado es el complejo girado (en sentido contrario al de las agujas del reloj) un angulo de "x" grados con respecto al objeto.
  */
  public Complejo girar (double x);
  /**
  * POST: resultado es la potencia n_esima del complejo objeto: el que tiene como modulo la potencia n_esima del modulo del objeto y como argumento "n" veces el del objeto.
  */
  public Complejo potencia (int n);
  /**
  * POST: resultado es la i_esima solucion de la raiz n_esima del objeto: el complejo que tiene como modulo la raiz n_esima del modulo del objeto y como argumento, (argumento+2*pi*i)/n.
  */
  public Complejo raiz (int i, int n);
}//ENDOF: interface Complejo
