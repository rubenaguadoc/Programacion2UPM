class ContactoTupla implements Contacto{
  private String nombre;
  private int telefono;

  public ContactoTupla(String nombre, int telefono) {
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public String toString(){
    return "Contacto: [Nombre: " + nombre + "; Telefono: " + telefono + "]";
  }

  public String getNombre(){
    return nombre;
  }

  public int getTelefono(){
    return telefono;
  }

  public void setTelefono(int telefono){
    this.telefono = telefono;
  }

  public boolean igualNombre(String nombre){
    return this.nombre.equals(nombre);
  }

  public boolean igualTelefono(int telefono){
    return this.telefono == telefono;
  }

  public boolean esIgual(Contacto c){
    return igualNombre(c.getNombre()) && igualTelefono(c.getTelefono());
  }

}
