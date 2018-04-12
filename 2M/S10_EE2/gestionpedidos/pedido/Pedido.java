package gestionpedidos.pedido;

import gestionpedidos.transportes.Moto;
import anotacion.*;

@Programacion2 (
  nombreAutor1 = "Rubén",
  apellidoAutor1 = "Aguado Cosano",
  emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
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
		for (int i = 0; i < comidas.length; i++) {
			this.importe += comidas[i].getPrecio();
		}
	}


	public double coste(Moto moto){
		return moto.coste(restaurante.getCodigo()) + moto.coste(restaurante.getCodigo(), cliente.getCodigo()) + importe;
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
