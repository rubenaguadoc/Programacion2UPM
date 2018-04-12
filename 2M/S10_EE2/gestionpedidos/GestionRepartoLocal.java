package gestionpedidos;

import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Moto;
import list.ArrayList;
import anotacion.*;

@Programacion2 (
  nombreAutor1 = "Rubén",
  apellidoAutor1 = "Aguado Cosano",
  emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
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
		Moto bestMoto = null;
		int minCoste = Integer.MAX_VALUE;
		for (int i = 0; i < motosDisponibles.size(); i++) {
			if (pedido.coste(motosDisponibles.get(i)) < minCoste) {
				bestMoto = motosDisponibles.get(i);
			}
		}
		motosDisponibles.remove(bestMoto);
		pedido.setTransporte(bestMoto);
	}


	public void notificarEntregaPedido(Pedido pedido) {
		motosDisponibles.add(0, pedido.getTransporte());
	}
}
