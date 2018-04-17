package gestionpedidos.pedido;

import anotacion.Programacion2;
import gestionpedidos.mapa.Mapa;
import gestionpedidos.mapa.PosicionXY;
import gestionpedidos.transportes.Moto; 

@Programacion2 (
		nombreAutor1 = "Kevin Alberto",                 // (del alumno 1)
		apellidoAutor1 = "Lopez Porcheron",  // (del alumno 1)
		emailUPMAutor1 = "kevinalberto.lopez.porcheron@alumnos.upm.es",   // (del alumno 1)	
		nombreAutor2 = "Manuel",                 // (del alumno 2 si lo hay)
		apellidoAutor2 = "Leira Garcia-Baamonde",  // (del alumno 2 si lo hay)
		emailUPMAutor2 = "manuel.leirag@alumnos.upm.es"    // (del alumno 2 si lo hay)
	)

public class Pedido {
	
	private Cliente cliente;
	private PlatoComida[] comidas;
	private Restaurante restaurante;
	private double importe;	
	private Moto transporte;
	
	
	public Pedido(Cliente cliente, PlatoComida[] comidas, Restaurante restaurante) {		
		
		this.cliente = cliente;
		this.comidas = comidas;
		this.restaurante = restaurante;
		
		// Importe
		this.importe = 0;
		for(PlatoComida p : comidas) {
			
			this.importe += p.getPrecio();
			
		}
		
		// Moto
		
		 Mapa mapa = new Mapa(20, 20);
		 Moto moto = new Moto("M1", mapa);
		 mapa.addObjetoEstatico("C1", new PosicionXY(3,4));
		 mapa.addObjetoEstatico("R1", new PosicionXY(4,3));
		 mapa.addObjetoDinamico("M1", new PosicionXY(7,4));
		
	}
		
	
	public double coste(Moto moto){
		
		return importe 
				+ moto.coste(this.restaurante.getCodigo())
				+ moto.coste(this.restaurante.getCodigo(), this.cliente.getCodigo());
		
	}
	
	public double getImporte(){
		
		return importe;
		
	}
	
	public Moto getTransporte() {
		return transporte;
	}

	public void setTransporte(Moto transporte) {
		this.transporte = transporte;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public Restaurante getRestaurante(){
		return restaurante;
	}
}
