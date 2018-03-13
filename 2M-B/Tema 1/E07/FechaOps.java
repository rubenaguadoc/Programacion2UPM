package t01.e07;

public class FechaOps {

	/**
	 * 
	 * @param f1 : Una fecha
	 * @param f2 : Otra Fecha
	 * @return Si f1 <= f2
	 */
	public boolean esMenorOIgual(Fecha f1, Fecha f2) {
		
		// Aqui ya hemos desarrollado las funciones asi que las usamos:
		return (f1.esMenor(f2)) || (f1.esIgual(f2));
		
	}
	//-----------------------------------------------
	
	/**
	 * 
	 * @param f1 : Una fecha cualquiera
	 * @param dia : un dia, 0 < dia <= diasDelMes()
	 * @param mes : un mes, 0 < mes < 13
	 * @return
	 */
	public boolean esMenorOIgual(Fecha f1, int dia, int mes) {
		
		// Como debemos ignorar los anos, simplemente decimos que los anos son iguales y ya no afectaran al calculo
		Fecha f2 = new Fecha(dia, mes, f1.ano());
		
		return esMenorOIgual(f1, f2);
		
	}
	//-----------------------------------------------

	/**
	 * 
	 * @param f : Una Fecha cualquiera
	 * @param nac : Fecha de nacimiento
	 * @return
	 */
	public int edad(Fecha f, Fecha nac) {
		
		// Primero verficamos que nac < f, porque sino va a ser imposible;
		if(esMenorOIgual(f, nac)) {
			
			return -1; // En caso de que falten anos para que nazca
			
		}
		
		// AHora lo que tenemos que mirar es si los dis y meses son menores:
		
		if(esMenorOIgual(f, nac.dia(), nac.mes())) {
			
			// Como son menores, la edad sera la diferencia de anos
			return f.ano() - nac.ano();
			
		}
		
		// Si no son menores o iguales, sera la diferencia de los anos - 1
		return f.ano() - nac.ano() - 1;
		
	}
	//-----------------------------------------------
	
	/**
	 * 
	 * @param f : Una fecha cualquiera
	 * @param f1 : Una fecha cualquiera, limite izquierdo del intervalo
	 * @param f2 : Una fecha cualquiera, limite derecho el intervalo
	 * @return true si f1 <= f <= f2; false si no es asi
	 */
	public boolean estaEnIntervalo(Fecha f, Fecha f1, Fecha f2) {
		
		// Queremos comprobar que f1 <= f <= f2
		// Esto implica que f1 <= f y f <= f2
		// Por lo tanto:
		return (esMenorOIgual(f1, f)) && (esMenorOIgual(f, f2));
		
	}
	//-----------------------------------------------

	/**
	 * 
	 * @param f1 : Una Fecha Cualquiera
	 * @param f2 : Otra fecha cualquiera
	 * @return La que sea mas pequena de las 2
	 */
	public Fecha minima(Fecha f1, Fecha f2) {
		
		// Esta nos pide que encontremos la minima de 2 fechas.
		// Muy facil: Solo tenemos que comprobar si f1 < f2
		// Si f1 < f2, entonces f1 es minima; 
		// Si esto no se cumple, entonces o bien f1 y  f2 son iguales, o f1 > f2;
		// En cualquier caso, devolver f2 nos serviria
		return esMenorOIgual(f1, f2) ? f1 : f2;
	}
	//-----------------------------------------------
	
	/**
	 * 
	 * @param f : Una fecha inicial
	 * @param n : la cantidad de dias que hay que avanzar
	 * @return La fecha una vez se hayan anadido n dias a f
	 */
	public Fecha fechaTrasDias(Fecha f, int n) {
		
		// otra vez, una facil; SOlo tenemos que iterar hasta que se acaben los dias que queremos avanzar
		// Una vez avanzados, solo tenemos que devolver la nueva fecha.
		
		Fecha f2 = f.fechaSiguiente(); // Almacenamos la siguiente fecha en un nuevo objeto de tipo Fecha
		--n; // Al hacer esto, ya hemos gastado un dia, asi que quitamos un dia la cantidad de dia que tenemos que avanzar
		
		// Iteramos hasta que se nos acaben los dias
		for(; n >= 0; --n) {
			
			// Cada nuevo dia, almacenamos el siguiente dia en nuestro objeto
			f2 = f2.fechaSiguiente();
			
		}
		
		// Devolvemos
		return f2;
		
	}
	//-----------------------------------------------
	
	/**
	 * 
	 * @param f1 : una fecha cualquiera
	 * @param f2 : otra fecha cualquiera
	 * @return La diferencia en dias entre las 2 fechas. 
	 */
	public int diasEntreFechas(Fecha f1, Fecha f2) {
		
		// Para calcular los dias entre dos fechas tenemos varias opciones.
		/*
		// Para empezar, una cutre solucion recursiva:
		// Digo que es una solucion bastante cutre porque en fechas muy grandes HAY MUCHO RIESGO
		// de sufrir un Error de Stack Overflow
		// es mas, es posible que en muchas fechas no necesariamente grandes haya un stack oferflow
		
		// primero el caso base: si las 2 fechas son iguales => return 0
		
		if(f1.esIgual(f2)) {
			
			return 0;
			
		} // Luego comprobamos si f1 es menor que f2
		else if(f1.esMenor(f2)) {
			
			// Si f1 < f2, entonces debemos anadir 1 dia, y calcular la cantidad de dias entre el dia siguiente a f1 y f2:
			
			return 1 + diasEntreFechas(f1.fechaSiguiente(), f2);
			
		}
		else {
			
			// Si ninguna de las condiciones anteriores se ha cumplido, entonces f2 < f1
			// por lo que empezamos a calcular la diferencia negativamente (no tenia porque hacer esto pero ya que estaba...)
			return -1 + diasEntreFechas(f1, f2.fechaSiguiente());
			// En caso de que no se quiera convertir esto a negativo, lo que se puede hacer es:
			
			// return 1 + diaasEntreFechas(f2.fechaSiguiente(), f1)
			// o incluso return diasEntreFechas(f2, f1); 
			// pero esta ultima no seria demasiado buena porque estariamos obligando a la funcion a llamarse a si misma una vez mas
			// lo cual podria ser la diferencia entre un StackOverflow o no.
			
			
		}
		*/
		// Por el contrario, una mejor manera (iterativa) seria:
		
		int dias = 0; // Iniciamos la cantidad de dias
		// Mientras f1 no sea = f2:
		while(!f1.esIgual(f2)) {
		
			// Pasamos un dia mas
			f1 = f1.fechaSiguiente();
			++dias; // anadimos el dia que acabamos de pasar
	
		}
		return dias;
		
		
		
	}
	//-----------------------------------------------
	
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

