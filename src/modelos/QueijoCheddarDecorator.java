/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pcgamergab
 */
public class QueijoCheddarDecorator extends AdicionalDecorator {
    public QueijoCheddarDecorator(IProduto produto) {
        super(produto);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + Queijo Cheddar";
    }

    @Override
    public double getPreco() {
        return produto.getPreco() + (5.0 * getQuantidade()); // Ajuste conforme necessário
    }

    @Override
    public String getDescricao() {
        return produto.getDescricao() + " com Queijo Cheddar";
    }

    @Override
    public void aumentarQuantidadeProduto(int quantidade) {
    // Aumenta a quantidade no produto base
    produto.setQuantidade(produto.getQuantidade() + quantidade);
}
  

    @Override
    public Set<String> getAdicionais() {
        // Retorna um conjunto contendo o nome do adicional do QueijoCheddarDecorator
        Set<String> adicionais = new HashSet<>();
        adicionais.add("Queijo Cheddar");
        return adicionais;
    }

    @Override
    public boolean temMesmosAdicionais(IProduto outroProduto) {
        // Verifica se o outro produto é uma instância de QueijoCheddarDecorator
        // e se possui os mesmos adicionais
        if (outroProduto instanceof QueijoCheddarDecorator) {
            QueijoCheddarDecorator outroComCheddar = (QueijoCheddarDecorator) outroProduto;
            return this.getAdicionais().equals(outroComCheddar.getAdicionais());
        }
        return false;
    }
}

