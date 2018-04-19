package e03;

import java.util.Arrays;

import figura.*;
import list.ArrayList;
import stdlib.*;

public class Poligono extends Figura {

	private ArrayList<Punto> vertices;
	
	Poligono(Punto referencia) {
		
		super(referencia);
		
	}
	//-----------------------------
	
	public void add(Punto p) {
		
		vertices.add(vertices.size(), p);
		
	}
	//-----------------------------
	
	public String toString() {
		
		String str = "Poligono(";
		for(int i = 0; i < vertices.size(); ++i) {
			
			str += vertices.get(i).toString();
			
		}
		str += ")";
		return str;
		
	}
	//-----------------------------
	
	
	public boolean equals(Figura f) {
		
		if(f instanceof Poligono) {
			
			Poligono p = (Poligono)f;
			
			if(this.getPosicion() != f.getPosicion()) {
				
				return false;
				
			}
			else if(this.vertices.size() != p.size()) {
				
				return false;
				
			} 
			else {
				
				boolean encontradoDiferente = false;
				
				for(int i = 0; i < this.vertices.size() && !encontradoDiferente; ++i) {
					
					if(!vertices.get(i).equals(p.vertices.get(i))) {
						
						encontradoDiferente = true;
						
					}
					
				}
				return encontradoDiferente;
				
				
			}
			
			
		}
		else {
			
			return false;
			
		}
		
	}
	//-----------------------------
	
	public int size() {
		
		return vertices.size();
		
	}
	//-----------------------------
	
	public Punto getPosicion() {
		
		return super.getPosicion();
		
	}
	//-----------------------------
	
	public Punto get(int i) {
		
		return this.vertices.get(i);
		
	}
	//-----------------------------
	
	public void set(int i, Punto p) {
		
		this.vertices.set(i, p);
		
	}
	//-----------------------------
	
	public void pintar() {
		
		double[] x = new double[this.vertices.size()];
		double[] y = new double[this.vertices.size()];
		
		for(int i = 0; i < this.vertices.size(); ++i) {
			
			x[i] = (double)(this.vertices.get(i).getX());
			y[i] = (double)(this.vertices.get(i).getY());
			
		}
		
		StdDraw.polygon(x, y);
		
	}
	//-----------------------------
	
	public int distA0() {
		
		return super.distA0();
		
	}
	//-----------------------------
	
	public Poligono recubrimiento() {
		
		int[] x = new int[this.vertices.size()];
		int[] y = new int[this.vertices.size()];
		
		for(int i = 0; i < this.vertices.size(); ++i) {
			
			x[i] = (this.vertices.get(i).getX());
			y[i] = (this.vertices.get(i).getY());
			
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		
		int maxX = x[x.length - 1];
		int minX = x[0];
		
		int maxY = y[y.length - 1];
		int minY = y[0];
		
		Punto p1 = new Punto(minX, maxY);
		Punto p2 = new Punto(minX, minY);
		Punto p3 = new Punto(maxX, minY);
		Punto p4 = new Punto(maxX, maxY);
		
		Poligono p = new Poligono(this.getPosicion());
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		
		return p;
		
	}
	//-----------------------------
	
	public int area() {
		
		int anchura = this.get(3).getX() - this.get(1).getX();
		int altura = this.get(3).getY() - this.get(1).getY();
		return anchura * altura;
		
	}
	//-----------------------------
	
	public int perimetro() {
		
		int anchura = this.get(3).getX() - this.get(1).getX();
		int altura = this.get(3).getY() - this.get(1).getY();
		
		return 2 * altura + 2 * anchura;
		
	}
	//-----------------------------
	
}
