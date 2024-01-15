package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int variable;

        variable = 10;
        variable = variable -3  ;
        variable = variable * 2;
        variable = variable + 7;

        System.out.println("Escrible el valor final de la variable: ");
        int valorFinal = scanner.nextInt();

        if (valorFinal==variable) {
            System.out.println("¡respuesta correcta! has realiza una prueba de escritorio exitosa:");
        } else {
            System.out.println("respuesta incorrecta . Realiza nuevamente la prueba de escritorio");
        }





    }
}