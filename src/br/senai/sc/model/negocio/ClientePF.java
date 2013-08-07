package br.senai.sc.model.negocio;

/**
 * Classe que representa os clientes físicos do software
 * @version 1.0 31/07/13
 * @author gabriel_arsenio
 */
public class ClientePF extends Pessoa {

    private double nrConta;
    private double limiteCompra;
    private char categoria;
    private int qtVezesComprou;
    private double vlTotalGasto;

    public ClientePF() {
    }

    public double getNrConta() {
        return nrConta;
    }

    public void setNrConta(double nrConta) {
        this.nrConta = nrConta;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
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
    
    
}
