```mermaid
classDiagram
    class iPhone {
        - String numeroAtual
        - String musicaAtual
        - String paginaAtual
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class ReprodutorMusical {
        <<interface>>
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet

```
