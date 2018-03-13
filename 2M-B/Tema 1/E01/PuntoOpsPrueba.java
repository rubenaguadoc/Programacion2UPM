package t01.e01;

public class PuntoOpsPrueba {

	// Main Method
	public static void main(String[] args) {
		
		Punto p1 = new Punto(3, 7);
		Punto p2 = new Punto(0, 0);
		PuntoOps puntops = new PuntoOps();
		System.out.println(puntops.distancia(p1, p2));
		System.out.println(puntops.estaEnOrigen(p1) + " y " + puntops.estaEnOrigen(p2));		
		
		
	}
	//----------------------------------------------------------
	
}
