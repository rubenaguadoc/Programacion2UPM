interface Contacto{
  /**
  * POST: Visualizador
  */
  public String toString();
  /**
  * POST: Devuelve el nombre del objeto
  */
  public String getNombre();
  /**
  * POST: Devuelve el telefono del objeto
  */
  public int getTelefono();
  /**
  * POST: Cambia el telefono del objeto
  */
  public void setTelefono(int telefono);
  /**
  * POST: Devuelve true en caso de que al nombre del objeto y el nombre pasado por parametros sean iguales
  */
  public boolean igualNombre(String nombre);
  /**
  * POST: Devuelve true en caso de que al telefono del objeto y el telefono pasado por parametros sean iguales
  */
  public boolean igualTelefono(int telefono);
  /**
  * POST: Devuelve true en caso de que ambos contactos tengan los mismos datos
  */
  public boolean esIgual(Contacto c);
}
