package POO.Basico.Polimorfismo.PolimorfismoExemplo2;

public class Main {
    public static void main(String[] args) {
    Funcionario gerente = new Gerente();
    gerente.setSalarioBase(10_000d);
        System.out.println("O salário do gerente é: " + gerente.calcularPagamento());

        Funcionario funcionarioComum = new Funcionario();
        funcionarioComum.setSalarioBase(3000d);
        System.out.println("O salário do funcionário é: " + funcionarioComum.calcularPagamento());

        Funcionario vendedor = new Vendedor(2000d, 3000d);
        System.out.println("O salário do vendedor é: " + vendedor.calcularPagamento());
    }
}
