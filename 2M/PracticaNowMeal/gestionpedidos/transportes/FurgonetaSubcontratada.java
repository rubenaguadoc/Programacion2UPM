package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public class FurgonetaSubcontratada extends Furgoneta{
	private double eurosPKm = 1;

  public FurgonetaSubcontratada(String codigo, Mapa mapa, double tara) {
    super(codigo, mapa, tara);
  }

	@Override
  public double coste(String codPosOrigen, String codPosDestino) {
		return (super.getTara() < 1000?1:1.10) * eurosPKm * super.getMapa().distancia(codPosOrigen, codPosDestino);
  }

	public void setEurosPKm(double eurosPKm) {
		this.eurosPKm = eurosPKm;
	}

}
