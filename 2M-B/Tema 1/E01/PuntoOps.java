package t01.e01;

public class PuntoOps {
	
	/**
	 * 
	 * @param p : Un punto cualquiera
	 * @return true si el punto esta en el origen o false si no
	 */
	public boolean estaEnOrigen(Punto p) {
		
		// El punto p solo estara en el origen si la distancia al origen es 0
		return p.distanciaAlOrigen() == 0;
		
	}
	//-------------------------------------------------------------------------------

	/**
	 * 
	 * @param p1 : Un punto cualquiera
	 * @param p2 : Otro punto cualquiera
	 * @return La distancia entre ambos puntos
	 */
	public double distancia(Punto p1, Punto p2) {
		
		// Usamos la formula de la distancia
		return Math.sqrt(Math.pow(p2.x() - p1.x(), 2) + Math.pow(p2.y(), p1.y()));
		
	}
	//-------------------------------------------------------------------------------
	
	
}
