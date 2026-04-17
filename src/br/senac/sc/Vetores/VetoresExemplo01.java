package br.senac.sc.Vetores;

import java.util.Scanner;

public class VetoresExemplo01 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println("Digite o " + (i + 1) + " nome:");
            nomes[i] = teclado.next();
        }

        System.out.println("Nomes digitados: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
