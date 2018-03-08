import java.util.Arrays;

class AgendaTupla implements Agenda{
  private int longitud;
  private Contacto[] elementos;

  public AgendaTupla(int longitud){
    elementos = new Contacto[longitud];
    this.longitud = 0;
  }

  public String toString(){
    return Arrays.toString(elementos);
  }

  public Contacto buscarNombre (String nombre){
    Contacto res = null;
    boolean finished = false;
    for(int i = 0; i < longitud && !finished; i++){
      if(elementos[i].getNombre().equals(nombre)){
        res = elementos[i];
        finished = true;
      }
    }
    return res;
  }

  public Contacto buscarNumero (int numero){
    Contacto res = null;
    boolean finished = false;
    for(int i = 0; i < longitud && !finished; i++){
      if(elementos[i].getTelefono() == numero){
        res = elementos[i];
        finished = true;
      }
    }
    return res;
  }

  public void poner(Contacto contacto){
    elementos[longitud] = contacto;
    longitud++;
  }

  public void quitar (Contacto contacto){
    boolean found = false;
    for(int i = 0; i < longitud; i++){
      if(elementos[i].esIgual(contacto) && !found){
        found = true;
      }
      if(found && i != elementos.length - 2){
        elementos[i] = elementos[i + 1];
      }
    }
    elementos[elementos.length - 1] = null;
    longitud--;
  }

  public void cambiarTelefono(Contacto c, int nuevoTelefono){
    buscarNombre(c.getNombre()).setTelefono(nuevoTelefono);
  }

  public int contarPrefijo(int prefijo){
    int counter = 0;
    for(int i = 0; i < longitud; i++){
      if(Integer.toString(elementos[i].getTelefono()).startsWith(Integer.toString(prefijo))){
        counter++;
      }
    }
    return counter;
  }

}
