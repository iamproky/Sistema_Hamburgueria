/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;


import java.util.List;



/**
 *
 * @author pcgamergab
 */
public interface IProdutoCRUD {
    public void Incluir (Produtos objproduto) throws Exception;
    public void Alterar(int id,Produtos objproduto)throws Exception;
    public void Deletar(int id)throws Exception;
    public Produtos Consultar(Produtos objproduto)throws Exception;
    public  List<Produtos> ObterListagemDeProdutos()throws Exception;
    
}
