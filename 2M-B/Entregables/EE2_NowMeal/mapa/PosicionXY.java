package gestionpedidos.mapa;

public class PosicionXY {

	private int x;
	private int y;	
	
	public PosicionXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distancia(PosicionXY posDestino) {		
		return Math.abs(x - posDestino.x) + Math.abs(y - posDestino.y);		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	

}
