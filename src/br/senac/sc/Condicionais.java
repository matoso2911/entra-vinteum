package br.senac.sc;

public class Condicionais {
    public static void main(String[] args) {

        if (3 > 5) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }

        int idade = 18;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 18) {
            System.out.println("18 anos");
        } else {
            System.out.println("Maior de idade");
        }

        String corCamisa = "tricolor";
        String corCamisaDois = "Branco";

        if (corCamisa == "tricolor" || corCamisa == "Branco") {
            System.out.println("spfc");
        }

        int ano = 2020;

        if (ano >= 200 && ano <= 2999) {
            System.out.println("Século 21");

        }
    }

}


