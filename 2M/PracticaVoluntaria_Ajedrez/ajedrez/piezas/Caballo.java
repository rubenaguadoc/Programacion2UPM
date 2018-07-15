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
 * Clase que representa al Caballo
 * @author RubÈn Aguado
 *
 */

public class Caballo extends PiezaAjedrez  {

	/**
	 * Crea un Caballo pertenenciente a jugador en la posici√≥n (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Caballo(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.CABALLO, fila, columna);
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* El caballo se mueve haciendo una "L" de 2x1
		 * Si hay una ficha de color contrario tambi√©n puede moverse a esa posici√≥n com√≠endose la pieza 
		 * A continuaciÛn se describen las 8 nuevas posiciones posibles para el caballo
		*/
		casillasVisitables (resultado, -2, -1);
		casillasVisitables (resultado, -2, 1);
		casillasVisitables (resultado, -1, -2);
		casillasVisitables (resultado, -1, 2);
		casillasVisitables (resultado, 1, -2);
		casillasVisitables (resultado, 1, 2);
		casillasVisitables (resultado, 2, -1);
		casillasVisitables (resultado, 2, 1);
		
		return resultado;
	}

}

