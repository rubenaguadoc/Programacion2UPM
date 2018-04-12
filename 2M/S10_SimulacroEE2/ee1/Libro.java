package ee1;
import anotacion.Programacion2;
import fecha.Fecha;

@Programacion2 (
  nombreAutor1 = "Rubén",
  apellidoAutor1 = "Aguado Cosano",
  emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)


public class Libro {
  private String titulo, autor;
  private Fecha fechaPublicacion;
  private int nVecesPrestado;

  public Libro(String titulo, String autor, Fecha fechaPublicacion) {
    this.titulo = titulo;
    this.autor = autor;
    this.fechaPublicacion = fechaPublicacion;
    // this.nVecesPrestado = 0;
  }

  public boolean esIgual(Libro otro) {
    return otro.getTitulo().equals(titulo) && otro.getAutor().equals(autor) && otro.getFechaPublicacion().equals(fechaPublicacion);
  }

  public void prestado() {
    nVecesPrestado++;
  }

  public String toString() {
    return "Título, Autor, leído: " + nVecesPrestado;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public Fecha getFechaPublicacion() {
    return fechaPublicacion;
  }

  public int getNVecesPrestado() {
    return nVecesPrestado;
  }

}
