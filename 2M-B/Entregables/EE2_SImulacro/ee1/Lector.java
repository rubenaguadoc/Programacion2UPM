package ee1;

import java.util.Arrays;

public class Lector {

	// Variables de Campo
	
	private int nSocio;
	private String nombre;
	private Libro[] historicoLectura = new Libro[10];
	
	// Constructor
	public Lector(int nSocio, String nombre) {
		
		this.nSocio = nSocio;
		this.nombre = nombre;
		
	}
	//-------------------------------------------------------
	
	// Getters
	public int getNSocio() {
		
		return this.nSocio;
		
	}
	//-------------------------------------------------------
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	//-------------------------------------------------------
	
	public Libro getLibroLeido(int idx) {
		
		try {
			
			return this.historicoLectura[idx - 1];
			
		} 
		catch(Exception ex) {
			
			return null;
			
		}
		
	}
	//-------------------------------------------------------
	
	// Funciones Auxiliares
	
	private void insertarEnHistorico(Libro libro) {
		
		// Lo primero que debemos hacer es comprobar que podemos anadir un libro
		// de manera normal, es decir, sin modificar el historico.
		// Para poder hacer esto, se debe cumplir la condicion de que hayan menos de 
		// 10 libros en el historico (o la longitud del historico )
		// Por lo tanto lo comprobamos
		
		int idx = -1; // Inicializamos una variable que mantenga el indice donde debemos
		// insertar nuestro libro.
		
		// Si hay un espacio en el historico, idx pasara a ser un numero del 0..9
		
		for(int i = this.historicoLectura.length - 1; i > -1  ; --i) {
			
			// lo hago invertido (de 9..0 en lugar de 0..9) porque los libros nuevos van 
			// en el ultimo lugar (pos 9)
			
			if(historicoLectura[i] == null) {
				
				idx = i;
				
			}
			
		}
		
		if(idx == -1) {
			
			// EN caso de que todavia idx no haya cambiado, sabemos que no hay espacio
			// por lo que tenemos que alterar las posiciones y contenidos del array
			// para eliminar el dato mas antiguo (en la posicion 0)
			
			for(int i = 0; i < this.historicoLectura.length - 1; ++i) {
				
				this.historicoLectura[i] = this.historicoLectura[i + 1];
				
			}
			
			// Ponemos el nuevo libro en la ultima posicion de todas.
			// Podriamos poner solo 9, pero yo tengo la costumbre de generalizar
			// al maximo posible.
			this.historicoLectura[this.historicoLectura.length - 1] = libro; 
			
			
		}
		else {
			
			// SI idx es un numero 0..9 entonces sustituimos por el nuevo libro
			// (ya que habra espacio)
			historicoLectura[idx] = libro;
			
		}
		
	}
	//-------------------------------------------------------
	
	@Override
	public boolean equals(Object Obj) {
		
		if(Obj instanceof Lector) {
			
			Lector L = (Lector) Obj;
			
			boolean isHistoryEqual = true;
			
			for(int i = 0; i < this.historicoLectura.length && isHistoryEqual; ++i) {
				
				// Comprobamos cada elemento de cada historico
				// y si uno no es igual, cortamos el bucle mediante la condicion
				// booleana que tenemos ahi arriba.
				
				if(!(this.historicoLectura[i].esIgual(L.getLibroLeido(i)))) {
					
					isHistoryEqual = false;
					
				}
				
			}
			
			return isHistoryEqual && (this.nSocio == L.getNSocio());
			
		}
		else {
			
			return false;
			
		}
		
	}
	//-------------------------------------------------------
	
	// Metodos
	
	public void leerLibro(Libro libro) {
		
		insertarEnHistorico(libro); // Usamos una funcion auxiliar because why not
		libro.prestado(); // Le indicamos al libro que acaba de ser prestado.
		
	}
	//-------------------------------------------------------
	
	public boolean esIgual(Lector lector) {
		
		boolean isHistoryEqual = true;
		
		for(int i = 0; i < this.historicoLectura.length && isHistoryEqual; ++i) {
			
			System.out.println(this.historicoLectura[i] + " | " + lector.getLibroLeido(i));
			
			if(this.historicoLectura[i].esIgual(lector.getLibroLeido(i))) {
				
				System.out.println("yay!");
				
			}
			
		}
		
		return isHistoryEqual;
		
	}
	//-------------------------------------------------------
	
	
	
}
