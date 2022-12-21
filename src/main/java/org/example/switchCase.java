package org.example;

import java.util.Scanner;

public class switchCase {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int numeroRecebido = sc.nextInt();
        String dia;

        switch (numeroRecebido) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;

            default:
                dia = "Não existe :/";
        }

        if (numeroRecebido <= 7) {
        System.out.println("Esse número corresponde ao dia da semana: " + dia);
        }
        else {
            System.out.println(dia);

        }
        sc.close();
    }
}
