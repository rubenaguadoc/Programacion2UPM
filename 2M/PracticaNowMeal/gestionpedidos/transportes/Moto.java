package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public class Moto extends Transporte{
  private double eurosPKm = 2;

  public Moto(String codigo, Mapa mapa) {
    super(codigo, mapa);
  }

  @Override
  public double coste(String codPosOrigen, String codPosDestino) {
    return eurosPKm * super.getMapa().distancia(codPosOrigen, codPosDestino);
  }

	public double getEurosPKm() {
		return eurosPKm;
	}

	public void setEurosPKm(double eurosPKm) {
		this.eurosPKm = eurosPKm;
	}

}
