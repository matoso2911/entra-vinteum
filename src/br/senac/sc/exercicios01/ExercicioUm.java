package br.senac.sc.exercicios01;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        //1. Escreva um programa que verifique se um número é positivo ou negativo
        // e exiba uma mensagem correspondente.

        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num > 0 ) {
            System.out.println("É um número positivo!");
        } else if (num < 0) {
            System.out.println("É um número negativo!");
        } else {
            System.out.println("Seu número é zero!");
        }
    }
}
