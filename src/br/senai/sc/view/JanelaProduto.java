/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.negocio.Produto;
import br.senai.sc.model.persistencia.ProdutoDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel_arsenio
 */
public class JanelaProduto {

    public void menuProduto(List<Produto> produtos) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Produto \n"
                    + "Informe a opção desejada "
                    + ("\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar"
                    + "\n5 - Listar"
                    + "\n6 - Sair")));
            switch (opcao) {
                case 1:
                    adicionaProduto(produtos);
                    break;
                case 2:
                    removeProduto(produtos);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    //listaProdutos(produtos);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta, burro");
            }
        } while (opcao != 6);

    }

    public void adicionaProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        Produto p = new Produto();
        
        p.setNomeProduto(JOptionPane.showInputDialog("Informe o nome do produto"));
        p.setTipoProduto(JOptionPane.showInputDialog("Informe o tipo do produto"));
        p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto")));
        p.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do produto")));
        p.setDataCadatro(JOptionPane.showInputDialog("Informe a data de cadastro do produto"));
        p.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ do fornecedor"));
        p.setTelefone(JOptionPane.showInputDialog("Informe o contato do fernecedor"));

        dao.adicionar(p, produtos);
    }

    public void removeProduto(List<Produto> produtos) {
        ProdutoDAO dao = new ProdutoDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do produto que deseja excluir");
        dao.excluir(nome, produtos);
    }
}
