/**
 * Implementacion del TAD Complejo<br>
 * {@code Complejo = (Real modulo, argumento)}<br>
 * @since 27/02/2018
 * @version 1.0
 * @author Ruben Aguado Cosano
 */

class ComplejoTupla implements Complejo{
  private double modulo, argumento;

  public ComplejoTupla(double modulus, double argument) {
    modulo = modulus;
    argumento = argument;
  }

  public String toString() {
    return "[Modulo: " + modulo + "; Argumento: " + argumento + ";]";
  }

  public void setMod(double modulus) {
    modulo = modulus;
  }

  public void setArg(double argument) {
    argumento = argument;
  }

  public double getMod() {
    return modulo;
  }

  public double getArg() {
    return argumento;
  }

  public boolean esIgual (Complejo c) {
    return modulo == c.getMod() && argumento == c.getArg();
  }

  public Complejo conjugado () {
    return new ComplejoTupla(modulo, -argumento);
  }

  public Complejo inverso () {
    return new ComplejoTupla(1 / modulo, -argumento);
  }

  public Complejo multiplicar (Complejo c) {
    return new ComplejoTupla(modulo * c.getMod(), argumento + c.getArg());
  }

  public Complejo dividir (Complejo c) {
    return new ComplejoTupla(modulo / c.getMod(), argumento - c.getArg());
  }

  public Complejo girar (double x) {
    return new ComplejoTupla(modulo, argumento + x);
  }

  public Complejo potencia (int n) {
    return new ComplejoTupla(Math.pow(modulo, n), argumento * n);
  }

  public Complejo raiz (int i, int n) {
    return new ComplejoTupla(Math.pow(modulo, 1.0 / n), (argumento + 2 * 180 * i) / n);
  }

}//ENDOF: class ComplejoTupla
