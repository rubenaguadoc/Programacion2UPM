package figura;

import stdlib.StdDraw;

public class Circulo extends Figura {

	private int radio;
	
	public Circulo(Punto centro, int radio) {
		super(centro);
		this.radio = radio;
		
	}
	//-----------------------------------------
	
	// Getters
	
	//-----------------------------------------
	
	public Punto getCentro() {
		
		return super.getPosicion();
		
	}
	//-----------------------------------------

	public int getRadio() {
		
		return this.radio;
		
	}
	//-----------------------------------------
	
	// Otras
	
	public String toString() {
		
		return 
			      "Circulo(" + super.toString() + 
			      ", " + this.radio + ")";
		
	}
	//-----------------------------------------
	
	public boolean equals(Circulo c) {
		
		return super.equals(c) && this.radio == c.getRadio();
		
	}
	//-----------------------------------------
	
	public int distA0() {
		
		return super.distA0();
		
	}
	//-----------------------------------------
	
	public int area() {
		
		return (int)(Math.PI * this.radio * this.radio);
		
	}
	//-----------------------------------------
	
	public int perimetro() {
		
		return (int)(2 * Math.PI * this.radio);
		
	}
	//-----------------------------------------
	
	public void Pintar() {
		
		StdDraw.circle(this.getCentro().getX(), this.getCentro().getY(), this.radio);
		
	}
	//-----------------------------------------
	
	public void mover(int dx, int dy) {
		
		super.mover(dx, dy);
		
	}
	//-----------------------------------------
	
	public Figura traslacion(int dx, int dy) {
		
		Punto centro = new Punto(this.getCentro().getX() + dx, this.getCentro().getY() + dy);
		
		Circulo c = new Circulo(centro, this.radio);
		
		return c;
		
	}
	
	
	
}
