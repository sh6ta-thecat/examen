/*
Representa un proceso de votación POO.

Requerimientos:

Registrar los candidatos.
Registrar votos por cada estudiante, indicando el número del candidato.
Contar los votos de cada uno.
Determinar si hay ganador o empate.
Mostrar un reporte final con los resultados.
*/

package com.mycompany.exam2;

import java.util.Scanner;
import java.util.Arrays;

public class Exam2 {

    public static void main(String[] args) {
        /*Crea un arreglo de 5 notas. Pide al usuario que las ingrese y luego muestra el promedio*/
        Scanner cat = new Scanner(System.in);
        System.out.println(" ##### ===== SISTEMA DE VOTACION ===== ##### ");
        System.out.println("Ingrese el numero de candidatos");
        int cand = cat.nextInt();
        int votos[] = new int[cand];
        System.out.println("Ingrese el numero de Estudiantes");
        int Est = cat.nextInt();
        int sel[] = new int[Est];
        System.out.println("Registrar Votaciones");
        for (int i = 0; i < Est; i++) {

            for (int j = 0; j < cand; j++) {
                System.out.print("Candidato Nro" + (j + 1) + " o ");

            }
            votos[i] = cat.nextInt();
            if(cand == votos[i]){
            sel[i]++;
            }
        }
        System.out.println("Resultados");
        for (int i = 0; i < Est; i++) {
            System.out.println(sel[i]);
        }
    }

}
