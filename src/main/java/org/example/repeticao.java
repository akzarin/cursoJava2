package org.example;

import java.util.Scanner;

public class repeticao {  // exercicio é fazer o sistema repetir o scanner ate que o input seja 0, e ai de um output da soma dos valores inseridos

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int somaNumero = 0;

        while (numero != 0) {
            somaNumero = somaNumero + numero;
            numero = sc.nextInt();
        }

        System.out.println("A soma dos números lidos é: " + somaNumero);
        sc.close();
    }
}
