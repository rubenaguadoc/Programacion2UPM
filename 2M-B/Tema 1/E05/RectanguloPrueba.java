package t01.e05;

import t01.e01.Punto;

public class RectanguloPrueba {

	public static Rectangulo r;
	
	public static void resetear(String lmao_lmao_just_kill_me_now) {
		
		Punto vertice = new Punto(100, 100); // Por ejemplo, ahi tenemos uno
		int anchura = 150;
		int altura = 300;
		
		r = new Rectangulo(vertice, anchura, altura); // Creamos Un Nuevo Rectangulo
		
	}
	
	public static void main(String[] antipasta) {
		
		// Unas cuantas pruebas 
		// Lo primero tenemos que crear un Rectangulo; para ello necesitamos altura, anchura, y un punto
		
		
		resetear("lol hahah xd que gran lmao "); // Esto se encarga de crearlo
		
		// AHora hacemos las pruebas de lo que podamos
		// Lo Primero, la funcion toString
		System.out.printf("Rectangulo R := %s%n", r); 
		// Como hicimos un metodo llamado toString y le pusimos @Override eso hace que sustituya al toString tipico de los objetos
		// y por eso podemos hacer esto;
		System.out.printf("Rectangulo R := %s%n", r.toString()); // Es Valido tambien
		System.out.printf("Distancia al origen : %f%n", r.distanciaAlOrigen()); // Vemos la distancia al origen
		// Al hacer esto comprobamos que mover, traslacion, y esIgual funcionan bien
		Rectangulo R = r.traslacion(5, 5);
		System.out.printf("%s = %s ? %b%n", r, R, r.esIgual(R)); // Este deberia evaluar a false
		r.mover(5, 5);
		System.out.printf("%s = %s ? %b%n", r, R, r.esIgual(R)); // Este deberia evaluar a true
		
		r.pintar(); // Probamos 'pintar()'
		R.mover(100, 100);
		R.pintarRelleno(); // Probamos 'pintarRelleno()'
	
		
	}
	
}
Хуй [khui], пизда [pizda], блядь [blyad], ебать [yebat] Хуй [khui], пизда [pizda], блядь [blyad], ебать [yebat] 
		Хуй [khui], пизда [pizda], блядь [blyad], ебать [yebat] 

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