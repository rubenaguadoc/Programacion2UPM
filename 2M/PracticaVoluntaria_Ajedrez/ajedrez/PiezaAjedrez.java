package progii.juegotablero.model.ajedrez;

import java.util.function.BiFunction;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.Pieza;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rub�n",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)
/**
 * Clase que modela una pieza de ajedrez
 * @author groman
 * @author Rub�n Aguado
 *
 */
public abstract class PiezaAjedrez extends Pieza {
	
	private TipoPiezaAjedrez tipoPieza; 
	/**
	 * Se define un atributo de tipo función que permite consultar que pieza hay en la posición dada
	 * La función debe cumplir con los siguientes requisitos:
	 * 1º Recibe la fila y la columna siguiendo el criterio del ajedrez
	 * 2º Debe retornar la pieza que hay en la posición indicada o null si no hay ninguna pieza
	 */
	private static BiFunction<Integer,Character,PiezaAjedrez> queHay = null;
	
	
	/**
	 * Las piezas de ajedrez se colocan en un tablero que cuya esquina superior izquierda es (8,'a') y la inferior derecha (1,'h')
	 * @param jugador
	 * @param tipoPieza
	 * @param fila de 1 a 8
	 * @param columna de 'a' a 'h'
	 */
	public PiezaAjedrez (Jugador jugador, TipoPiezaAjedrez tipoPieza, int fila, char columna) {
		super(jugador, 8-fila, ((int)columna) - ((int)'a')); 
		this.tipoPieza = tipoPieza;
	}

	public TipoPiezaAjedrez getTipoPieza() {
		return tipoPieza;
	}

	/**
	 * Devuelve si la pieza puede mover a la posición (toFila,toColumna) habiendo o no contrario en dicha posición. 
	 * Como esta clase no conoce el movimiento concreto de cada pieza, únicamente devolera true si la pieza
	 * no se sale del tablero o false si la pieza se sale del tablero.   
	 * @param toFila Fila destino del movimiento 
	 * @param toColumna Columna destino del movimiento
	 * @return true si el movimiento está dentro del tablero y false e.o.c.
	 */
	@Override
	public boolean movimientoDentroLimites (int toFila, int toColumna) {
		return
			toFila < 8 &&
			toColumna < 8 &&
			toFila >= 0 &&
			toColumna >= 0 &&
			(
				toFila != super.getFila() ||
				toColumna != super.getColumna()
			);
	}
	
	
	/**
	 * Devuelve si la pieza puede mover a la posición (toFila, toColumna) habiendo o no contrario en dicha posición. 
	 * Como esta clase no conoce el movimiento concreto de cada pieza, únicamente devolera true si la pieza
	 * no se sale del tablero o false si la pieza se sale del tablero.   
	 * @param toFila Fila destino del movimiento 
	 * @param toColumna Columna destino del movimiento
	 * @return true si el movimiento está dentro del tablero y false e.o.c.
	 */
	public boolean puedeMover (int toFila, char toColumna){
		return movimientoDentroLimites(8 - toFila, (int)toColumna - (int)'a');
	}
	
	
	/**
	 * El método devuelve un String con formato: TIPOPIEZA_NOMBREJUGADOR. 
	 * Por ejemplo, ALFIL_NEGRO. Para ello se usará <br> 
	 * tipo de pieza y el nombre del jugador que se encuentra en la clase Pieza.    
	 */
	@Override
	public String toString() {
		return getTipoPieza() + "_" + this.getJugador().getNombre();
	}
	
	/**
	 * En el ajedrez la fila superior es la 8 y la inferior el 1
	 * @return Este método retorna la fila en la que se encuentra la pieza según un tablero de ajedrez
	 */
	public int getFilaAjedrez(){
		return 8-super.getFila();
	}
	
	/**
	 * Las columnas en un tablero de ajedrez van de 'a' a 'h' siendo 'a' la columna que esstá más a la izquierda
	 * @return retiorna la columna en la que se encuentra la pieza en un tablero de ajedrez
	 */
	public char getColumnaAjedrez(){
		return (char)(super.getColumna() + 'a');
	}	
	
	public static void setQueHay(BiFunction<Integer,Character,PiezaAjedrez> func){
		PiezaAjedrez.queHay = func;
	}
	
	/**
	 * Preugunta que hay en la posición dada siguiendo el criterio de posiciones del ajedrez
	 * @param fila fila que se quiere consultar de 8 (superior) a 1 (inferior)
	 * @param columna columna que se quiere consultar de 'a' (izquierda) a 'h' (derecha)
	 * @return retorna la pieza que hubiera o null
	 */
	protected static PiezaAjedrez queHay (Integer fila, Character columna){
		boolean bFilaOK = (fila >= 1 && fila <= 8);
		boolean bColumnaOK = (columna >= 'a' && columna <= 'h');
		if (queHay!=null && bFilaOK && bColumnaOK){
			return queHay.apply(fila, columna);
		}
		return null;
	}
	
	/**
	 * Preugunta que hay en la posición dada siguiendo el criterio de posiciones de una matriz (modelo interno aplicado para la implementación del juego)
	 * @param fila fila que se quiere consultar de 0 (superior) a 7 (inferior)
	 * @param columna columna que se quiere consultar de '0' (izquierda) a '7' (derecha)
	 * @return retorna la pieza que hubiera o null
	 */
	protected static PiezaAjedrez queHay (int fila, int columna){
		return queHay (Integer.valueOf(8-fila), Character.valueOf((char)('a'+columna)));
		}

	/**
	 * 
	 * @return Retorna todas las casillas permitidos para esta pieza en la situación actual del tablero. El valor retornado debe ser distinto de nulo 
	 * aunque no existan casillas permitidas (ArrayList con cero elementos) 
	 */
	@Override
	public abstract ArrayList<Casilla> movimientosValidos();
	
//	métodos auxiliares
	/**
	 * Este método recorre el tablero desde la posición incial de la pieza hasta llegar a un extremo del 
	 * tablero o encontrar una pieza. La forma en que se desplaza viene determinada por incFila e incColumna.
	 * Inserta en resultado todas las casillas visitables. Una casilla es visitable si desde la posición de la pieza
	 * hasta ella no hay obstaculos, y la casilla está vacía o si está ocupada lo está por una pieza contraria
	 * @param resultado Colección en la que se añaden las casillas visitables
	 * @param incFila incremento de la fila en cada iteración
	 * @param incColumna incremento de la columna en cada interación
	 */
	protected void casillasVisitables (ArrayList<Casilla> resultado,int incFila, int incColumna){
		TipoPiezaAjedrez me = this.getTipoPieza();
		boolean onlyOne = me.equals(TipoPiezaAjedrez.CABALLO) || me.equals(TipoPiezaAjedrez.REY) || me.equals(TipoPiezaAjedrez.PEON);
		int filaActual = super.getFila();
		int columnaActual = super.getColumna();
		do {
			filaActual += incFila;
			columnaActual += incColumna;
			casillaVisitable(resultado, filaActual, columnaActual);
		} while(!onlyOne && movimientoDentroLimites(filaActual, columnaActual) && queHay(filaActual, columnaActual) == null);
	}
	
	/**
	 * Método portegiod que comprueba si la casilla indicada es visitable
	 * Una casilla es visitable si y sólo si está vacía u ocuoada por una pieza contraria.
	 * En el caso de que la casilla sea visitable se inserta en resultado
	 * @param resultado colección en la que se añade el movimiento si este es válido
	 * @param filaEst fila de la casilla que se desea estudiar
	 * @param columnaEst columna de la casilla que se desea estduiar
	 */
	protected void casillaVisitable(ArrayList<Casilla> resultado, int filaEst, int columnaEst) {

		PiezaAjedrez pieza = queHay(filaEst, columnaEst);
		if (movimientoDentroLimites(filaEst, columnaEst)
				&& (pieza == null || pieza.getJugador().getId() != this.getJugador().getId())) {
			resultado.add(resultado.size(), new Casilla(filaEst, columnaEst));
		}
	}
}
