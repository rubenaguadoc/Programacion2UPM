package gestionpedidos;

import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Moto;
import list.ArrayList;
import anotacion.*; 

@Programacion2 (
		nombreAutor1 = "Kevin Alberto",                 // (del alumno 1)
		apellidoAutor1 = "Lopez Porcheron",  // (del alumno 1)
		emailUPMAutor1 = "kevinalberto.lopez.porcheron@alumnos.upm.es",   // (del alumno 1)	
		nombreAutor2 = "Manuel",                 // (del alumno 2 si lo hay)
		apellidoAutor2 = "Leira Garcia-Baamonde",  // (del alumno 2 si lo hay)
		emailUPMAutor2 = "manuel.leirag@alumnos.upm.es"    // (del alumno 2 si lo hay)
	)

public class GestionRepartoLocal {	
	private ArrayList<Moto> motosDisponibles;

	private String getCodList(ArrayList<?> disponibles) {
		String salida = "";
		for(int i=0; i<disponibles.size(); i++)
			salida += " " + ((Moto) disponibles.get(i)).getCodigo();
		return salida;
	}
	
	public String getDisponibles(){
		return "Motos Disponibles:" + getCodList(motosDisponibles) + System.lineSeparator();		
	}
		
	public GestionRepartoLocal(){
		this.motosDisponibles = new ArrayList<>();
	}
	
	public void add(Moto moto){
		this.motosDisponibles.add(this.motosDisponibles.size(), moto);
	}	
	
	
	// si no hay ninguna moto disponible, 
	// el atributo transporte de pedido se queda a null
	public void asignarPedido(Pedido pedido){
		
		int idx = 0;
		
		if(motosDisponibles.size() == 0) {
			
			// No hacemos nada
			
		}
		else {
			
			for(int i = 0; i < motosDisponibles.size(); ++i) {
				
				double val1 = pedido.coste(motosDisponibles.get(i));
				if(pedido.coste(motosDisponibles.get(idx)) > val1) {
					
					idx = i;
					
				}
				
			}
			pedido.setTransporte(motosDisponibles.get(idx));
			motosDisponibles.removeElementAt(idx);
			
		}
		
		
	}
	
	
	public void notificarEntregaPedido(Pedido pedido) {
		
		System.out.println(motosDisponibles.size());
		this.motosDisponibles.add(motosDisponibles.size(), pedido.getTransporte());
		
	}
}
