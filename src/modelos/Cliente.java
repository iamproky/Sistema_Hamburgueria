/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author aluno
 */
public class Cliente {
    private String nome = "";
    private String cpf = "";
    private String endereco = "";
    private String numerotelefone = "";
    private String metodopagamento = "";

     //Instância única da classe ClienteModel
    private static Cliente instance;

    // Construtor privado para evitar criação direta de instâncias
    private Cliente() {
        // Inicialize os atributos, se necessário
    }

    // Método público para obter a instância única
    public static Cliente getInstance() {
        if (instance == null) {
            instance = new Cliente();
        }
        return instance;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumerotelefone() {
        return numerotelefone;
    }

    public void setNumerotelefone(String numerotelefone) {
        this.numerotelefone = numerotelefone;
    }

    public String getMetodopagamento() {
        return metodopagamento;
    }

    public void setMetodopagamento(String metodopagamento) {
        this.metodopagamento = metodopagamento;
    }
    

    @Override
    public String toString() {
        return  "CPF: " +cpf+"\n"+
                "Cliente: "+ nome +"\n"+
                "Endereço: "+endereco+"\n"+               
                "Telefone: "+numerotelefone+"\n"+
                "Metódo Pagamento: "+metodopagamento+"\n";
                
    }
    
    
    
}
