package figura;
/**
 * Implementacion de una Figura-->Rectangulo<br>
 * {@code Rectangulo = (Punto centro, int ancho, int alto)}<br>
 * @since 17/4/2018
 * @version 1.0
 * @author Ruben Aguado Cosano
 */

public class Rectangulo extends Figura {
  private int anchura, altura;

  public Rectangulo (Punto centro, int ancho, int alto) {
    super(centro);
    anchura = ancho;
    altura = alto;
  }

  @Override
  public String toString () {
    return "Rectangulo: (" + super.toString() + ");";
  }

  public Punto getCentro () {
    return super.getPosicion();
  }

  public int getAnchura() {
    return anchura;
  }

  public int getAltura() {
    return altura;
  }

  @Override
  public boolean equals (Figura f) {
    if (!(f instanceof Rectangulo)) {
      return false;
    }
    Rectangulo r = (Rectangulo) f;
    return r.getAnchura() == anchura && r.getAltura() == altura && getCentro() == f.getPosicion();
  }

  @Override
  public int distA0 () {
    return getCentro().distA0();
  }

  @Override
  public int area () {
    return anchura * altura;
  }

  @Override
  public int perimetro () {
    return 2 * anchura + 2 * altura;
  }

  public void mover (int dx, int dy) {
    super.getPosicion().mover(dx,dy);
  }
}
