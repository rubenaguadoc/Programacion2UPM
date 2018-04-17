package gestionpedidos.transportes;

import gestionpedidos.mapa.Mapa;
import anotacion.*; 

@Programacion2 (
	nombreAutor1 = "Kevin Alberto",                 // (del alumno 1)
	apellidoAutor1 = "Lopez Porcheron",  // (del alumno 1)
	emailUPMAutor1 = "kevinalberto.lopez.porcheron@alumnos.upm.es",   // (del alumno 1)	
	nombreAutor2 = "Manuel",                 // (del alumno 2 si lo hay)
	apellidoAutor2 = "Leira Garcia-Baamonde",  // (del alumno 2 si lo hay)
	emailUPMAutor2 = "manuel.leirag@alumnos.upm.es"    // (del alumno 2 si lo hay)
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
		
		return mapa.distancia(codOrigen, codDestino) * this.eurosPKm;
		
	}
	
	public double coste(String codDestino){
		
		return this.coste(this.codigo, codDestino);
		
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
