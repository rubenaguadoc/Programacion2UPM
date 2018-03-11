package t00.e05;

/*
 * @author PrinceKiwii
 */


public class Fraseador {

	String[] frases = new String[100]; // Uso 100 por poner algo xd
	
	// Lo primero, como siempre, es crear un constructor para el objeto de Fraseador
	// Luego podemos simplemente seguir la especificacion
	Fraseador() {
		
		System.out.println("Hey There! Im an Empty Constructor");
		// Hago esto porque me apetece y puedo
		
	}
	//-------------------------------------------------------------------
	
	
	Fraseador(String archivo) {
		
		// En este constructor lo que tenemos que hacer es cargar las frases del 
		// archivo "archivo" dentro de "frases"
		// Me da pereza hacerlo aqui, asi que voy a llamar al objeto del FraseadorAf
		FraseadorAF f = new FraseadorAF();
		f.cargar(archivo, frases);
		// Dat easy, ya esta hecho
		
	}
	//-------------------------------------------------------------------
	
	// Supongo que se refiere a las frases
	public int longitud() {
		
		// Otra vez creamos el objeto
		FraseadorAF f = new FraseadorAF();
		// Devolvemos la longitud encontrada por eso
		return f.longitud(frases);
		
	}
	//-------------------------------------------------------------------
	
	// Aqui lo que nos toca hacer es convertir las frases en un String, creo
	public String toString() {
		
		// Voy a hacerlo bonito:
		String miam = "[ "; // Este String guardara todos nuestras frases
		
		// Iteramos por cada elemento desde 0 hasta la longitud
		for(int i = 0; i < longitud(); ++i) {
			
			String s = frases[i]; // Guardamos la frase seleccionada en un String
			
			// En caso de que sea el primer elemento, (solo pq quiero que salga bonito)
			if( i == 0) {
				
				miam += s; // Anadimos la frase elegida a 'miam'
				
			}
			else {
				
				miam += " , " + s;
				
			}
			
			
		}
		
		return miam + " ]";
		
		
	}
	//-------------------------------------------------------------------
	
	// Quermos una frase aleatoria
	
	public String fraseAleatoria() {
		
		// Preparamos el objeto
		FraseadorAF f = new FraseadorAF();
		
		// Ahora devolvemos la frase aleatoria en "frases"
		return f.fraseAleatoria(frases); 
		
	}
	//-------------------------------------------------------------------
	
	
}
/*
 
 ░░░▄▄▄▄▄▓▓▓▄▄▄░░░░░ 
░░░░▄▄▓▀▀▀▀▀▀▓▓▓▓▓▓▄░░░ 
░░▄▄▓▀▀░░░░░░░▒▒▒▒▒▀▓▄░ 
░▐▓▓▌░░░░░░░░░░░░▒▒▒▒▓▌ 
░▐▓▒░░▄▒▒▓▄▄▒▒▒░▒▄▄▄▒▒▓ 
░▓▓▌░░░░░▒▒▒▒▀▒▒▓▓▓▓▓▓▓ 
░▐▓░░░░▒▒▓(◐)▓░░░▒▓▓(◐)▒▓ 
█░▀▄░█▄█▀▄▄░▀░▀▄▄▀░░█░█ 
░█░░░▀▄█▄█░█▀▄▄▄▄▄▀██░█ 
░░█░░░░█░███▄█▄█▄███░░█ 
░░░█░░░▀▀█░█▀█▀█▀███░█ 
░░░░▀▄░░░░▀▀▄█▄█▄█▄▀░█ 
░░░░░░▀▄▄░▒▒▒░░░░░░░░░█ 
░░░░░░░░░▀▀▄▄▄▄▄▄▄▄▄▄▀
 
 */
