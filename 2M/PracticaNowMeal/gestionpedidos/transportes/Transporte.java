package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public abstract class Transporte {
  private String codigo;
  private Mapa mapa;

  public Transporte(String codigo, Mapa mapa) {
    this.codigo = codigo;
    this.mapa = mapa;
  }

  protected Mapa getMapa() {
    return mapa;
  }

  public String getCodigo() {
    return codigo;
  }

  public double coste(String codPosDestino) {
    return coste(codigo, codPosDestino);
  }

  public abstract double coste(String codPosOrigen, String codPosDestino);

}
