package academia;
import lib.*;
/**
 * Implementacion del TAD Asignatura<br>
 * @since 3/4/2018
 * @version 1.0
 * @author RAC
 */
class AsignaturaCol implements Asignatura {

  private String nombre;
  private ListInterface<Alumno> asig = new ArrayList<Alumno>();

  public AsignaturaCol(String nombre) {
    this.nombre = nombre;
  }

    public String toString () {
      return "Asignatura [Nombre: " + this.nombre + "; Matriculados: " + asig + "]";
    }

    public String getNombre() {
      return this.nombre;
    }

    public boolean esIgual (Asignatura a) {
      return this.nombre == a.getNombre(); // TODO?
    }

    public int size() {
      return asig.size();
    }

    public Alumno get (int pos) {
      return asig.get(pos);
    }

    public Alumno getNotas (Alumno al) {
      Alumno res = null;
      for(int i = 0; i < asig.size(); i++) {
        if(al.getNombreCompleto().equals(asig.get(i).getNombreCompleto())) {
          res = asig.get(i);
        }
      }
      return res != null?res:new AlumnoTupla("Not", "Nulls", "Here");
    }

    public void matricularAlumno (Alumno al) {
      asig.add(0, al);
    }

    public void eliminarAlumno (Alumno al) {
      asig.removeElementAt(asig.indexOf(al));
    }
  /**
   * POST: Cambia las notas que tenga "al" en la asignatura por
   *       las nuevas que van en el propio par�metro "al".
   */
    public void calificarAlumno (Alumno al) {

    }

}
