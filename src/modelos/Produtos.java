/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author pcgamergab
 */
public class Produtos {
    
    //atributos do produto
  private String nome = "";
  private String descricao ="";
  private Double preco = 0.0;

    public int getId() {
        return id;
    }
  private int id = 0;
  
  

    public Produtos() {
    }
    
      public Produtos(int id,String nome,String descricao,Double preco){
      this.id = id;
      this.nome = nome;     
      this.descricao = descricao;
      this.preco = preco;
    }
        
    
  
  public Produtos(String nome,String descricao,Double preco)throws Exception {
      this.nome = nome;
      if(nome.equals(""))throw new Exception("Nome do produto não pode estar vazio");
      this.descricao = descricao;
      if(descricao.equals(""))throw new Exception("Descrição dever conter dados");  
      this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

  

    @Override
    public String toString() {
        return ";"+nome+";"+descricao+";"+preco+";";
    }

    
  
}
