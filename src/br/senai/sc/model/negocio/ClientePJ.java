package br.senai.sc.model.negocio;

/**
 * Classe que representa as pessoas jurídicas do sistema
 * @version 1.0 31/07/13
 * @author gabriel_arsenio
 */
public class ClientePJ extends PessoaJuridica {
    
    private double limite;
    private int nrconta;
    private char categoria;
    private int qtVezesComprou;

    public ClientePJ() {
    }
    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNrconta() {
        return nrconta;
    }

    public void setNrconta(int nrconta) {
        this.nrconta = nrconta;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesComprou() {
        return qtVezesComprou;
    }

    public void setQtVezesComprou(int qtVezesComprou) {
        this.qtVezesComprou = qtVezesComprou;
    }

    public double getVlTotalGasto() {
        return vlTotalGasto;
    }

    public void setVlTotalGasto(double vlTotalGasto) {
        this.vlTotalGasto = vlTotalGasto;
    }
    private double vlTotalGasto;
}
