package com.company.orientacao_a_objeto.orientacao_a_objetos_parte2.desafio_heranca_e_sobreposicao_5_17;

public class ContaPagar {
    Fornecedor fornecedor;

    //Inclua um atributo chamado "situacaoConta" do tipo SituacaoConta na classe ContaPagar.
    // desafio_pacotes_e_enumeracoes_5_13
    //Criando um atributo fica assim:

    private SituacaoConta situacaoConta;// - parte 1 do atributo

    public ContaPagar(){

    }
    public ContaPagar(Fornecedor fornecedor, Conta descricao, Conta valor , Conta dataVencimento) {

    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

   /* public void pagar() {
        System.out.println("Conta a Pagar " + this.getDescricao()
                           + " valor " + this.getValor() +
                             " Data de vencimento: " + getDataVencimento() +
                             " fornecedor: " + this.getFornecedor().getNome() + ".");
    }*/

    public SituacaoConta getSituacaoConta() { //atribuir o objeto SituacaoConta - parte2 do atributo
        return situacaoConta;
    }

    public void cancelar() {

    }
}
