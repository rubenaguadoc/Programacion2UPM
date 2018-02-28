class Coche implements Vehiculo{
  private String color;
  private boolean ruedas;
  
  public Coche(String colour, boolean tieneRuedas){
    color = colour;
    ruedas = tieneRuedas;
  }
  
  public String getColor(){
    return color;
  }
  
  public void setColor(String color){
    this.color = color;
  }
  
  public void horn(){
    System.out.println("Piii");
  }
  
  public String toString(){
    return "Coche: [Color: " + color + "; Tiene ruedas: " + ruedas +"]";
  }
}