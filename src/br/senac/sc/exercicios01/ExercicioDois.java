package br.senac.sc.exercicios01;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        //2. Crie um programa que determine se um usuário é maior de idade
        // (idade igual ou acima de 18 anos) e exiba uma mensagem apropriada.

        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = teclado.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("Dois iguais!");
        } else {
            System.out.println("Nenhum número igual! ");
        }
    }
}
