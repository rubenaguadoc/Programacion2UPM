package fecha;

import fecha.excepciones.FechaIncorrecta;

/**
 * 
 */

/**
 * @author agonzalez
 * 
 */
public class Fecha  {// fecha

	private int dia, anio;
	private TMes mes;
		
	/**
	 * Constructor para inicializar una instancia de tipo fecha.
	 * 
	 * <br><B>PRE:</B> (dia, mes, anio) debe representar una fecha real del calendario gregoriano
	 * <br><B>POST:</B> crea una fecha con (dia, mes, anio) 
	 * 
	 * @param dia
	 *            indica el día del mes debe estar comprendido entre 1 y 31
	 * @param mes
	 *            indica el mes debe estar comprendido entre 1 y 12
	 * @param anio
	 *            indica el año
	 * @throws FechaIncorrecta
	 *             excepción que se genera si no se cumple la PRE
	 *              
	 * */
	public Fecha(int dia, int mes, int anio) throws FechaIncorrecta {
		this.dia = dia;
		if (mes > 0 && mes <= 12)
			this.mes = TMes.meses[mes - 1];
		else
			throw new FechaIncorrecta();

		this.anio = anio;
		if (!esValida())
			throw new FechaIncorrecta();
	}

	/**
	  * Constructor para inicializar una instancia de tipo fecha.
	 * 
	 * <br><B>PRE:</B> el formato del String con la fecha debe ser "dia/mes/año" o "dia-mes-año" 
	 * el mes debe ser un número y (dia, mes, anio) debe representar una fecha real del calendario gregoriano
	 * <br><B>POST:</B> crea una fecha con (dia, mes, anio) 
	 * 
	 * @param date fecha válida em formato "dia/mes/año" o "dia-mes-año" ejemplo "12/5/2008" o "10-3-1998"
	 * @throws FechaIncorrecta
	 */
	public Fecha(String date) throws FechaIncorrecta {
	     String [] partes = date.split("[/-]");
		    this.dia = Integer.parseInt(partes[0]);
		    this.mes = TMes.meses[Integer.parseInt(partes[1])-1];
		    this.anio = Integer.parseInt(partes[2]);
		    if (!esValida())
				throw new FechaIncorrecta();
		  }
	  
	/**
	 * 
	 * Constructor copia
	 * <br><B>PRE:</B> Cierto
	 * <br><B>POST:</B> devuelve una copia de this
	 * @param original fecha de la que se saca la copia
	 * 
	 */	
	public Fecha(Fecha original) {
		//Al estar compuesto por tipos báscios basta con
		//hacer asignación de campos
		this.dia = original.dia;
		this.mes = original.mes;
		this.anio = original.anio;
	}
	
	/**
	 * Constructor para inicializar una instancia de tipo fecha.
	 * 
	 * <br><B>PRE:</B> (dia, mes, anio) debe representar una fecha real del calendario gregoriano
	 * <br><B>POST:</B> crea una fecha con (dia, mes, anio) 
	 * 
	 * @param dia
	 *            indica el día del mes debe estar comprendido entre 1 y 31
	 * @param mes
	 *            indica el mes de acuerdo con Tmes
	 * @param anio
	 *            indica el año
	 * @throws FechaIncorrecta
	 *             excepción que se genera si no se cumple la PRE
	 */
	public Fecha(int dia, TMes mes, int anio) throws FechaIncorrecta {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		if (!esValida())
			throw new FechaIncorrecta();
	}

	/**
	 * @return el campo día
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * 
	 * <br><B>PRE:</B> la fecha con el nuevo dia debe representar una fecha real del calendario gregoriano
	 * <br><B>POST:</B> toma el parámetro dia como nuevo dia de la fecha 
	 *
	 *
	 * @param dia
	 *            el nuevo valor para el campo dia
	 * @throws FechaIncorrecta 
	 * 				excepción que se genera si no se cumple la PRE
	 */				
	public void setDia(int dia) throws FechaIncorrecta {
		this.dia = dia; 
		if (!esValida())
			throw new FechaIncorrecta();
	}

	/**
	 * @return el campo año
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * 
	 * <br><B>PRE:</B> la fecha con el nuevo año debe representar una fecha real del calendario gregoriano
	 * <br><B>POST:</B> toma el parámetro anio como nuevo año de la fecha 
	 *
	 * @param anio
	 *            el nuevo valor para el campo año
	 * @throws FechaIncorrecta 
	 * 				excepción que se genera si no se cumple la PRE
	 */
	public void setAnio(int anio) throws FechaIncorrecta {
		this.anio = anio; 
		if (!esValida())
			throw new FechaIncorrecta();
	}

	/**
	 * @return el campo mes
	 */
	public TMes getMes() {
		return mes;
	}

	/**
	 * 
	 * <br><B>PRE:</B> la fecha con el nuevo mes debe representar una fecha real del calendario gregoriano
	 * <br><B>POST:</B> toma el parámetro mes como nuevo mes de la fecha 
	 *
	 * @param mes
	 *            el nuevo valor para el campo mes
	 * @throws FechaIncorrecta 
	 * 				excepción que se genera si no se cumple la PRE
	 */
	public void setMes(TMes mes) throws FechaIncorrecta {
		this.mes = mes;
		if (!esValida())
			throw new FechaIncorrecta();
	}

	/**
	 * <br><B>PRE:</B> Cierto
	 * <br><B>POST:</B> modifica el día, mes y año del objeto actual utilizando
	 * el día, mes y año del parámetro fecha 
	 *
	 * @param fecha
	 *            contiene los nuevos valores para día, mes y año
	 */
	public void setFecha (Fecha fecha)
	{
	 this.anio=fecha.anio;
	 this.mes=fecha.mes;
	 this.dia=fecha.dia;
	}
	
	/**
	 * 
	 * <br><B>PRE:</B> la nueva fecha debe representar una fecha real del calendario gregoriano
	 * <br><B>POST:</B> modifica el día, mes y año del objeto actual utilizando
	 * los parámetros dia, mes y anio
	 * 
	 * @param dia
	 *            el nuevo valor para el campo dia
	 * @param mes
	 *            el nuevo valor para el campo mes
	 * @param anio           
	 *            el nuevo valor para el campo año
	 * @throws FechaIncorrecta 
	 * 				excepción que se genera si no se cumple la PRE
	 */
	public void setFecha (int dia, TMes mes, int anio) throws FechaIncorrecta {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		if (!esValida())
			throw new FechaIncorrecta();
	}
	
	/**
	 * Función que indica si una fecha es igual a otra
	 * PRE: Cierto
	 * @return Retorna cierto si las fechas representan la misma fecha
	 * 
	 */
	public boolean esIgual (Fecha fecha){
		return this.equals(fecha);
	}

	/**
	 * Función que indica si una fecha es igual a otra
	 * PRE: Cierto
	 * @return Retorna cierto si las fechas representan la misma fecha
	 * 
	 */
	public boolean equals (Object fecha)
	{//equals
	 if (fecha instanceof Fecha)
	 {
		 Fecha fechaAux= (Fecha) fecha;
		 return this.dia == fechaAux.dia &&
		 		this.mes == fechaAux.mes &&
		 		this.anio == fechaAux.anio;
	 }
	 else
		 return false;
	}//equals
	
	/**
	 * Función que indica si una fecha es válida 
	 * 
	 * PRE: Cierto
	 * 
	 * @return Retorna cierto si la fecha es válida, falso en otro caso
	 */
	private boolean esValida() {
		switch (this.mes) {// SW
			case ENERO:
			case MARZO:
			case MAYO:
			case JULIO:
			case AGOSTO:
			case OCTUBRE:
			case DICIEMBRE: // Meses de 31 días
				return this.dia >= 1 && this.dia <= 31;
			case FEBRERO:
				if (esBisiesto())
					return this.dia >= 1 && this.dia <= 29;
				else
					return this.dia >= 1 && this.dia <= 28;
			case ABRIL:
			case JUNIO:
			case SEPTIEMBRE:
			case NOVIEMBRE:
				return this.dia >= 1 && this.dia <= 30;
			default:
				return false;
		}// SW
	}

	/**
	 *
	 * <br><B>PRE:</B> Cierto
	 * <br><B>POST:</B> devuelve cierto si el año es bisiesto, falso en otro caso
	 *  	 
	 * @return cierto si el año es bisiesto, falso en otro caso.
	 * <p>Un año es bisiesto si no es año de siglo (el año que
	 * antecede al cambio de siglo) y es divisible entre cuatro. Si es año de
	 * siglo, debe ser divisible entre 400</p>
	 */
	public boolean esBisiesto() {
		if (this.anio % 100 == 0) // Año de siglo
			return (this.anio % 400) == 0;
		else
			return (this.anio % 4) == 0;
	}
    
		
	/**
	 * Servicio que indica si la fecha de la instancia representa el último día
	 * del mes
	 * 
	 * @return retorna cierto si es el último día del mes y falso en otro caso
	 */
	private boolean finMes() {// finMes
		return ultimoDiaMes() == this.dia;
	}// finMes;

	/**
	 * Servicio que indica si una fecha es mayor que otra
	 * 
	 * <br><B>PRE:</B> Cierto
	 * <br><B>POST:</B> True si this es posterior a f2, 
	 *         	False si this es anterior o igual a f2
	 * @param f2 fecha con la que se compara
	 * @return True si this es posterior a f2<br>
	 *         False si this es anterior o igual a f2 <br>
	 */
	public boolean mayor(Fecha f2) {
		return (this.anio > f2.anio) || // Mayor año
				(this.anio == f2.anio && // Mismo año
				(this.mes.compareTo(f2.mes) > 0 || // Mayor mes
				(this.mes == f2.mes) && // Igual mes (sepuede usar '==' por que
										// TMes es un enumerado
						this.dia > f2.dia));
	}

	/**
	 * Servicio que indica si una fecha es menor que otra
	 * <br><B>PRE:</B> Cierto
	 * <br><B>POST:</B> True si this es anterior a f2, 
	 *         	False si this es posterior o igual a f2
	 * @param f2 fecha con la que se compara.
	 * @return True si this es anterior a f2<br>
	 *         False si this es posterior o igual a f2 <br>
	 */
	public boolean menor(Fecha f2) {// menor
		return (this.anio < f2.anio) || // Menor año
				(this.anio == f2.anio && // Mismo año
				(this.mes.compareTo(f2.mes) < 0 || // Menor mes
				(this.mes == f2.mes) && // Igual mes (sepuede usar '==' por que
										// TMes es un enumerado
						this.dia < f2.dia));
	}// menor

	/**
	 * Servicio que retorna la fecha siguiente a una dada<br>
	 * <br><B>PRE:</B> Cierto
	 * <br><B>POST:</B> Resultado= fecha + 1 Día
	 *
	 * @return Resultado= fecha + 1 Día
	 */
	public Fecha siguiente() // Es un constructor que
													// crea una fecha a partir
													// de otra
	{
		try {
			if (finMes())
				if (this.mes == TMes.DICIEMBRE) // Fin Año
					return new Fecha(1, TMes.ENERO, this.anio + 1);
				else
					return new Fecha(1, this.mes.intValue() + 1, this.anio);
			// Fin Año
			else
				return new Fecha(this.dia + 1, this.mes, this.anio);
		} catch (FechaIncorrecta e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private int ultimoDiaMes() {// ultimoDiaMes
		switch (this.mes) {
		case ENERO:
		case MARZO:
		case MAYO:
		case JULIO:
		case AGOSTO:
		case OCTUBRE:
		case DICIEMBRE: // Meses de 31 sías
			return 31;
		case FEBRERO:
			if (esBisiesto())
				return 29; // El año es bisiesto
			else
				return 28; // El año no es bisiesto
		default:
			/*
			 * case ABRIL: case JUNIO: case SEPTIEMBRE: case NOVIEMBRE: //Meses
			 * de 30 días
			 */
			return 30;
		}
	}// ultimoDiaMes;

	public String toString() {
		return "" + this.dia + "/" + this.mes + "/" + this.anio;
	}

	/**
	 * <p align="justify">
	 * Definición del tipo mes con enumerados con atributos. En este caso
	 * <code>TMes</code> contiene dos atributos, uno para el literal que debe
	 * dar toString y otro para intValue. Esto requiere que se defina un
	 * constructor que se utilizará internamente para asociar los valores.
	 * </P>
	 */
	public enum TMes {// TMes
		ENERO("Enero", 1), FEBRERO("Febrero", 2),
		MARZO("Marzo", 3),
		ABRIL("Abril", 4),
		MAYO("Mayo", 5),
		JUNIO("Junio", 6),
		JULIO("Julio",7),
		AGOSTO("Agosto", 8),
		SEPTIEMBRE("Septiembre", 9),
		OCTUBRE("Octubre", 10), NOVIEMBRE("Noviembre", 11),
		DICIEMBRE("Diciembre", 12);
		/**
		 * Contiene el nombre del mes
		 */
		private final String nombre;
		/**
		 * Contiene el orden del mes
		 */
		private final int numero;
		
		public final static TMes [] meses = TMes.values();

		/**
		 * El constructor es privado ya que no se va a permitir la inclusión de
		 * nuevos meses en el enumerado
		 * 
		 * @param nombre
		 *            Cadena de caracteres del nombre
		 * @param numero
		 */
		private TMes(String nombre, int numero) {// TMes
			this.nombre = nombre;
			this.numero = numero;
		}// TMes

		public int intValue() {// toInt
			return numero;
		}// toInt

		public String toString() {// toString
			return nombre;
		}// toString
		
		public TMes succ ()
		{
			if (numero<12)
				return meses[numero]; //El array va de 0 a n-1 por y numero de 1 a n, 
									 //por lo tanto el siguiente es numero
			else
				return meses [0];
		}

	}// TMes

}// fecha
