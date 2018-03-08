interface Agenda{
  /**
  * POST: Visualizador
  */
  public String toString();
  /**
  * POST: Devuelve el objeto contacto de la agenda con el nombre pasdo por parametro
  */
  public Contacto buscarNombre(String nombre);
  /**
  * POST: Devuelve el objeto contacto de la agenda con el numero pasdo por parametro
  */
  public Contacto buscarNumero(int numero);
  /**
  * POST: Añade el contacto a la agenda
  */
  public void poner(Contacto contacto);
  /**
  * POST: Quita el contacto a la agenda
  */
  public void quitar(Contacto contacto);
  /**
  * POST: Cambia elteléfono del contacto
  */
  public void cambiarTelefono(Contacto c, int nuevoTelefono);
  /**
  * POST: Cuenta cuantos contactos tienen un numero de telefono que empieza por un prefijo
  */
  public int contarPrefijo(int prefijo);
}
