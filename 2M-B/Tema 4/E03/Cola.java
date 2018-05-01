package e03;

import e02.MemoriaExcesiva;

public class Cola<E> {

	private static final int MAX_ELEMENTOS = 10;
	int ppo;
	int fin;
	private E[] elementos;
	
	@SuppressWarnings("unchecked")
	public Cola(int n) throws MemoriaExcesiva {
		
		
		
	}
	//----------------------------------------------------
	
	public boolean estaVacia() {
		
		return ppo == fin;
		
	}
	//----------------------------------------------------
	
	public int size() {
		
		return this.fin;
		
	}
	//----------------------------------------------------
	
	public void desencolar() {
		
		++ppo;
		
	}
	//----------------------------------------------------
	
	public void encolar(E elem) throws ArrayIndexOutOfBoundsException {
		
		if(fin < this.MAX_ELEMENTOS) {
			
			this.elementos[fin] = elem;
			++fin;
			
		}
		else {
			
			throw new ArrayIndexOutOfBoundsException();
			
		}
		
	}
	//---------------------------------------
	
	public E primero() throws ColaVacia {
		
		if(this.estaVacia()) {
			
			throw new ColaVacia();
			
		}
		else {
			
			return this.elementos[ppo];
			
		}
		
		
	}
	//---------------------------------------
	
	
}
