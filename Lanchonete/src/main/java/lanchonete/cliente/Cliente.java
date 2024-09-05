package lanchonete.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolha um lanche");
    }
    public void fazerPedido(){
        System.out.println("Fazendo o pedido");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pagando a conta");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo aplicativo");
    }
}
