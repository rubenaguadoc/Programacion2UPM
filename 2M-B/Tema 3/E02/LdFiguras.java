package e02;

import figura.Figura;
import list.ArrayList;

public class LdFiguras {

	private ArrayList<Figura> ldFiguras;
	
	public LdFiguras() {
		
		ldFiguras = new ArrayList<Figura>();
		
	}
	//----------------------------------------
	
	public int size() {
		
		return ldFiguras.size();
		
	}
	//----------------------------------------
	
	public void add(Figura f) {
		
		ldFiguras.add(this.size(), f);
		
	}
	//----------------------------------------
	
	public Figura get(int i) {
		
		return ldFiguras.get(i);
		
	}
	//----------------------------------------
	
	public void set(int i, Figura f) {
		
		ldFiguras.set(i, f);
		
	}
	//----------------------------------------
	
	public String toString() {
		
		String str = "ldFiguras(";
		for(int i = 0; i < this.size(); ++i) {
			
			str += this.get(i).toString();
			
		}
		str += ")";
		
		return str;
		
	}
	//----------------------------------------
	
	public boolean equals(LdFiguras ldf) {
		
		if(ldf.size() != this.size()) {
			
			return false;
			
		}
		else {
			
			boolean encontradoDistinto = false;
			for(int i = 0; i < this.size() && !encontradoDistinto; ++i) {
				
				if(!this.get(i).equals(ldf.get(i))) {
					
					encontradoDistinto = true;
					
				}
				
			}
			return encontradoDistinto;
			
		}
		
	}
	//----------------------------------------
	
	public void pintar() {
		
		for(int i = 0; i < this.size(); ++i) {
			
			this.get(i).pintar();
			
		}
		
	}
	//----------------------------------------
	
	// No estoy seguro si entiendo muy bien lo que hay que hacer, pero
	// yo voy a bajar por dy cada figura.
	public void caer(int dy) {
		
		for(int i = 0; i < this.size(); ++i) {
			
			this.get(i).mover(0, dy);
			
		}
		
	}
	//----------------------------------------
	
}
