package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as informações referentes aos funcionarios.
 *
 * @version 1.0 31/07/13
 * @author larissa_mezari
 */
public class FuncionarioDAO {

    /*
     * Método para adicionar um funcionário no vetor de funcionários.
     */
    public void adicionar(Funcionario f, List<Funcionario> funcionarios) {
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionário" + "adicionado com sucesso");

    }
    /*
     * Método que lista todos os Funcionários
     */

    public void listar(List<Funcionario> funcionarios) {
        String msg = "";
        for (Funcionario f : funcionarios) {
            msg = msg + "\nNome: " + f.getNome()
                    + "\nData de nascimento: " + f.getDataNascimento()
                    + "\nRg: " + f.getRg()
                    + "\nCpf: " + f.getCpf()
                    + "\nEndereço: " + f.getEndereco()
                    + "\nTelefone: " + f.getTelefone()
                    + "\nData cadastro: " + f.getDataCadatro()
                    + "\nSalário: " + f.getSalario()
                    + "\nData admição: " + f.getDataAdmissao()
                    + "\nCtps: " + f.getCtps()
                    + "\nCargo: " + f.getCargo();

        }
        JOptionPane.showMessageDialog(null, msg);

    }

    public void excluir(String nome, List<Funcionario> funcionarios) {
        Funcionario fremove = null;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals(nome)) {
            }
        }
    }

    public Funcionario buscaFeuncionarioByNome(String nome, List<Funcionario> funcionarios) {
        for (Funcionario fBusca : funcionarios) {
            if (fBusca.getNome().equals(nome)) {
                return fBusca;
            }
        }
        return null;
    }
}


