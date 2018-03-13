/**
 * Implementación del TAD Tension<br>
 * {@code Tension = (double laBaja, double laAlta)}<br>
 * @since 06/03/2018
 * @version 1.0
 * @author Rubén Aguado Cosano
 */

class TensionTupla implements Tension{

  private double pBaja, pAlta;


  public TensionTupla(double laBaja, double laAlta) {
    pBaja = laBaja;
    pAlta = laAlta;
  }

  public double getAlta() {
    return pAlta;
  }

  public double getBaja() {
    return pBaja;
  }

  public String toString() {
    return "[Presion baja: " + pBaja + "; Presion alta: " + pAlta + ";]";
  }

  public boolean esNormal() {
    return pBaja >= 7 && pAlta >= 12 && !esAlta();
  }

  public boolean esAlta() {
    return pBaja > 9 || pAlta > 14;
  }

  public int pulso() {
    return (int)(pAlta - pBaja);
  }

  public boolean esIgual(Tension c) {
    return pBaja == c.getBaja() && pAlta == c.getAlta();
  }

}//ENDOF: class TensionTupla
