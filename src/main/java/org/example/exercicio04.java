package org.example;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Locale antes de tudo, pois quando for ler o input da linha 18, ja estara esperando um numero com ponto.
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas*valorHora;

        System.out.printf("NUMBER = %d %n SALARY = %.2f", numeroFuncionario, salario);

        sc.close();
    }
}
