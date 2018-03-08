package ee1;

public class RevisarTensiones {

	//  Retrieves an array with all the high Blood Pressures given an array of blood pressures
	public static Tension[] lasTAltas(Tension[] tensiones) {
		
		Tension[] tensiones_altas = new Tension[cuantasAltas(tensiones)];
		for(int i = 0, j = 0; i < tensiones.length; ++i) {
			
			if(tensiones[i].esAlta()) {
				
				tensiones_altas[j] = tensiones[i];
				++j;
				
			}
			
		}
		
		return tensiones_altas;
		
	}
	//----------------------------------------------------
	
	// Calculates the quantity of Tensions that are too high
	public static int cuantasAltas(Tension[] tensiones) {
		
		int cantidad_altas = 0;
		// for(Tension T : tensiones)
		for(int i = 0; i < tensiones.length; ++i) {
			
			if(tensiones[i].esAlta()) {
				
				++cantidad_altas;
				
			}
			
		}
		
		return cantidad_altas;
		
	}
	
	// Main Method
	public static void main(String[] args) {
		
		// Creditos @JMB y JGF
		// cuz T00 L4ZY 
		Tension t1 = new Tension(8.0, 13.0);  // ok
		Tension t2 = new Tension(9.0, 16.0);  // alta
		Tension t3 = new Tension(10.0, 13.0); // hiper
		Tension t4 = new Tension(8.0, 16.0);  // alta
		Tension t5 = new Tension(10.0, 15.0); // hiper
		Tension t6 = new Tension(5.0, 9.0);   // hipo
		Tension t7 = new Tension(10.0, 15.0); // hiper
		
		Tension[] tensiones = {t1, t2, t3, t4, t5, t6, t7};
		
		System.out.printf("Tensiones: %d\n", cuantasAltas(tensiones));
		
		
		Tension[] tensiones_altas = lasTAltas(tensiones);
		
		for(int i = 0; i < tensiones_altas.length; ++i) {
			
			System.out.print(tensiones_altas[i].toString() + ", ");
			
		}
		
		
		
	}
	//----------------------------------------------------
	
}
