package org.example;

import java.util.Scanner;

public class exercicios_logica1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        int soma = valor1 + valor2;

        System.out.printf("SOMA: %d", soma); // ou concatenar SOMA com (valor1+valor2)

        sc.close();

    }

}
