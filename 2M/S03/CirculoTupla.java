/**
 * Implementación del TAD Circulo<br>
 * {@code Circulo = (Punto centro, double radio)}<br>
 * @since 22/02/2018
 * @version 1.0
 * @author Rubén Aguado Cosano
 */

public class CirculoTupla implements Circulo{
  private double radio;
  private Punto centro;

  public CirculoTupla(Punto center, double radius){
    centro = center;
    radio = radius;
  }

  public String toString(){
    return "(Radio: " + radio + "; Centro " + centro + ")";
  }

  public Punto getCentro(){
    return centro;
  }

  public double getRadio(){
    return radio;
  }

  public void setCentro(Punto center){
    centro = center;
  }

  public void setRadio(double radius){
    radio = radius;
  }

  public boolean esIgual(Circulo c){
    if (radio == c.getRadio() && centro.getX() == c.getCentro().getX() && centro.getY() == c.getCentro().getY()) {
      return true;
    }
    return false;
  }

  public Circulo concentricoMitad(){
    return new CirculoTupla(centro, radio / 2);
  }

  public Circulo simetricoOrigen(){
    Punto simetrico = new PuntoTupla(-centro.getX(), -centro.getY());
    return new CirculoTupla(simetrico, radio);
  }

  public int posicionRelativa(Circulo c){
    double distCentro = c.getCentro().distancia(centro);
    if (distCentro < radio) {
      if (c.getRadio() == radio - distCentro) {
        if (this.esIgual(c)) {
          return SECANTES;
        }
        return TANGENTES;
      } else if (c.getRadio() < radio - distCentro) {
        return DISJUNTAS;
      } else {
        return SECANTES;
      }
    } else if (distCentro == radio) {
      if (c.getRadio() == 0){
        return TANGENTES;
      } else {
        return SECANTES;
      }
    } else {
      if (c.getRadio() == distCentro - radio) {
        return TANGENTES;
      } else if (c.getRadio() < distCentro - radio) {
        return DISJUNTAS;
      } else {
        return SECANTES;
      }
    }
  }

}//ENDOF: class CirculoTupla
