package gestionpedidos.pedido;

import gestionpedidos.transportes.Transporte;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public class Pedido {
	// C�DIGO DE APOYO
	private Cliente cliente;
	private PlatoComida[] comidas;
	private Restaurante restaurante;
	private double importe;
	private Transporte transporte;
	private double peso;

	public Pedido(Cliente cliente, PlatoComida[] comidas, Restaurante restaurante) {
		this.cliente = cliente;
		this.comidas = comidas;
		this.restaurante = restaurante;
		for (int i = 0; i < comidas.length; i++) {
			importe += comidas[i].getPrecio();
			peso += comidas[i].getPeso();
		}
	}


	public double getPeso(){
		return peso;
	}


	public double coste(Transporte transporte){
		return importe +
			transporte.coste(
				restaurante.getCodigo()
			) +
			transporte.coste(
				restaurante.getCodigo(),
				cliente.getCodigo()
			);
	}

	// C�DIGO DE APOYO
	public double getImporte(){
		return importe;
	}

	// C�DIGO DE APOYO
	public Transporte getTransporte() {
		return transporte;
	}

	// C�DIGO DE APOYO
	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	// C�DIGO DE APOYO
	public Cliente getCliente(){
		return cliente;
	}

	// C�DIGO DE APOYO
	public Restaurante getRestaurante(){
		return restaurante;
	}
}
