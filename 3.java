/*Crea un arreglo de 5 notas.

Pide al usuario que las ingrese y luego muestra el promedio.*/


package com.mycompany.exam2;

import java.util.Scanner;

import java.util.Arrays;

public class Exam2 {

  public static void main(String[] args) {

    /*Crea un arreglo de 5 notas. Pide al usuario que las ingrese y luego muestra el promedio*/

    Scanner cat = new Scanner(System.in);

    int notas[] = new int[5];

    double nt = 0;

    for (int i = 0; i < notas.length; i++) {

      System.out.println("Ingrese nota "+(i+1));

      notas[i] = cat.nextInt();

      nt += notas[i];

    }

    System.out.println("El promedi de las notas es: "+(nt/notas.length));

  }

}
