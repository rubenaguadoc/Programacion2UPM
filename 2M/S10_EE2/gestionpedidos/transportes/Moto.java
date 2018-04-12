package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.*;

@Programacion2 (
  nombreAutor1 = "Rubén",
  apellidoAutor1 = "Aguado Cosano",
  emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public class Moto {
	private String codigo;
	private double eurosPKm = 2;// cada moto puede negociar un precio distinto
	private Mapa mapa;

	public Moto(String codigo, Mapa mapa){
		this.codigo = codigo;
		this.mapa = mapa;
	}

	public double coste(String codOrigen, String codDestino){
		return mapa.distancia(codOrigen, codDestino) * eurosPKm;
	}

	public double coste(String codDestino){
		return mapa.distancia(this.codigo, codDestino) * eurosPKm;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getEurosPKm() {
		return eurosPKm;
	}

	public void setEurosPKm(double eurospkm) {
		this.eurosPKm = eurospkm;
	}


}
