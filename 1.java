/*
Crea un programa para registrar asistencias.

Requerimientos:

Registrar una lista de estudiantes con su nombre.
Permitir marcar asistencia o tardanza para cada uno.
Al finalizar, mostrar:
Cantidad de presentes
Cantidad de tardanzas
Cantidad de ausentes (quienes no fueron marcados)
Mostrar un listado final con el estado de cada estudiante.
*/


package com.mycompany.exam2;



import java.util.Scanner;

import java.util.Arrays;



public class Exam2 {



  public static void main(String[] args) {

    /*Crea un arreglo de 5 notas. Pide al usuario que las ingrese y luego muestra el promedio*/

    Scanner cat = new Scanner(System.in);

    System.out.println(" ##### ===== SISTEMA DE REGISTR DE ASISTENCIAS ===== ##### ");

    System.out.println("Ingrese el numero de estudiantes");

    int nuez = cat.nextInt();

    String ests[] = new String[nuez];

    String estado[] = new String[nuez];

    for (int i = 0; i < nuez; i++) {

      System.out.print("Ingrese nombre de estudiante: ");

      ests[i] = cat.next();

    }

    String sel;

    int p = 0, t = 0, a = 0;

    System.out.println("***********************");

    System.out.println("Registrar Asistencias");

    for (int i = 0; i < nuez; i++) {

      System.out.println("p: Presente, t: Tardanza, a: Ausente : ");

      System.out.print(ests[i]+" ");

      sel = cat.next();

      switch (sel) {

        case "p":

          p++;

          estado[i] = "Presente";

          break;

        case "t":

          t++;

          estado[i] = "Tardanza";

          break;

        case "a":

          a++;

          estado[i] = "Ausente";

          break;

        default:

          System.out.println("Opcion no valida");

          break;

      }



    }

    System.out.println("***********************");

    System.out.println("Numeros de Asistencias");

    System.out.println("Hay " + p + " estudiantes presentes");

    System.out.println("Hay " + t + " estudiantes con tardanza");

    System.out.println("Hay " + a + " estudiantes Ausentes");

    System.out.println("***********************");

    System.out.println("Estudiantes y estados");

    System.out.println("Nombre ---- estado");

    for (int i = 0; i < nuez; i++) {

       

      System.out.print(ests[i] + " ---- ");

      System.out.println(estado[i]);

    }



  }

}
