package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação
 * @version 1.0 31/07/13
 * @author larissa_mezari
 */
public class JanelaPrincipal {
   
    public static void main(String[] args) {
        List<Funcionario> funcionarios   = new ArrayList<>();
        mostraMenu(funcionarios);
    }
    public static void mostraMenu ( List<Funcionario> funcionarios ){
         //vetor dinâmico para armazenar os funcionários cadastrados.
    

       
   JanelaFuncionario jf = new JanelaFuncionario();
        int opcao = 0;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("informe a opção:"
                    + "\n1 - Funcionário" 
                    + "\n2 - Cliente"
                    + "\n3 - Fornecedor"
                    + "\n4 - Transportadora"
                    + "\n5 - Sair"));
      switch (opcao){
            case 1: 
                jf.menuFuncinonario(funcionarios);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "opcao inexistente" );  }
        
        
        } while (opcao != 0);
    }

   
}
