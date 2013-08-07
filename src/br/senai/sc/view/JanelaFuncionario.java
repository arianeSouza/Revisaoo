package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class JanelaFuncionario {

    public void menuFuncinonario(List<Funcionario> funcionarios) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Funcionario \n"
                    + "Informe a opção desejada "
                    + ("\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar"
                    + "\n5 - Listar"
                    + "\n6 - Sair")));
            switch (opcao) {
                case 1:
                    adicionaFuncionario(funcionarios);
                    break;
                case 2:
                    removeFuncionario(funcionarios);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    listaFuncionarios(funcionarios);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta, burro");
            }
        } while (opcao != 6);

    }

    void adicionaFuncionario(List<Funcionario> funcionarios) {
        Funcionario f = new Funcionario();
        f.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        f.setRg(JOptionPane.showInputDialog("Informe o rg"));
        f.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento: "));
        f.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
        f.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
        f.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
        f.setDataCadatro(JOptionPane.showInputDialog("Informe a data do cadastro: "));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: ")));
        f.setDataAdmissao(JOptionPane.showInputDialog("Informe a data de admissão: "));
        f.setCtps(JOptionPane.showInputDialog("Informe o ctps: "));
        f.setCargo(JOptionPane.showInputDialog("Informe o cargo: "));

        FuncionarioDAO dao = new FuncionarioDAO();
        dao.adicionar(f, funcionarios);
    }

    private void listaFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listar(funcionarios);
    }

    private void removeFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionario a ser excluído");
        dao.excluir(nome, funcionarios);
    }

    private void alteraFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário a ser alterado");
        Funcionario fAltera = new Funcionario();
        dao.buscaFeuncionarioByNome(nome, funcionarios);

        if (fAltera != null) {
            fAltera.setRg(JOptionPane.showInputDialog("Informe o rg"));
            fAltera.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento: ", fAltera.getDataAdmissao()));
            fAltera.setCpf(JOptionPane.showInputDialog("Informe o cpf: "));
            fAltera.setEndereco(JOptionPane.showInputDialog("Informe o endereço: "));
            fAltera.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
            fAltera.setDataCadatro(JOptionPane.showInputDialog("Informe a data do cadastro: "));
            fAltera.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: ")));
            fAltera.setDataAdmissao(JOptionPane.showInputDialog("Informe a data de admissão: "));
            fAltera.setCtps(JOptionPane.showInputDialog("Informe o ctps: "));
            fAltera.setCargo(JOptionPane.showInputDialog("Informe o cargo: "));
        }
    }
}
