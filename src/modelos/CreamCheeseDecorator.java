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
public class CreamCheeseDecorator extends AdicionalDecorator {
    public CreamCheeseDecorator(IProduto produto) {
        super(produto);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + CreamCheese";
    }

    @Override
    public double getPreco() {
        return produto.getPreco() + (5.0 * getQuantidade()); // Ajuste conforme necessário
    }

    @Override
    public String getDescricao() {
        return produto.getDescricao() + " com CreamCheese";
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
        adicionais.add(" + CreamCheese");
        return adicionais;
    }

    @Override
    public boolean temMesmosAdicionais(IProduto outroProduto) {
        // Verifica se o outro produto é uma instância de QueijoCheddarDecorator
        // e se possui os mesmos adicionais
        if (outroProduto instanceof CreamCheeseDecorator) {
            CreamCheeseDecorator outroComCheese = (CreamCheeseDecorator) outroProduto;
            return this.getAdicionais().equals(outroComCheese.getAdicionais());
        }
        return false;
    }
}
    

