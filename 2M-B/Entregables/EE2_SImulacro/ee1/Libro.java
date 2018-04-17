package ee1;

import fecha.Fecha;
import fecha.excepciones.FechaIncorrecta;

public class Libro {
	
	// Field Variables
	private String titulo; 
	private String autor; 
	private Fecha fechaPublicacion;
	private int nVecesPrestado;
	
	// Constructor
	public Libro(String titulo, String autor, Fecha fecha) {
		
		this.titulo = titulo;
		this.autor  = autor;
		this.fechaPublicacion = fecha;
		
	}
	
	// Getters
	
	public String getTitulo() {
		
		return this.titulo;
		
	}
	//--------------------------------------------------
	
	public String getAutor() {
		
		return this.autor;
		
	}
	//--------------------------------------------------
	
	public Fecha getFechaPublicacion() {
		
		return this.fechaPublicacion;
		
	}
	//--------------------------------------------------
	
	public int getNVecesPrestado() {
		
		return this.nVecesPrestado;
		
	}
	//--------------------------------------------------
	
	// Funciones Auxiliares
	
	@Override
	public boolean equals(Object Obj) {
		
		// Hacemos casting para obtener el objeto en formato de Libro
		
		if(Obj instanceof Libro) {
			
			Libro libro = (Libro) Obj; 
			
			return (this.getTitulo().equals(libro.getTitulo()))
					&& (this.getAutor().equals(libro.getAutor()))
					&& (this.getFechaPublicacion().esIgual(libro.getFechaPublicacion()));
					// Tambien se podria poner nVecesPrestado
					// pero en la especificacion del ejercicio no se 
					// menciona como un requisito asi que lo ignoramos
			
			
		}	
		else {
			
			return false;
			
		}
			
		
	}
	
	// METODOS
	
	public void prestado() {
		
		++nVecesPrestado;
		
	}
	//--------------------------------------------------
	
	public boolean esIgual(Libro libro) {
		
		if(this == null && libro == null) {
			
			return true;
			
		}
		else if(this == null || libro == null) {
			
			return false;
			
		}
		else {
			
			return this.equals(libro);
			
		}
		
	}
	//--------------------------------------------------
	
	public String toString() {
		
		// Un método toString que retorna un String con el siguiente formato: “Título, Autor, leído:
		// nnn” donde nnn es el número de veces que el libro ha sido leído
		
		return this.titulo + ", " + this.autor + ", leído: " +  this.nVecesPrestado;
		
		
	}
	//--------------------------------------------------
	
}
