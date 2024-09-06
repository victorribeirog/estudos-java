package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural no balcao");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco natural no balcao");
    }
    public void adicionarComoNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private  void prepararLanche(){
        System.out.println("Preparando lanche");
    }
    private void prepararVitamina(){
        System.out.println("Preparando vitamina");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando o pão, salada, carne, ovo e queijo");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta,leite e açucar");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina liquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e ovo");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}