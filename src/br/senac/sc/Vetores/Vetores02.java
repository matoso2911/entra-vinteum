package br.senac.sc.Vetores;

public class Vetores02 {
    public static void main(String[] args) {
        //Inicialização padrão
        //byte, short, int, long, float e double -> Inicializa com 0.
        int[] numeros = new int[5];

        System.out.println(numeros[4]);
        System.out.println(numeros[3]);

        //char
        char[] caracteres = new char[3];
        System.out.println(caracteres[1]);

        //boolean = falso
        boolean[] logicos = new boolean[3];
        System.out.println(logicos[2]);

        // Objetos -> Inicializa com null
        String[] textos = new String[3];
        textos[1] = "spfc";
        System.out.println(textos[1]);
        System.out.println(textos[2]); //(Exemplo do null)
    }

}
