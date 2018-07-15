package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rubén",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)
/**
 * Clase que representa al Peon
 * @author Rubén Aguado
 *
 */

public class Peon extends PiezaAjedrez  {

	/**
	 * Crea un Peon pertenenciente a jugador en la posiciÃ³n (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Peon(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.PEON, fila, columna);
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* El peón avanza en linea recta de 1 en 1, pero en su primer movimiento puede avanzar hasta dos posiciones
		 * Si hay una ficha de color contrario delante no puede moverse a esa posiciÃ³n
		 * Esta ficha come en diagonal
		 * A continuación se describen los movimientos en base a su jugador y a si es o no su primer movimiento
		*/
		boolean blanco = this.getJugador().getId() == ControlJugadoresAjedrez.BLANCO;
		if(super.queHay(this.getFila() + (blanco?-1:1), this.getColumna()) == null) {
			casillasVisitables (resultado, blanco?-1:1, 0);
			if(super.getFila() == (blanco?6:1) && super.queHay(this.getFila() + 2 * (blanco?-1:1), this.getColumna()) == null) {
				casillasVisitables (resultado, 2 * (blanco?-1:1), 0);
			}
		}
		if(super.queHay(this.getFila() + (blanco?-1:1), this.getColumna() - 1) != null) {
			casillasVisitables (resultado, blanco?-1:1, -1);
		}
		if(super.queHay(this.getFila() + (blanco?-1:1), this.getColumna() + 1) != null) {
			casillasVisitables (resultado, blanco?-1:1, 1);
		}
		return resultado;
	}

}

