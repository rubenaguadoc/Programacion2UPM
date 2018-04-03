package academia;
import lib.*;
/**
 * Prueba de AsignaturaCol.
 * @since 2/4/18
 * @version 1.0
 * @author JMB
 */
public class AsignaturaColTest
{
//  DECLARACIONES DE CONSTANTES Y VARIABLES PARA PRUEBAS  -----------

  static Alumno a11 = new AlumnoTupla("Lalo","Pas","Costas");
  static Alumno a22 = new AlumnoTupla("Lola","Peris","Cos");
  static Alumno a33 = new AlumnoTupla("Luis","Pirro","Casa");
  static Alumno a44 = new AlumnoTupla("Ramón","Prego","Cosío");
  static Alumno a55 = new AlumnoTupla("Lolo","Prieto","Crastis");

  static Asignatura nula;
  static Asignatura fisica;
  static Asignatura mates;
  static Asignatura ingles;

  static void resetear ()
  {
    AlumnoTuplaTest.resetear();
    nula = new AsignaturaCol("?");

    fisica = new AsignaturaCol("Física");
    fisica.matricularAlumno(AlumnoTuplaTest.a1);
    fisica.matricularAlumno(AlumnoTuplaTest.a2);
    fisica.matricularAlumno(AlumnoTuplaTest.a3);

    mates = new AsignaturaCol("Matemáticas");
    mates.matricularAlumno(AlumnoTuplaTest.a5);
    mates.matricularAlumno(AlumnoTuplaTest.a4);
    mates.matricularAlumno(AlumnoTuplaTest.a3);
    mates.matricularAlumno(AlumnoTuplaTest.a2);
    mates.matricularAlumno(AlumnoTuplaTest.a1);

    ingles = new AsignaturaCol("Inglés");
    ingles.matricularAlumno(AlumnoTuplaTest.a1);
    ingles.matricularAlumno(AlumnoTuplaTest.a2);
    ingles.matricularAlumno(AlumnoTuplaTest.a3);
    ingles.matricularAlumno(AlumnoTuplaTest.a4);
    ingles.matricularAlumno(AlumnoTuplaTest.a5);
    ingles.matricularAlumno(a55);
    ingles.matricularAlumno(a44);
    ingles.matricularAlumno(a33);
    ingles.matricularAlumno(a22);
    ingles.matricularAlumno(a11);
  }
  static void mostrar ()
  {
    System.out.println(nula);
    System.out.println(fisica);
    System.out.println(mates);
    System.out.println(ingles);
  }

//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  static boolean prueba1_EliminarAlumno ()
  {
    resetear();

    fisica.eliminarAlumno(AlumnoTuplaTest.a1);
    fisica.eliminarAlumno(AlumnoTuplaTest.a2);
    fisica.eliminarAlumno(AlumnoTuplaTest.a3);
    Asignatura fisicaRes = new AsignaturaCol("Física");

    mates.eliminarAlumno(AlumnoTuplaTest.a1);
    mates.eliminarAlumno(AlumnoTuplaTest.a5);
    mates.eliminarAlumno(AlumnoTuplaTest.a3);

    Asignatura matesRes = new AsignaturaCol("Matemáticas");
    matesRes.matricularAlumno(AlumnoTuplaTest.a4);
    matesRes.matricularAlumno(AlumnoTuplaTest.a2);

    boolean resultado =
         fisica.toString().equals(fisicaRes.toString()) &&
         mates.toString().equals(matesRes.toString());
        return resultado;
  }
  static boolean prueba2_CalificarAlumno ()
  {
    resetear();

    a11.setPrimerParcial(5.0);   // Modificando a11
    a11.setSegundoParcial(5.0);  // Modificando a11
    nula.calificarAlumno(a11);
    Alumno resNula = nula.getNotas(a11);
    double parcial1_A11 = resNula.getPrimerParcial();
    double parcial2_A11 = resNula.getSegundoParcial();

    AlumnoTuplaTest.a1.setPrimerParcial(6.0);   // Modificando a1
    fisica.calificarAlumno(AlumnoTuplaTest.a1);
    Alumno resFisica = fisica.getNotas(AlumnoTuplaTest.a1);
    double parcial1_A1 = resFisica.getPrimerParcial();
    double parcial2_A1 = resFisica.getSegundoParcial();

    AlumnoTuplaTest.a5.setPrimerParcial(8.0);   // Modificando a5
    AlumnoTuplaTest.a5.setSegundoParcial(8.0);  // Modificando a5
    mates.calificarAlumno(AlumnoTuplaTest.a5);
    Alumno resMates = mates.getNotas(AlumnoTuplaTest.a5);
    double parcial1_A5 = resMates.getPrimerParcial();
    double parcial2_A5 = resMates.getSegundoParcial();

    boolean resultado =
      ((parcial1_A11 == 5.0) &&(parcial2_A11 == 5.0)) &&
      ((parcial1_A1 == 6.0) &&(parcial2_A1 == 0.0)) &&
      ((parcial1_A5 == 8.0) &&(parcial2_A5 == 8.0));
    return resultado;
  }

//  PROGRAMA PRINCIPAL  ---------------------------------------------

  public static void main(String[] args)
  {
    resetear();
    mostrar();
    System.out.println("prueba1_EliminarAlumno = " +
                        prueba1_EliminarAlumno());
    System.out.println("prueba2_CalificarAlumno = " +
                        prueba2_CalificarAlumno());
  }
}
