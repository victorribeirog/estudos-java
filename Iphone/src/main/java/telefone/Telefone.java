package telefone;

public class Telefone implements AparelhoTelefonico {
    private String numeroAtual;

    @Override
    public void ligar(String numero) {
        this.numeroAtual = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada de: " + numeroAtual);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
