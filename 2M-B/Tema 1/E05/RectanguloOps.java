package t01.e05;

import t01.e01.Punto;

public class RectanguloOps {

	/**
	 * 
	 * @param r1 : Un rectangulo cualquiera
	 * @param r2 : Otro rectangulo cualquiera
	 * @return La longitud entre los 2 vertices
	 */
	public double distancia(Rectangulo r1, Rectangulo r2) {
		
		// Mirad, yo no entiendo a este hombre
		// No se a que se refiere con distancia o con todas las otras cosas
		// asi que hago lo que a mi me parece mas logico
		// y en este caso, para mi eso seria calcular la distancia entre los 2 vertices
		
		// y eso esmuy facil, solo se usa la formula de la distancia entre 2 puntos
		return Math.abs((r2.VerticeNO().x() - r1.VerticeNO().x()) + (r2.VerticeNO().y() - r1.VerticeNO().y()));
		
	}
	//-------------------------------------------------------------------
	
	/**
	 * 
	 * @param p1 : Un punto cualquiera
	 * @param r : Un rectangulo cualquiera
	 * @return : true si p1 esta dentro de las dimensiones de r; false si no..
	 */
	public boolean estaDentro(Punto p1, Rectangulo r) {
		
		// aqui tenemos que comprobar si p1 esta dentro de las dimensiones de r
		// para ello todo lo que hay que verificar es que r se encuentre dentro del rango vertice...anchura/altura
		
		double x1 = r.VerticeNO().x();
		double y1 = r.VerticeNO().y();
		
		if( x1 <= p1.x() && y1 >= p1.y() && x1 + r.anchura() >= p1.x() && y1 - r.altura() <= p1.y() ) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
		
	}
	//-------------------------------------------------------------------
	
	/**
	 * 
	 * @param r : Un rectangulo cualquiera
	 * @return true si el origen esta dentro del rectangulo y fase si no es asi
	 */
	public boolean estaEnOrigen(Rectangulo r) {
		
		// otra vez con las cosas poco claras...
		// yo con esta funcion interpreto que r CONTIENE el origen (el punto (0,0))
		// la otra interpretacion seria comprobar que r tiene un tamano 0, y que verticeNO sea el origen. Porque entoncs, r estaria en el origen.
		// que es lo que parece que esta piiendo esta funcion
		// pero bueno, voy a hacer mi interpretacion que tiene mas sentido.
		// como ya hemos creado un metodo que comprueba si un punto esta dentro de un rectangulo, solo vamos a usar eso
		// teniendo en cuenta que el origen es el punto (0,0)
		Punto origen = new Punto(0, 0); // Creamos el origen
		return estaDentro(origen, r); // devolvemos elvalor que nos de estaDentro(origen, r);
		
	}
	
}
пиздаболище!

░░░░░░░░▄▀▀▄░░░ПИТУХА░░░░
░░░░░░▄▀▒▒▒▒▀▄░░░░░
░░░░░░░▀▌▒▒▐▀░░░░░░░░РАБОТЯГИ░░
░▄███▀░◐░░░▌░░
░░░▐▀▌░░░░░▐░░░░░░░░░░▄▀▀▀▄▄
░░▐░░▐░░░░░▐░░░░░░░░░█░▄█▀
░░▐▄▄▌░░░░░▐▄▄░░░░░░█░░▄▄▀▀▀▀▄
░░░░░░▌░░░░▄▀▒▒▀▀▀▀▄▀░▄▀░▄▄▄▀▀
░░░░▐░░░░▐▒▒▒▒▒▒▒▒▀▀▄░░▀▄▄▄░▄
░░░░▐░░░░▐▄▒▒▒▒▒▒▒▒▒▒▀▄░▄▄▀▀
░░░░░▀▄░░░░▀▄▒▒▒▒▒▒▒▒▒▒▀▄
░░░░░░░▀▄▄░░░█▄▄▄▄▄▄▄▄▄▄▄▀▄
░░░░░░░░░░▀▀▄▄▄▄▄▄▄▄▀▀░
░░░░░░░░░░░░▌▌░▌▌░░░
░░░░░░░░░░▄▄▌▌▄▌▌
