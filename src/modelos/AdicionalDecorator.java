/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author pcgamergab
 */
public abstract class AdicionalDecorator implements IProduto {
    protected IProduto produto;

    public AdicionalDecorator(IProduto produto) {
        this.produto = produto;
    }

    @Override
    public int getQuantidade() {
        return produto.getQuantidade();
    }

    @Override
    public void setQuantidade(int quantidade) {
        produto.setQuantidade(quantidade);
    }

    @Override
    public void aumentarQuantidadeProduto(int quantidade) {
        produto.aumentarQuantidadeProduto(quantidade);
    }
}
