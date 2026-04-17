package br.senac.sc.exercicios01;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        //3. Seleção de Língua: Desenvolva um programa multilíngue que
        // ao usuário que escolha um idioma (1 para inglês, 2 para espanhol, 3 para francês) e exiba uma saudação
        // de boas-vindas nesse idioma usando switch case.
        // Se o idioma escolhido não estiver disponível,
        // exiba uma mensagem informando que o idioma é inválido.

        int idiomaSelecionado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        idiomaSelecionado = teclado.nextInt();


        switch (idiomaSelecionado) {
            case 1: {
                System.out.println("Welcome!");
                break;
            }
            case 2: {
                System.out.println("Bienvenido!");
                break;
            }
            case 3: {
                System.out.println("Bienveunue!");
                break;
            }
            default: {
                System.out.println("Idioma inválido!");
            }
        }
    }
}