package POO.Basico.Polimorfismo.PolimorfismoExemplo3;

public class Boleto extends MetodoPagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando à vista com o boleto!");
    }
}
