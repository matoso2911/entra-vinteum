package POO.Basico.Polimorfismo.PolimorfismoExemplo2;

public class Gerente extends Funcionario{
    @Override
    public double calcularPagamento(){
        return super.getSalarioBase() + 1_000d;
    }
}
