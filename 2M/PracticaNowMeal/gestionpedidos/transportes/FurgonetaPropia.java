package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public class FurgonetaPropia extends Furgoneta{
	private double velocidadMedia = 30;
	private static final double EUROSPHORA = 40;

  public FurgonetaPropia(String codigo, Mapa mapa, double tara) {
    super(codigo, mapa, tara);
  }

	@Override
  public double coste(String codPosOrigen, String codPosDestino) {
    return  (super.getTara() < 1000?1:1.10) * (EUROSPHORA / velocidadMedia) * super.getMapa().distancia(codPosOrigen, codPosDestino);
  }

	public void setVelocidadMedia(double velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}

}
