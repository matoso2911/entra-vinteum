package br.senac.sc;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        // Enquanto = While!
        // 1. Digite um númeor até digitar um negativo!

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        while (num >= 0) {

            System.out.println("Digite um número:");
            num = teclado.nextInt();
        }
    }
}
