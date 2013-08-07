
package br.senai.sc.model.negocio;
/**
 * essa classe representa as pessoas do software
 * @version 1.0 21/07/13
 * @author larissa_mezari
 */
public class Pessoa {
    
    private int id;
    private String endereco;
    private String telefone;
    private String dataCadatro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCadatro() {
        return dataCadatro;
    }

    public void setDataCadatro(String dataCadatro) {
        this.dataCadatro = dataCadatro;
    }

}
