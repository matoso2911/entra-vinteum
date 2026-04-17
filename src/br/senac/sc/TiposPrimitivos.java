package br.senac.sc;

public class TiposPrimitivos {
    public static void main(String [] args) {

        byte numeroMuitoPequeno = 12;
        short numeroPequeno = 1000;
        int numeroNormal = 123456789;
        long numeroMaior = 123456789;
        System.out.println(numeroMuitoPequeno);
        System.out.println(numeroPequeno);
        System.out.println(numeroNormal);
        System.out.println(numeroMaior);

        float numeroBurro = 24.5f;
        double numeroReal = 123.45;
        System.out.println(numeroBurro);
        System.out.println(numeroReal);

        float a = 0.2f;
        float b = 0.1f;
        System.out.println(a + b);

        char caractere = 'v';
        boolean falso = false;
        boolean verdadeiro = true;
        System.out.println(caractere);
        System.out.println(falso);
        System.out.println(verdadeiro);
    }

    public static class Para {
        public static void main(String[] args) {
            //For = Para!
            //Imprimir numeros de 0 a 10

            for (int i = 0; i <= 10 ; i++) {
                System.out.println(i);
            }
        }
    }
}
