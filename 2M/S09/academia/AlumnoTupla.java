package academia;
/**
 * Implementacion del TAD Alumno<br>
 * @since 3/4/2018
 * @version 1.0
 * @author RAC
 */

class AlumnoTupla implements Alumno {

  private String nombre, apellido1, apellido2;
  private double primerParcial, segundoParcial;

  public AlumnoTupla(String nombre, String apellido1, String apellido2) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
  }

  public String toString () {
    return "Alumno [Nombre: " + nombre + " " + apellido1 + " " + apellido2 + "; Notas: " + primerParcial + ", " + segundoParcial + "]";
  }

  public boolean equals (Alumno a) {
    return a.getNombreCompleto().equals(this.getNombreCompleto()) && a.getPrimerParcial() == this.primerParcial && a.getSegundoParcial() == this.segundoParcial;
  }

  public String getNombreCompleto () {
    return apellido1 + " " + apellido2 + ", " + nombre;
  }

  public double getPrimerParcial () {
    return primerParcial;
  }

  public double getSegundoParcial () {
    return segundoParcial;
  }

  public void setPrimerParcial (double nota1) {
    this.primerParcial = nota1;
  }

  public void setSegundoParcial (double nota2) {
    this.segundoParcial = nota2;
  }

  public String clave() {
    return this.getNombreCompleto()
    .replaceAll("á", "a")
    .replaceAll("é", "e")
    .replaceAll("í", "i")
    .replaceAll("ó", "o")
    .replaceAll("ú", "u");
  }

}
