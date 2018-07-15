package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public abstract class Furgoneta extends Transporte{
	private double tara;

  public Furgoneta(String codigo, Mapa mapa, double tara) {
    super(codigo, mapa);
		this.tara = tara;
  }

	public double getTara(){
		return tara;
	}

}
