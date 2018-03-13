package t01.e05;

import stdlib.StdDraw;
import t01.e01.PuntoPrueba;

public class RectanguloGrafico {
	
	// Esto es simplemente copiar pegar el archivo de puntoGrafico.java y cambiar punto por rectagulo; no hay mucho que explicar aqui.

	public static void iniciarGraficos() {
		
		StdDraw.enableDoubleBuffering();
	    StdDraw.setXscale(0, 100);
	    StdDraw.setYscale(0, 100);
	    StdDraw.setPenRadius(0.05);
		
	}
	//---------------------------------------
	
	public static void animarRectangulo(Rectangulo R) {
		
		StdDraw.clear();
	    R.pintar();
	    StdDraw.show();
	    StdDraw.pause(500);
		
	}
	//---------------------------------------
	
	
	public static void animacion() {
		
		RectanguloPrueba.resetear("ahaha ahaahahah ah ah hah a hah ah hah ah ah xd lmao ayyylienZ"); 
		iniciarGraficos();
		StdDraw.pause(3000); // esto es el tiempo que esperamos en millisegundos
		for(int i = 0; i < 100; ++i) {
			
			animarRectangulo(RectanguloPrueba.r);
			RectanguloPrueba.r = RectanguloPrueba.r.traslacion(5, 5);
			
		}
		
	}
	//---------------------------------------
	
	public static void main(String[] args) {
		
		// que lmao
		animacion(); // hehe xd
		
	}
	
}
пиздаболище

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
