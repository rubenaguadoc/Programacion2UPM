package academia;
/**
 * Especificaci�n del TAD Asignatura<br>
 * Asignatura = Tupla(nombre,Col(Alumno))
 * INV(Asignatura) = Hay orden lexicografico creciente.
 * @since 2/4/2018
 * @version 1.0
 * @author JMB
 */
public interface Asignatura
{
/**
 * POST: resultado es la cadena de caracteres formada por los
 *       atributos del objeto
 */
  public String toString ();
/**
 * POST: Devuelve el nombre del objeto
 */
  public String getNombre();
/**
 * POST: resultado es cierto si "a" es identico al objeto y es
 *       falso e.o.c.
 */
  public boolean esIgual (Asignatura a);
/**
 * POST: Devuelve el n�mero de alumnos matriculados en esta asignatura.
 */
  public int size();
/**
 * PRE: pos IN [0, size()-1]
 * POST: Devuelve el alumno que est� en la posici�n pos.
 */
  public Alumno get (int pos);
/**
 * POST: Devuelve el alumno con el nombre y los apellidos de "al".
 */
  public Alumno getNotas (Alumno al);
/**
 * POST: Matricula al alumno "al" en la asignatura.
 */
  public void matricularAlumno (Alumno al);
/**
 * POST: Desmatricula al alumno "al" de la asignatura.
 */
  public void eliminarAlumno (Alumno al);
/**
 * POST: Cambia las notas que tenga "al" en la asignatura por
 *       las nuevas que van en el propio par�metro "al".
 */
  public void calificarAlumno (Alumno al);
}
