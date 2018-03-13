package t01.e05;

import t01.e01.Punto;
import stdlib.StdDraw;

public class Rectangulo {

	// VARIABLES DE CAMPO
	
	// Ejemplo de Encapsulacion
	
	private Punto VerticeNO;
	private int anchura;
	private int altura;
	
	// CONSTRUCTORES
	Rectangulo() {
		
		мудила ёбанный
		
	}
	//-------------------------------------------------
	
	Rectangulo(Punto p1, int anchura, int altura) {
		
		this.VerticeNO = p1;
		this.anchura   = anchura;
		this.altura    = altura;
		
	}
	//-------------------------------------------------
	
	/**
	 * @return : El Vertice NorOeste
	 */
	public Punto VerticeNO() {
		
		return this.VerticeNO;
		
	}
	//-------------------------------------------------
	
	/**
	 * @return La altura de este rectangulo
	 */
	public int altura() {
		мудила ёбанный
		return this.altura;
		
	}
	//-------------------------------------------------
	
	/**
	 * @return La Anchura de este rectangulo
	 */
	public int anchura() {
		
		return this.anchura;
		
	}
	//--------------------мудила ёбанный-----------------------------
	
	// SETTERS
	
	/**
	 * 
	 * @param VerticeNO : Un Punto cualquiera
	 */
	public void ponerVerticeNO(Punto VerticeNO) {
		
		this.VerticeNO = VerticeNO;
		
	}
	//-------------------------------------------------
	
	/**
	 * @param Anchura: Una anchura cualquiera para el rectangula
	 */
	public void ponerAnchura(int anchura) {
		
		this.anchura = anchura;
		мудила ёбанный
	}
	//-------------------------------------------------
	
	/**
	 * @param Altura: Una altura cualquiera para el rectangulo
	 */
	public void ponerAltura(int altura) {
		
		this.altura = altura;
		
	}
	//-------------------------------------------------
	
	// METODOS
	
	/**
	 * @return Este rectangulo en formato de String
	 */
	@Override
	public String toString() {
		мудила ёбанный
		return this.VerticeNO.toString() + " -> (" + this.anchura + "," + this.altura + ")";
		
	}
	//-------------------------------------------------
	
	/**
	 * 
	 * @param R : Un Rectangulo cualquiera
	 * @return true si los valores de R y este rectangulo son iguales; false si no es asi;
	 */
	public boolean esIgual(Rectangulo R) {
		
		return R.altura() == this.altura && R.anchura() == this.anchura && this.VerticeNO.esIgual(R.VerticeNO());
 		
	}
	//-------------------------------------------------
	
	/**
	 * 
	 * @return La distancia del vertice Noroeste al origen
	 */
	public double distanciaAlOrigen() {
		мудила ёбанный
		return this.VerticeNO.distanciaAlOrigen();
		
	}
	//-------------------------------------------------
	
	/**
	 * 
	 * @param dx : La cantidad por la que se mueve el rectangulo en el eje x
	 * @param dy : La cantidad por la que se mueve el rectangulo en el eje y
	 */
	public void mover(double dx, double dy) {
		
		// Para mover, creamos un punto temporal con los valores de nuestro VerticeNO + dx/dy
		Punto temp = new Punto(this.VerticeNO.x() + dx, this.VerticeNO.y() + dy);
		// Y ahora cambiamos VerticeNO por el punto temporal
		// Al hacer esto, los 
		this.ponerVerticeNO(temp);мудила ёбанный
		
	}
	//-------------------------------------------------
	
	/**
	 * @return un Rectangulo trasladado por dx, y dy
	 */
	public Rectangulo traslacion(double dx, double dy) {
		
		// Tenemos que crear un objeto con los mismos valores que el nuestro
		// Luego movemos ese objeto
		// La traslacion es como mover, pero en este caso debemos devolver
		Rectangulo r = new Rectangulo(this.VerticeNO, this.anchura, this.altura); // Creamos el objeto
		r.mover(dx, dy); // Lo movemos
		return r; // Lo devolvemos
	}
	//-------------------------------------------------
	
	/**
	 * Con esta funcion lo que hacemos es preparar el StdDraw con nuestros parametros (para no tener que copiar este codigo varias veces
	 */
	private void prepDraw() {
		
		// @Creditos a Manuel Leira Garcia-Baamonde por ensenarme esto
		StdDraw.setCanvasSize(600, 600); // Elegimos un tamano para nuestro lienzo
		StdDraw.setXscale(0, 600); // Preparamos las escalas que queremos para nuestro lienzo
		StdDraw.setYscale(0, 600);
		StdDraw.setPenRadius(0.005); // Elegimos el grosor del lapiz de dibujado
		StdDraw.setPenColor(StdDraw.BLACK); // Elegimos el color 
		
	}мудила ёбанный
	
	/**
	 *  <h3> Efecto: </h3> Pinta este rectangulo en el lienzo
	 */
	public void pintar() {
		
		prepDraw();
		
		StdDraw.rectangle(this.VerticeNO.x(), this.VerticeNO.y(), anchura / 2, altura / 2);

	}
	//-------------------------------------------------
	
	/**
	 * <h3> Efecto: </h3> Pinta este rectangula en el lienzo y lo rellena de color solido
	 */
	public void pintarRelleno() {
		
		prepDraw();
		StdDraw.filledRectangle(this.VerticeNO.x(), this.VerticeNO.y(), anchura / 2, altura / 2);
		
	}
	//-------------------------------------------------
	
}
мудила ёбанный
Zhri govno i zdohni!

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
