public class Pruebas {
  public static void main(String[] args){    
    Coche c1 = new Coche("Verde", true);
    Vehiculo v2 = new Coche("Rojo", true);

    c1.setColor("Amarillo");
    System.out.println(c1.getColor());

    v2.horn();

    System.out.println(v2);
  }
}
