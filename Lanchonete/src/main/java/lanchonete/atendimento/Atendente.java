package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("Servindo Mesa");
    }
    private void pegarLancheCozinha(){
        System.out.println("Pegando lanche na cozinha");
    }
    public void receberPagamento(){
        System.out.println("Recebendo Pagamento");
    }
    void trocarGas(){
        System.out.println("Atendente trocando gas");
    }
    private void pegarPedidoBalcao(){
        System.out.println("Pegando pedido no balcao");
    }
}
