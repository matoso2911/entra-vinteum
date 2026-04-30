package POO.Basico.Polimorfismo.PolimorfismoExemplo3;

public class CartaoCredito extends MetodoPagamento {
    @Override
    public void pagarAVista() {
        System.out.println("Pagando a vista com o crédito!");
    }
}
