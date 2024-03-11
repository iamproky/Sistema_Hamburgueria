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
public class ProdutoSemAdicionais implements IProduto {
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;

    // Construtor e outros métodos necessários
    public ProdutoSemAdicionais(){
        
    }
    public ProdutoSemAdicionais(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    @Override
    public void aumentarQuantidadeProduto(int quantidade) {
        // Aumenta a quantidade no produto base
        this.quantidade += quantidade;
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
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    // Outros métodos específicos, se necessário

    @Override
    public Set<String> getAdicionais() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean temMesmosAdicionais(IProduto outroProduto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
