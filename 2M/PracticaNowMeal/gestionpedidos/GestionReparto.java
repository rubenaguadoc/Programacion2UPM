package gestionpedidos;

import gestionpedidos.mapa.Mapa;
import gestionpedidos.pedido.Pedido;
import gestionpedidos.transportes.Transporte;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)

public class GestionReparto {
	// C�DIGO DE APOYO
	private GestionRepartoLocal[] gestoresLocales;
	private Mapa mapa;

	public GestionReparto(Mapa mapa){
		this.mapa = mapa;
		gestoresLocales = new GestionRepartoLocal[4];
		for (int i = 0; i < 4; i++) {
			gestoresLocales[i] = new GestionRepartoLocal();
		}
	}

	//C�DIGO DE APOYO
	public Mapa getMapa() {
		return mapa;
	}

	// C�DIGO DE APOYO
	public String getEstadoGestorLocal(int i){
		return this.gestoresLocales[i].getDisponibles() + this.gestoresLocales[i].getEsperando();
	}

	// C�DIGO DE APOYO
	public String getEstadoGestorLocalNum(int i){
		return this.gestoresLocales[i].getCodMotosDisponibles().size() + ";" +
				this.gestoresLocales[i].getCodFurgoDisponibles().size() + ";" +
				this.gestoresLocales[i].getCodEsperandoMoto().size() + ";" +
				this.gestoresLocales[i].getCodEsperandoFurgo().size() ;
	}

	// Devuelve la zona del mapa correspondiente al código de objeto pasado por parámetros, dividiendo el mapa con sus x e y máximas por la mitad en ambos ejes.
	private int getZone(String code) {
		double halfX = mapa.getMaxCoordX()/2;
		double halfY = mapa.getMaxCoordY()/2;
		int myX = mapa.getPosicion(code).getX();
		int myY = mapa.getPosicion(code).getY();
		if(myX <= halfX) {
			if(myY <= halfY) {
				return 0;
			} else {
				return 2;
			}
		} else {
			if(myY <= halfY) {
				return 1;
			} else {
				return 3;
			}
		}
	}

	public void addTransporteLocalidad(Transporte transporte) {
		gestoresLocales[getZone(transporte.getCodigo())].add(transporte);
	}


	public void asignarPedido(Pedido pedido){
		gestoresLocales[getZone(pedido.getRestaurante().getCodigo())].asignarPedido(pedido);
	}

	public void notificarEntregaPedido(Pedido pedido){
		gestoresLocales[getZone(pedido.getRestaurante().getCodigo())].notificarEntregaPedido(pedido);
	}

}
