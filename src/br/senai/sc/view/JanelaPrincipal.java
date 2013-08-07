package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação
 *
 * @version 1.0 31/07/13
 * @author gabriel_arsenio
 */
public class JanelaPrincipal {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        mostraMenu(funcionarios, produtos);
    }

    public static void mostraMenu(List<Funcionario> funcionarios, List<Produto> produtos) {
        //vetor dinâmico para armazenar os funcionários cadastrados.



        JanelaFuncionario jf = new JanelaFuncionario();
        JanelaProduto jp = new JanelaProduto();
        int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("informe a opção:"
                    + "\n1 - Funcionário"
                    + "\n2 - Cliente"
                    + "\n3 - Produto"
                    + "\n4 - Fornecedor"
                    + "\n5 - Transportadora"
                    + "\n6 - Sair"));
            switch (opcao) {
                case 1:
                    jf.menuFuncinonario(funcionarios);
                    break;
                case 2:
                    break;
                case 3:
                    jp.menuProduto(produtos);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcao inexistente");
            }


        } while (opcao != 6);
    }
}
