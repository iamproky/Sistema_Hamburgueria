/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import java.util.Set;

/**
 *
 * @author pcgamergab
 */
public interface IProduto {
    String getNome();
    double getPreco();
    String getDescricao();
    int getQuantidade();
    void setQuantidade(int quantidade);
    Set<String> getAdicionais();
    default void aumentarQuantidadeProduto(int quantidade){
        
    }     
     public boolean temMesmosAdicionais(IProduto outroProduto);
}
