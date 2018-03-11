package t00.e05;

/*
 * @author PrinceKiwii
 */

public class FraseadorTest {

	// Main Method
	public static void main(String[] args) {
		
		// Aqui iran todas las pruebas para el objeto Fraseador
		Fraseador F = new Fraseador(); // No Problem
		String nombre_archivo = "misFrases.txt"; // Creamos un string con el nombre del archivo
		F = new Fraseador(nombre_archivo); // Deberia cargar las frases
		System.out.printf("El objeto Fraseador de %s tiene una longitud de %d, y una frase Aleatoria es : <%s>%n",
				nombre_archivo,
				F.longitud(),
				F.fraseAleatoria());
		System.out.printf("Todas sus Frases son: %s%n", F.toString());
		
	}
	
}

/* 								MY K0D1G0 LMAO
▒▒▒▒▒▒▒▒▒▄▄▄▄▒▒▒▒▒▒▒ ▒▒▒▒▒▒▄▀▀▓▓▓▀█▒▒▒▒▒▒ ▒▒▒▒▄▀▓▓▄██████▄▒▒▒▒ ▒▒▒▄█▄█▀░░▄░▄░█▀▒▒▒▒ ▒▒▄▀░██▄░░▀░▀░▀▄▒▒▒▒ ▒▒▀▄░░▀░▄█▄▄░░▄█▄▒▒▒ ▒▒▒▒▀█▄▄░░▀▀▀█▀▒▒▒▒▒ ▒▒▒▄▀▓▓▓▀██▀▀█▄▀▀▄▒▒ ▒▒█▓▓▄▀▀▀▄█▄▓▓▀█░█▒▒ ▒▒▀▄█░░░░░█▀▀▄▄▀█▒▒▒ ▒▒▒▄▀▀▄▄▄██▄▄█▀▓▓█▒▒ ▒▒█▀▓█████████▓▓▓█▒▒ ▒▒█▓▓██▀▀▀▒▒▒▀▄▄█▀▒▒ ▒▒▒▀▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 
*/