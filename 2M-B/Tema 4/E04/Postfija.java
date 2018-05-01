package e04;

import e02.MemoriaExcesiva;
import e02.PilaArray;

public class Postfija {

	private double[] variables;
	private ListInterface<Character> expresion;
	
	public Postfija(double[] var, ListInterface<Character> exp) {
		
		this.variables = var;
		this.expresion = exp;
		
	}
	//--------------------------------------------------------------
	
	/**
	 * @return La expresion en forma de String, de manera que sea mas legible.
	 */
	public String toString() {
		
		String str = "";
		for(int i = 0; i < expresion.size(); ++i) {
			
			str += expresion.get(i);
			
		}
		return str;
		
	}
	//--------------------------------------------------------------
	
	/**
	 * 
	 * @param col : Array de Double con las variables
	 * @return Las variables de manera legible en un  : String
	 */
	public String verVariables(double[] col) {
		
		String str = "";
		for(double a : col) {
			
			str += col + " ";
			
		}
		return str;
		
	}
	//--------------------------------------------------------------
	
	/**
	 * 
	 * @return El valor : double : de esta expresion
	 * @throws MemoriaExcesiva	 * 
	 */
	public double evaluar() throws MemoriaExcesiva {
		
		if(this.expresion.size() < 1) {
			
			return 0.0; // En caso de que este vacia
			
		}
		
		// Creamos una pila, digamos del tamaño arbitrario de 20
		PilaArray<Double> pa = new PilaArray<Double>(20); // Tambien se podria hacer del tamaño de la expr
		
		String[] expr = this.toString().split("");
		
		for(int i = 0; i < expr.length; ++i) {
			
			char ch = expr[i].charAt(0); // Sabemos que va a tener un longitud de 1, por lo que solo tendra
			 // un elemento, en la posicion 0
			
			if(this.esOperando(ch)) {
				
				pa.apilar(this.variables[this.cardinal(ch)]); // Creo que este es el uso del array de variables
				
			}
			else {
				
				// Llegados a este punto, si suponemos que un character solo puede ser operando u operador,
				// sabemos que el character sera un operador.
				
				double oper1 = pa.cima();
				pa.desapilar();
				double oper2 = pa.cima();
				pa.desapilar();
				pa.apilar(this.efectuar(ch, oper1, oper2));
				
			}
			
			
		}
		
		return pa.cima(); // Llegados a este punto deberia tener solo 1 elemento de tipo double con el resultado
		
		
	}
	
	/**
	 * 
	 * @param ch : Una letra/ simbolo
	 * @return el Numero Correspondiente en ASCII
	 */
	private int cardinal(char ch) {
		
		return (int)(ch) - 97; // Asumo que la letra siempre va a ser minuscula, y quiero que la a sea la #0
		
	}
	//--------------------------------------------------------------
	
	/**
	 * 
	 * @param op : un operador;
	 * @return True si es +, -, /, o *. Falso de cualquier otra manera.
	 */
	private boolean esOperador(char op) {
		
		return (op == '+') 
			   || (op == '-')
			   || (op == '/')
			   || (op == '*');
		
	}
	//--------------------------------------------------------------
	
	/**
	 * 
	 * @param oper: El operando a comprobar
	 * @return true si no es un operador. Es decir, asumimos que todo lo que no es un operador es un operando.
	 */
	private boolean esOperando(char oper) {
		
		return !esOperador(oper); 
		
	}
	//--------------------------------------------------------------
	
	/**
	 * 
	 * @param op : El operador para la operacion a efectuar
	 * @param oper1 : El primer operando
	 * @param oper2 : El segundo operando
	 * @return oper1 'op' oper2
	 */
	private double efectuar(char op, double oper1, double oper2) {
		
		switch(op) {
		
			case '+':
				return oper1 + oper2;
			case '-':
				return oper1 - oper2;
			case '/':
				return oper1 / oper2;
			case '*':
				return oper1 * oper2;
			default:
				return 0.0; // Aqui realmente deberiamos tirar otra excepcion
		
		}
		
	}
	//--------------------------------------------------------------
	
	
}
