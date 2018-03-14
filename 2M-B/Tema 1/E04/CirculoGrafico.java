package t01.e04;

import stdlib.StdDraw;

public class CirculoGrafico {

	public static void iniciarGraficos() {
		
		StdDraw.enableDoubleBuffering();
	    StdDraw.setXscale(0, 100);
	    StdDraw.setYscale(0, 100);
	    StdDraw.setPenRadius(0.005);
		
	}
	//---------------------------------------
	
	public static void animarCirculo(Circulo C) {
		
		StdDraw.clear();
	    C.pintar();
	    StdDraw.show();
	    StdDraw.pause(500);
		
	}
	//---------------------------------------
	
	public static void animacion() {
		
		CirculoPrueba.resetear();
		iniciarGraficos();
		StdDraw.pause(3000); // esto es el tiempo que esperamos en millisegundos
		// Aqui he cambiado el for por un while
		// porque quiero que la animacion continue mientras el circulo no so tenga un radio negativo
		while(CirculoPrueba.c6.radio() > 0) {
			
			animarCirculo(CirculoPrueba.c6);
			CirculoPrueba.c6 = CirculoPrueba.c6.concentricoInterior(0.5);
			// aqui hay algo gracioso y es que el primero de los circulos que aparecen en la animacion esta en rojo
			// la razon es que en CirculoPrueba, estamos especificandole a CirculoPrueba.c6 que debe ser de color rojo
			// pero luego aqui estamos cambiandolo continuamente por un concentrico sin un color especificado
			// y por ello todos los concentricos se ponene del color normal (negro, StdDraw.Black)
			
		}
		
	}
	//---------------------------------------
	
	public static void main(String[] args) {
		
		animacion();
		
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
