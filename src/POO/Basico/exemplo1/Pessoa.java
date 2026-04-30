package POO.Basico.exemplo1;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    //Vazio
    public Pessoa(){}

    //Com parâmetros
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("Olá, meu nome é " + this.nome + " e tenho " + this.idade + " anos.");

    }
}
