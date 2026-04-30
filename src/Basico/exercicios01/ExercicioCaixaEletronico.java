package Basico.exercicios01;

import java.util.Scanner;

public class ExercicioCaixaEletronico {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    final int NOTA100 = 100;
    final int NOTA50 = 50;
    final int NOTA20 = 20;
    final int NOTA10 = 10;
    final int NOTA5 = 5;
    final int NOTA2 = 2;
    final int NOTA1 = 1;

    int valor;

    System.out.print("Digite o valor para saque: ");
    valor = entrada.nextInt();

    int n100, n50, n20, n10, n5, n2, n1;

    n100 = valor / NOTA100;
    valor = valor % NOTA100;

    n50 = valor / NOTA50;
    valor = valor % NOTA50;

    n20 = valor / NOTA20;
    valor = valor % NOTA20;

    n10 = valor / NOTA10;
    valor = valor % NOTA10;

    n5 = valor / NOTA5;
    valor = valor % NOTA5;

    n2 = valor / NOTA2;
    valor = valor % NOTA2;

    n1 = valor;

    System.out.println("Notas de 100: " + n100);
    System.out.println("Notas de 50: " + n50);
    System.out.println("Notas de 20: " + n20);
    System.out.println("Notas de 10: " + n10);
    System.out.println("Notas de 5: " + n5);
    System.out.println("Notas de 2: " + n2);
    System.out.println("Notas de 1: " + n1);


}
}