package t01.e07;

//esto es estupido dont ask me why estamos haciendolo
public class FechaTAD {

	/**
	 * 
	 * @param f : Una Fecha Cualquiera
	 * @return : esFechaCorrecta(f) => Comprueba si f conserva el formato propuesto
	 */
	public boolean INV(Fecha f) {
		
		return esFechaCorrecta(f);
		
	}
	//------------------------------------------------------
	
	/**
	 * @param f : Una Fecha Cualquiera
	 * @return : Comprueba si f conserva el formato propuesto
	 */
	public boolean esFechaCorrecta(Fecha f) {
		
		return f.esFechaCorrecta();
		
	}
	//------------------------------------------------------
	
	/**
	 * 
	 * @param f1 : Una Fecha Cualquiera
	 * @param f2 : Otra Fecha Cualquiera
	 * @return true si ambas contienen los mismos datos, false si no es asi
	 */
	public boolean esIgual(Fecha f1, Fecha f2) {
		
		return f1.esIgual(f2);
		
	}
	//------------------------------------------------------
	
	/**
	 * 
	 * @param f1 : Una Fecha Cualquiera
	 * @param f2 : Otra Fecha Cualquiera
	 * @return true si quieres suicidarte
	 * 			// es broma, solo es true si f1 < f2
	 */
	public boolean esMenor(Fecha f1, Fecha f2) {
		
		return f1.esMenor(f2);
		
	}
	//------------------------------------------------------
	
	/**
	 * 
	 * @param f : Una fecha cualquiera
	 * @return Devuelve la fecha f anadiendole 1 dia
	 */
	public Fecha fechaSiguiente(Fecha f) {
		
		return f.fechaSiguiente();
		
	}
	//------------------------------------------------------
	
}

 
 
 // Este Profe a nosotros:

▒▒▒▄▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄▄ 
▒▒█▒░░░░▄▄▄▄▀░░░░░▒▀▀▄▄▄▒▒█ 
▒█▒░░░░░▄▀▀▄▄░░░░▒▄▄▄▒▒▒▒▒▒█ 
█▒▀▄▄▒░░██▄▄▄█░░▒██▄▄█▒▒▒▒▒▒█ 
█▒▒░▄▀▄▄▄▀░░░░░░▒▒█▒▒▒▒▒▒▒▒█ 
█▒░░█▄▄░░░░░█▀░░░░▀▄▒▒▄▀▀▀▄█ 
█▒░░▀█▄█▀▀▄░▀▀▀▀▄▄▄▀▒▒▒█▒▒█ 
▒█▒░░░▀█▄▄█▀▀▀█▀▀▀█▀█▀██▒▒█ 
▒▒█▒░░░░▀██▄▄▄█▄▄▄█▄██▒▒▒▒█▄ 
▒▒▒█▒░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒█ 
▒▒▒▒▀▀▀▀▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀▀

 
 
▒▒▒▒▒▒▒▒▒▄▄▄▄▒▄▄▄▒▒▒
▒▒▒▒▒▒▄▀▀▓▓▓▀█░░░█▒▒   
▒▒▒▒▄▀▓▓▄██████▄░█▒▒
▒▒▒▄█▄█▀░░▄░▄░█▀▀▄▒▒
▒▒▄▀░██▄░░▀░▀░▀▄▓█▒▒
▒▒▀▄░░▀░▄█▄▄░░▄█▄▀▒▒
▒▒▒▒▀█▄▄░░▀▀▀█▀▓█▒▒▒
▒▒▒▄▀▓▓▓▀██▀▀█▄▀▒▒▒▒
▒▒█▓▓▄▀▀▀▄█▄▓▓▀█▒▒▒▒
▒▒▀▄█░░░░░█▀▀▄▄▀█▒▒▒
▒▒▒▄▀▀▄▄▄██▄▄█▀▓▓█▒▒
▒▒█▀▓█████████▓▓▓█▒▒
▒▒█▓▓██▀▀▀▒▒▒▀▄▄█▀▒▒
▒▒▒▀▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒

