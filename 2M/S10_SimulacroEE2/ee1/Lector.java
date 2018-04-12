package ee1;
import anotacion.Programacion2;

@Programacion2 (
  nombreAutor1 = "Rubén",
  apellidoAutor1 = "Aguado Cosano",
  emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)


public class Lector {

  private Libro[] historicoLecura;
  private String nombre;
  private int nSocio, nLeidos;

  public Lector(int nSocio, String nombre) {
    this.nSocio = nSocio;
    this.nombre = nombre;
    historicoLecura = new Libro[10];
  }

  public boolean esIgual(Lector otro) {
    boolean sameLeidos = true;
    for (int i = 0; i < nLeidos && sameLeidos; i++) {
      if (!historicoLecura[i].equals(otro.getLibroLeido(i + 1))) {
        sameLeidos = false;
      }
    }
    return otro.getNSocio() == nSocio && sameLeidos;
  }

  public Libro getLibroLeido(int pos) {
    try {
      return historicoLecura[pos - 1];
    } catch (Exception e) {
      return null;
    }
  }

  public void leerLibro(Libro leer) {
    if (nLeidos == 10) {
      for (int i = 0; i < 9; i++) {
          historicoLecura[i] = historicoLecura[i + 1];
      }
      historicoLecura[9] = leer;
    } else {
      historicoLecura[nLeidos] = leer;
      nLeidos++;
    }
    leer.prestado();
  }

  public String getNombre() {
      return nombre;
  }

  public int getNSocio() {
      return nSocio;
  }

}
