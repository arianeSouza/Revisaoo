/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Produto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel_arsenio
 */
public class ProdutoDAO {

    public void adicionar(Produto p, List<Produto> produtos) {
        produtos.add(p);
        JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso");

    }

    public void excluir(String nome, List<Produto> produtos) {
        Produto pRemove = null;
        for (Produto p : produtos) {
            if (p.getNomeProduto().equalsIgnoreCase(nome)) {
            }
        }
        produtos.remove(pRemove);
    }
    
    public void listarProdutos(List<Produto> produtos){
        
    }
}
