package POO.Basico.Polimorfismo.PolimorfismoExemplo2;

public class Funcionario {
    private double SalarioBase;

    public double getSalarioBase(){
        return SalarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.SalarioBase = salarioBase;
    }
    public double calcularPagamento(){
        return 0;
    }

}
