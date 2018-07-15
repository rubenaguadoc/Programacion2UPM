package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "RubÈn",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)
/**
 * Clase que representa al Rey
 * @author RubÈn Aguado
 *
 */

public class Rey extends PiezaAjedrez  {

	/**
	 * Crea un Rey pertenenciente a jugador en la posici√≥n (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Rey(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.REY, fila, columna);
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* El rey se puede mover en horizontal, vertical y diagonal, pero solo a las casillas a distancia 1
		 * Si hay una ficha de color contrario tambi√©n puede moverse a esa posici√≥n com√≠endose la pieza
		 * A continuaciÛn se describen los movimientos de la pieza
		*/
		casillasVisitables (resultado, -1, -1);
		casillasVisitables (resultado, -1, 0);
		casillasVisitables (resultado, -1, 1);
		casillasVisitables (resultado, 0, -1);
		casillasVisitables (resultado, 0, 1);
		casillasVisitables (resultado, 1, -1);
		casillasVisitables (resultado, 1, 0);
		casillasVisitables (resultado, 1, 1);
		return resultado;
	}

}

