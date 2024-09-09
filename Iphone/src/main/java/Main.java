import iphone.Iphone;
import musica.Musica;
import musica.ReprodutorMusical;
import navegador.Navegador;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;
import telefone.Telefone;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new Musica();
        AparelhoTelefonico telefone = new Telefone();
        NavegadorInternet navegador = new Navegador();

        Iphone iphone = new Iphone(reprodutor, telefone, navegador);

        iphone.selecionarMusica("Ai Já Era");
        iphone.tocarMusica();
        iphone.pausarMusica();

        iphone.ligar("123-456");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}