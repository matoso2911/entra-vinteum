package POO.Basico.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 18);
        Pessoa pessoa2 = new Pessoa("Mario", 58);
        Pessoa pessoa3 = new Pessoa();

        //pessoa1.apresentar();
        //pessoa2.apresentar();

        Carro carro1 = new Carro();
        carro1.cor = "Preto";
        carro1.modelo = "Gol";
        carro1.marca = "Volkswagen";
        carro1.ano = 2020;
        carro1.dono = pessoa1;

        carro1.ligar();
    }
}
