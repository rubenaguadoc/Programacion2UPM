/*
  Código escrito por Rubén Aguado Cosano
  Grupo 2M-A
  Fecha: 06-02-2018
*/
import java.util.Scanner;

class Fechas{

  static boolean esBisiesto(int year){
  /*
    return year % 4 == 0 No es correcto; 
    Las condiciones para que un año sea bisiesto son:
    o Año % 4 == 0 y Año % 100 != 0;
    o Año % 400 == 0
  */
    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
  }//ENDOF: esBisiesto()

  static int elapsed(int day, int month, boolean bisiesto){
    int result = day;
    for(int i = 1; i < month; i ++){
      if(i % 2 == 0){
        result += 30;
      }else{
        result += 31;
      }
    }
    if(month > 2){
      result -= bisiesto?1:2;
    }
    return result;
  }//ENDOF: toEnd()

  public static void main(String[] args){
    System.out.println("Bienvenido a la calculadora de días de Rubén.\nA continuación, introduzca dos fechas válidas, y le diremos cuantos días transcurrieron desde una fecha hasta la otra.");
    Scanner stdin = new Scanner(System.in);
    System.out.println("Por favor, escriba la fecha más antigua con el siguiente formato dd-mm-aaaa:");
    String oldest = stdin.nextLine();
    System.out.println("Por favor, escriba la fecha más posterior con el siguiente formato dd-mm-aaaa:");
    String newest = stdin.nextLine();
    stdin.close();
    int oldDay = Integer.parseInt(oldest.split("-")[0]);
    int oldMonth = Integer.parseInt(oldest.split("-")[1]);
    int oldYear = Integer.parseInt(oldest.split("-")[2]);
    int newDay = Integer.parseInt(newest.split("-")[0]);
    int newMonth = Integer.parseInt(newest.split("-")[1]);
    int newYear = Integer.parseInt(newest.split("-")[2]);
    int result = 0;

    int elapsedOld = elapsed(oldDay, oldMonth, esBisiesto(oldYear));
    int elapsedNew = elapsed(newDay, newMonth, esBisiesto(newYear));

    for(; oldYear < newYear; oldYear++){
      if(esBisiesto(oldYear)){
        result += 366;
      }else{
        result += 365;
      }
    }
    result += elapsedNew - elapsedOld;
    System.out.println("Desde el " + oldest + " hasta el " + newest + " pasaron " + result + " días.");
  }//ENDOF: main()

}//ENDOF: class Fechas
