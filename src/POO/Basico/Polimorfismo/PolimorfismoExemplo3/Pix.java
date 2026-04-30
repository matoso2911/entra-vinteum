package POO.Basico.Polimorfismo.PolimorfismoExemplo3;

public class Pix extends MetodoPagamento{
    @Override
    public void pagarAVista() {
        System.out.println("Pagando à vista com o PIX!");
    }
}
