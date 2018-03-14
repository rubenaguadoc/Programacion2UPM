package t01.e04;

import t01.e01.Punto;

public class CirculoOps {

	/**
	 * 
	 * @param c : Un Circulo Cualquiera
	 * @return true si el centro del circulo esta en el origen, false si no es asi
	 */
	public static boolean estaEnOrigen(Circulo c) {
		
		// La verdad es que no entiendo como hacer esta funcion
		// Porque no se si se refiere a que el centro sea el origen, o si se refiere
		// a que el origen este contenido dentro del circulo
		// En este caso voy a comprobar si el centro del circulo es el origen
		// Hay varias maneras de hacer esto: comprobar si el centro es igual al Punto(0, 0)
		// o comprobar si la distancia al origen es 0
		// son posibilidades validas
		
		return c.distanciaAlOrigen() == 0;
		
	}
	//------------------------------------------------------------------
	
	/**
	 * 
	 * @param c1 : Un Circulo Cualquiera
	 * @param c2 : Otro Circulo Cualquiera
	 * @return La distancia entre 2 circulos
	 */
	public static double distancia(Circulo c1, Circulo c2) {
		
		// Otra vez: No se que quiere con esta funcion, si la distancia entre los 2 puntos mas cercanos ,
		// o la distancia entre los 2 centros. Por simplicadad, voy a asumir que es la distancia entre los 2 centros
		
		Punto centro1 = c1.centro(); // Guardamos el primer centro
		Punto centro2 = c2.centro(); // Guardamos el segundo centro
		
		return (centro1.x() - centro2.x()) + (centro1.y() - centro2.y()); 
		
	}
	//------------------------------------------------------------------
	
	/**
	 * 
	 * @param p : un Punto cualquiera
	 * @param c : Un circulo cualquiera
	 * @return true Si el punto p esta contenido en el Circulo c, y false si esto no lo esta
	 */
	public static boolean estaDentro(Punto p, Circulo c) {
		
		// Para comprobar si un punto esta dentro de un circulo, 
		// tenemos que comprobar que tanto la x como la y del
		// punto estan dentro del intervalo centro +- el radio
		
		return (c.centro().x() + c.radio()) >= p.x()
				&& (c.centro().x() - c.radio()) <= p.x()
				&& (c.centro().y() - c.radio()) <= p.y()
				&& (c.centro().y() + c.radio()) >= p.y();
		
		
	}
	//------------------------------------------------------------------

	/**
	 * 
	 * @param c : Un circulo cualquiera
	 * @param distancia : una distancia cualquiera, > 0
	 * @return Un circulo concentrico de radio c.centro() - distancia
	 */
	public static Circulo concentricoInterior(Circulo c, double distancia) {
		
		// queremos crear un circulo con el mismo centro y distinto radio
		// el nuevo radio va especificado por la diferencia entre la el radio
		// actual y la distancia especificada
		
		double neoRadio = c.radio() - distancia; // creamos el nuevo radio, y lo calculamos
		Circulo neoCirculo = new Circulo(c.centro(), neoRadio); // Creamos un nuevo circulo que tenga el mismo centro que c y un radio <neoradio>
		return neoCirculo; // Devolvemos este nuevo circulo
		
	}
	
	
}

__$$_$__________$_$$
_$$_$_$________$_$__$
_$$__$__$______$_$___$
__$___$__$____$_$____$
_ _$__$__$___$__$____$
___$___$__$__$__$$__$
___$$__$__$§$$$__§_$
____$___________$§$
_____$$__________$$
_____$$___________$....
_____$____________$
_____$_§$________$§_____$$$$$$$$$
_____$_§:-)______:-)§$__$$_________$$
____$_$$§___________$______________$$
____o_______________$$_______________$$
____$________________$_____$__________$$
____$$_____$$$$$___$$______$___________$$
___$__$$§___$$$___§$_________$$________$$___$$
___$_____$___$___$________$$____$_____$$__$$$$
___$$__$___$$$$$__$_____$$______$____$$$$$$$
___$$__$_________$___$$________$____$$
____$$$$$________$$$$$________$$$$$$