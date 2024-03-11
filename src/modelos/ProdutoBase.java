/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Set;

/**
 *
 * @author pcgamergab
 */
public class ProdutoBase implements IProduto {
     private Set<String> adicionais;
    
    private String nome = "";
    private double preco = 0;
    private String descricao = "";
    private int quantidade = 0;

    public ProdutoBase(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = 1; // Inicializa a quantidade como 1 por padrão, pode ajustar conforme necessário
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco * quantidade; // Ajuste conforme necessário
    }

    @Override
    public String getDescricao() {
        return descricao + " (Quantidade: " + quantidade + ")"; // Ajuste conforme necessário
    }

 @Override
    public void aumentarQuantidadeProduto(int quantidade) {
        // Aumenta a quantidade no produto base
        this.quantidade += quantidade;
}

   @Override
    public Set<String> getAdicionais() {
        return adicionais;
    }

    @Override
    public boolean temMesmosAdicionais(IProduto outroProduto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}



  

