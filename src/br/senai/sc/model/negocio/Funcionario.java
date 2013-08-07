package br.senai.sc.model.negocio;

/**
 * Classe que representa os funcionários do software
 * @version 1.0 31/07/13
 * @author gabriel_arsenio
 */
public class Funcionario extends PessoaFisica {
    private double salario;
    private String dataAdmissao;
    private String ctps;
    private String cargo;

    public Funcionario() {
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
        
}
