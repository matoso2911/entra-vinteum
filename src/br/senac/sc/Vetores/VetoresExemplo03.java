package br.senac.sc.Vetores;

import java.util.Scanner;

public class VetoresExemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[4];
        int maior = 0;

        System.out.println("Digite 4 números: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();

        }

        maior = valores[0]; // Assume que é o maior
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior){
                maior = valores[i];
            }
        }

        System.out.println("O maior valor entre os digitados é: " + maior);
        entrada.close();

    }
}