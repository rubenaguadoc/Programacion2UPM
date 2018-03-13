package t01.e07;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author PrinceKiwii
 * @see Me disculpo por la absencia de la letra ñ pero uso el US QWERTY y sinceramente me da pereza cambiar al ES QWERTY Cada Vez.
 * 
 */
public class Fecha {

	//=========================================================================================================
	// 											VARIABLES DE CAMPO
	//=========================================================================================================
		
	
	private int year;
	private int month;
	private int day;
	
	//=========================================================================================================
	// 											CONSTRUCTORES
	//=========================================================================================================
		
	
	/**
	 * Constructor de 'Fecha'
	 */
	Fecha() {
		
		
		
	}
	//---------------------------------------------------------------
	
	/**
	 * Constructor que toma los siguientes parametros:
	 * @param year : input del ano
	 * @param month: input del mes
	 * @param day : input del dia
	 */
	Fecha(int year, int month, int day) {
		
		this.year = year; // Nuestro Año
		this.month = month; // Nuestro mes
		this.day = day; // Nuestro dia
				
	}
	//---------------------------------------------------------------
	
	/**
	 * Constructor que recibe un String en el formato "dd/mm/yyyy"
	 * @param date : String en el formato "dd/mm/yyyy"
	 */
	Fecha(String date) {
		
		// Esto es un poco mas complicado
		// asumamos que el String de Date viene en el formato dd/mm/yyyy
		// Entonces, todo lo que vaya antes de la primera / seran los dias
		// Todo lo que vaya despues de la segunda (y ultima) / seran los años
		// Y todo lo que vaya entre la ultima y la primera barra seran los meses
		
		// Ahora nos encontramos un dilema: Forzamos al usuario a siempre poner 2 cifras
		// para el dia y el mes, y 4 para los años? o lo hacemos de una manera en la cual
		// No tengamos que obligar al usuario a nada?
		// Yo lo voy a hacer de manera que no tengamosque obligarle
		
		// Algoritmo:
		// 1) Determinamos las posiciones de las '/'; 
		// Como solo hay 2 de ellas podemos tratarlo como la primera aparicion del 
		// char '/' y la ultima aparicion del char '/'.
		
		// Por lo tanto, podriamos usar la libreria de Java para los Strings
		// de la siguiente manera:
		// int i1 = date.indexOf('/'); // Esto nos dara el primer indice
		// int i2 = date.lastIndexOf('/'); // Esto no dara el segundo
		
		// Sin embargo, me apetece crear mi propia funcion para hacerlo
		// asi que, Let's Go! 
		
		int[] indices = listaIndices('/', date, 0);
		
		// Sabemos que en esta situacion, deberian haber 2 barras; Por lo tanto, len(indices) = 2 
		int i1 = indices[0]; // La primera '/'
		int i2 = indices[1]; // La segunda '/'
		
		// 2) Ahora debemos dividir el String date en otros mas peque;os
		// para ello, vamos a usar substring (me da pereza usar otras cosas mas)
		
		String dd = date.substring(0, i1); // los dias ocupan desde el primer caracter hasta la posicion de la primera / - 1
		String mm = date.substring(i1 + 1, i2); // Los meses estan entre las dos posiciones de las barras
		String yy = date.substring(i2 + 1); // Y los anos estan entre la ultima posicion y el final del String
		// o alternativamente date.substring(i2, date.length);, son equivalentes
		
		// Otra opcion es usar expresiones Regex, y usar String.split()
		
		// String[] arr = date.split("/");
		
		// 3) Asignamos cada uno, convirtiendo los Strings a enteros:
		
		this.day   = Integer.parseInt(dd); // Convertimos a entero
		this.month = Integer.parseInt(mm);
		this.year  = Integer.parseInt(yy);
		
		// Si usaste expresiones regex y date.split("/"), entonces:
		
		// this.day = Integer.parseInt(arr[0]);
		// this.month = Integer.parseInt(arr[1]);
		// this.year = Integer.parseInt(arr[2]);
		
	}
	//---------------------------------------------------------------
	
	//=========================================================================================================
	// 											GETTERS
	//=========================================================================================================
	
	
	/**
	 * @return El dia en esta fecha (this.day)
	 */
	public int dia() {
		
		return this.day;
		
	}
	//---------------------------------------------------------------
	
	/**
	 * @return El mes en esta fecha (this.month)
	 */
	public int mes() {
		
		return this.month;
		
	}
	//---------------------------------------------------------------
	
	/**
	 * @return El ano en esta fecha (this.year)
	 */
	public int ano() {
		
		return this.year;
		
	}
	//---------------------------------------------------------------
	
	//=========================================================================================================
	// 											METODOS DEL OBJETO
	//=========================================================================================================
		
	/**
	 * 
	 * @param year : el ano que queremos comprobar
	 * @return true si el ano es bisiesto y false si no.
	 */
	public boolean esBisiesto(int year) {
		
		// Un ano es bisiesto si se cumplen las siguientes condiciones:
		// o El ano es multiplo de 4 Y no de 100
		// o El ano es multiplo de 400.
		// Por ejemplo, 1600 fue bisiesto, pero 1700 no.
		// Si quereis saber el porque de esto, buscadlo en google
		// las matematicas con respecto a los calendarios son bastante duras, sobretodo conceptualmente.
		
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
	}
	//---------------------------------------------------------------
	
	/**
	 * 
	 * @param year : el ano del cual queremos medir los dias que tiene febrero
	 * @return el numero de dias que tiene febrero del ano 'year'
	 */
	public int diasDeFebrero(int year) {
		
		// Si no entendeis la logica ternaria, funciona de la siguiente manera:
		// Asumamos que tenemos una pregunta: Eres Tont@ ? 
		// Asumamos que no lo eres en la vida real; 
		// Entonces tienes 2 posibles respuestas: Si, y No.
		// En logica ternaria, podriamos decir esto de la siguiente manera:
		// Eres Tont@ ? Si : No;
		// Solo que en lugar de Si pondriamos aquello que ocurre si la respuesta a la pregunta es Si. 
		// Y en el lugar del No, pondriamos aquello que ocurriria si la respuesta a la pregunta es No.
		// Ahora bien, supongamos que si eres tonto en la vida real, y para ti hay mas respuestas que Si y No.
		// Entonces, no te preocupes! Java sabe que hay tontos en el mundo, y por ello te permite meter ternarios 
		// dentro de otros ternarios:
		// Eres Tont@ ? (Eres Muy Tont@ ? Si : No) : No;
		// Y asi sucesivamente
		// vamos, es una manera de hacer preguntas y evaluarlas a true o false (un valor booleano)s
		// es como un if contraido
		return esBisiesto(year) ? 29 : 28;
		
	}
	//---------------------------------------------------------------
	
	/**
	 * 
	 * @return El Numero de dias del mes
	 */
	public int diasDelMes() {
		
		// Hay muchisimas maneras de hacer esto
		// Lo mas simple seria esto:
		//if((this.month == 1) || (this.month == 3) || (this.month == 5) || (this.month == 7) || .....etc) => return 31;
		// y luego basicamente lo mismo con los de 30
		// y finalmente if(esBisiesto(this.year)) => return diasDeFebrero(this.year);
		// No necesitariamos decir && this.month = 2 porque si ya pasamos el resto eso implica que solo hay una posibilidad
		
		// Pero eso es demasiado aburrido para mi xD
		// y como ayer estaba un 'poquito' borracho saque una formulita muy divertida:
		
		int dias = 0; // Inicializamos una variable para guardar los dias del mes
		if(this.month == 2 ) {
			
			dias = diasDeFebrero(this.year);
			
		}
		else {
			
			// Si no entendeis como funciona esto, pedidme que os lo explique en persona.
			// Si no os apetece, simplemente usad la manera larga y tediosa y aburrida y molesta y fea
			dias = 30 + (this.month + ((int)(this.month / 8)))  % 2;
			
		}
		
		return dias; // Devolvemos los dias
		
	}
	//---------------------------------------------------------------
	
	/**
	 * 
	 * @param f : Objeto del tipo fecha
	 * @return Boolean que evalua a true si los objetos contienen los mismos datos
	 */
	public boolean esIgual(Fecha f) {
		
		return (this.day == f.dia()) && (this.month == f.mes()) && (this.year == f.ano());
		
	}
	//---------------------------------------------------------------
	
	/**
	 * 
	 * @param f : Objeto del tipo Fecha
	 * @return Boolean que evalua a true si este objeto es menor que f en cuanto al valor de su fecha
	 */
	public boolean esMenor(Fecha f) {
		
		// Hay varias maneras de hacer esto. La mas intuitiva es ir comparando.
		// la verdad me da bastante pereza explicar esto asi que simplemente pensad porque deberiais entenderlo
		if(f.ano() > this.year) {
			
			return true;
			
		}
		else if(f.mes() > this.month && !(f.ano() < this.year)) {
			
			return true;
			
		}
		else if(f.dia() > this.day && !(f.mes() < this.month) && !(f.ano() < this.year)) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}
	//---------------------------------------------------------------
	
	//---------------------------------------------------------------
	
	/**
	 * @return La Fecha al pasar un dia
	 */
	public Fecha fechaSiguiente() {
		
		int dia = this.day + 1;
		int mes = this.month;
		int ano = this.year;
		
		// comprobamos que los dias sean factibles:
		// podemos asumir que nuestra fecha ya era correcta
		// y que por lo tanto, solo puede ser mayor que los dias del mes por 1 (ya que acabamos de anadir 1)
		if(dia > diasDelMes()) {
			
			// EN el caso de que nos hayamos pasado al sumar el dia, pasamos al primer dia del siguiente mes
			dia = 1; // Primer Dia
			++mes; // El Siguiente mes
			
		}
		// En caso de que nos pasarmos con el mes...
		if(mes > 12) {
			
			mes = 1; // Primer mes
			++ano; // El Siguiente ano
			
		}
		// Este ultimo if podria ir dentro del anterior if. Yo lo pongo aqui en el caso de que la fecha no sea correcta,
		// al ponerlo aqui este metodo la corregira automaticamente si la ponemos aqui.
		
		Fecha fecha = new Fecha(ano, mes, dia); // Creamos una nueva fecha con los nuevos datos del dia siguiente
		
		return fecha; // Devolvemos el objeto
		
		
		
	}
	//---------------------------------------------------------------
	
	/**
	 * @return true si la fecha es correcta ( no hay mas dias ni meses de los que pueden haber)
	 */
	public boolean esFechaCorrecta() {
		
		// Otra vez, simplemente comparamos si el dia,y mes estan entre un intervalo valido de valores
		// Los intervalos son:
		// o 0 < Dia <= diasDelMes()
		// o 0 < Mes < 13 
		// Tened en cuenta que son datos discretos
		if((this.day > 0 && this.day <= diasDelMes()) && (this.month > 0 && this.month < 13)) {
			
			return true;
			
		}
		return false;
		
	}
	//---------------------------------------------------------------
	
	/**
	 * @return Los datos de la fecha contenida en este objeto en formato dd/mm/yyyy
	 */
	@Override
	public String toString() {
		
		return this.day + "/" + this.month + "/" + this.year;
		
	}
	//---------------------------------------------------------------
	
	
	//=========================================================================================================
	// 											FUNCIONES AUXILIARES
	//=========================================================================================================
			
	
	//---------------------------------------------------------------
	
	/**
	 * @return La Fecha de Hoy en un arhivo del formato Fecha
	 */
	public static Fecha hoy() {
		
		// Vale pues vamos a empezar;
		// Como es un metodo del tipo static, eso nos revela que se refiere a la fecha real de hoy, y no 
		// a la fecha de hoy (la fecha actual para este objeto)
		// No nos queda mas remedio que usar la API de Java (que yo sepa)
		
		Date date = new Date(); // Creamos un objeto de Fecha del api de Java
		// 
		
		// Para poder usar Calendar desde un metodo / funcion static hay que especificar una instancia
		// de ahi viene el getInstance
		int dia = Calendar.getInstance().get(Calendar.DATE);
		int mes = Calendar.getInstance().get(Calendar.MONTH) + 1; // Para nosotros Enero = 1, para esto Enero = 0
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		
		// Pero basicamente usamos eso para ahora crear nuestro objeto de Fecha
		Fecha hoy = new Fecha(ano, mes, dia);
		return hoy;// y devolverlo
		
	}
	//---------------------------------------------------------------
	
	//=========================================================================================================
	// 											FUNCIONES AUXILIARES
	//=========================================================================================================
			
	
	/**
	 * 
	 * @param ch : caracter constante que estamos buscando
	 * @param str : String constante en el que estamos buscando
	 * @param iFrom : lista de indices a partir de los cuales tenemos que buscar;
	 * 				  asumimos que por cada indice de iFrom, existe un ch que encontrar.
	 * @return int[] : contiene todos los indices de aparicion de ch en un string
	 */
	private static int[] listaIndices(final char ch, final String str, int ... iFrom) {
		
		// Estaba un poco tomado cuando hice esto, no judge pls
		
		// Para empezar, debemos comprobar si hemos recibido algun indice del que partir:
		if(iFrom.length == 0) {
			
			iFrom = new int[1]; 
			// Si no hemos recibido nada, len(iFrom) = 0 -> forzamos iFrom a ser un array de 1 elemento
			// de manera que len(iFrom) = 1, iFrom[0] = 0;
			
		}
		
		// Ahora tenemos que declarar algunas variables de campo
		
		char[] arr = str.toCharArray(); //Para empezar convertimos el String a un array
		int len = arr.length; // Guardamos la longitud de este array para no calcular a longitud en cada iteracion de bucle
				
		// Como maximo, pueden haber tantos ch en el string como caracteres hayan:
		// String "//////////"; len = 10, y por lo tanto como maximo habran 10 indices que devolver
		int[] indices = new int[len]; 
		int k = iFrom[0]; // declaramos e inicializamos la variable k con el primer valor encontrado en iFrom -> iFrom[0]
		// LLegados a este punto, iFrom[0] siempre sera, como minimo, 0
		int i = 0; // declaramos e inicializamos un contador para el indice
		
		// Ahora iteramos desde k (o iFrom[0]) hasta len y desde i...len
		// ya que ninguno de los dos puede mayor que len
		while(k < len && i < len) {
			
			// Ahora comparamos; Si el caracter en la posicion <k> = ch, entonces hemos encontrado un String
			if(arr[k] == ch) {
			
				// Lo almacenamos en nuestra coleccion de indices
				indices[i] = k;
				
				// Si i + 1 < la cantidad del argumentos, hacemos que k sea el siguiente argumento
				// ya que asumimos que solo habra 1 ch entre 2 argumentos dados
				if(i + 1 < iFrom.length) {
					
					k = iFrom[++i]; // lel
					
				}
				else { // Si no es asi, seguimos encontrando los siguientes elementos
					
					// incrementamos las variables contadoras en 1
					++k; 
					++i;
					
					// antipasta
					{
						// lmao
						int a = i + k;
						boolean is_pryme = a % 2 == 0;
						// hehe its even
						
					}
					// cuz no copypasta 4 u
				}
				
			}
			else {
				
				++k; // No hemos encontrado nada, asi que aumentamos k al siguiente
				
			}
					
		}
		
		// Ahora eliminamos todos los elementos del array que no nos interesan
		int[] lmeo = new int[i];
		
		for(int j = 0; j < lmeo.length; ++j) {
			
			lmeo[j] = indices[j];
			
		}
		
		return lmeo;
		
	}
	//---------------------------------------------------------------

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

