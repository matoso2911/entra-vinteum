package br.senac.sc.Vetores;

public class VetoresExemplo02 {
    public static void main(String[] args) {
        //2. Soma de Elementos: Crie um array de 5 numeros inteiros. Preencha-o com
        //valores e, em seguida, calcule e exiba a soma de todos os elementos.

        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma dos elementos do array é: " + soma + " !");
    }

    public static class VetoresExemplo03 {
    }
}
