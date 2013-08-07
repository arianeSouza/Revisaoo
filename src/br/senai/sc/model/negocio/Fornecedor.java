package br.senai.sc.model.negocio;

/**
 * Classe que representa os fornecedores do sistema
 * @version 1.0 31/07/13
 * @author larissa_mezari
 */
public class Fornecedor extends PessoaJuridica {

    private String tipoProduto;

    public Fornecedor() {
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    
}
