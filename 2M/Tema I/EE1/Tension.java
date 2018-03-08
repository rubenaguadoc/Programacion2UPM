package ee1;

public class Tension {

	
	// Private Object Fields
	private double baja;
	private double alta;
	
	// Constructor Receives two Blood Pressure values
	Tension(double baja, double alta) {
		
		this.baja = baja;
		this.alta = alta;
		
	}
	//----------------------------------------------------	
	
	// Converts our object to a readable String type
	public String toString() {
		

		String str = "(" + this.baja() + "," + this.alta() + ")";
		return str;
				
	}
	//----------------------------------------------
	
	// Compares 2 Blood Pressure Objects
	public boolean esIgual(Tension t) {
		
		// To actually compare if 2 objects are equal, you should use:
		// object_1.equals(object_2); 
		// Problem is here we don't actually want to compare the objects, 
		// We're just interested in their values.
		// Using .equals() makes it fail the test.
		return t.alta() == this.alta && t.baja() == this.baja; 
		
	}
	//----------------------------------------------------
	
	// Checks whether or not Blood Pressure belongs in a normal interval
	public boolean esNormal() {
		
		return ((baja >= 7 && baja <= 9) && (alta >= 12 && alta <= 14)) ?  true : false;
		
	}
	//----------------------------------------------------
	
	// Checks whether or not Blood Pressure is not normal
	public boolean esAlta() {
		
		return ((baja > 9) || (alta > 14))? true : false;
		
	}
	//----------------------------------------------------
	
	// Calculates the Pulse ( aka the difference between Blood Pressures)
	public int pulso() {
		
		return (int)(alta - baja);
		
	}
	//----------------------------------------------------
	
	
	// Getters
	
	// Retrieves the private field 'baja'
	public double baja() {
			
		return this.baja;
			
	}
	//----------------------------------------------------
		
	// Retrieves the private field 'alta'
	public double alta() {
			
		return this.alta;
		
	}
	//----------------------------------------------------
	
}
