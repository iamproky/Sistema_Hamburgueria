/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;



import bancodedados.ConexaoBD;
import modelos.IProdutoCRUD;
import modelos.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;



/**
 *
 * @author pcgamergab
 */
public class ProdutoDAO implements IProdutoCRUD {

    Connection conexao;
    
    
    public ProdutoDAO(int id) {
     
        try {
            conexao = ConexaoBD.createConnection();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    
    
    @Override
    public void Incluir(Produtos objproduto) throws Exception {               
        try{
            
        String insertSQL = "insert into Produtos (nome,preco,descricao) values (?,?,?)";
         PreparedStatement insert = conexao.prepareStatement(insertSQL);
         
         
         insert.setString(1, objproduto.getNome());
         insert.setDouble(2,objproduto.getPreco());
         insert.setString(3, objproduto.getDescricao());
         insert.execute();
            JOptionPane.showMessageDialog(null, "Incluído com sucesso !");
      }catch(Exception erro){
        throw new Exception("ProdutoDAO Erro incluir");
     }
    }

   
    @Override
    public void Alterar(int id,Produtos objproduto) throws Exception {
        try {
            String updateSQL = "UPDATE produtos SET nome = ?, preco = ?,descricao = ? WHERE id = ?";
            
            PreparedStatement update = conexao.prepareStatement(updateSQL);
            
            
            update.setString(1, objproduto.getNome());
            update.setDouble(2, objproduto.getPreco());
            update.setString(3, objproduto.getDescricao());
            update.setInt(4, id);

            int linhasAfetadas = update.executeUpdate();
            
        } catch (Exception e) {
            throw new Exception("ProdutoDAO Erro Alterar");
        }
       
    }

    @Override
    public Produtos Consultar(Produtos objproduto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Produtos> ObterListagemDeProdutos() throws Exception {
        List<Produtos> produtos = new ArrayList<>();
        
         String listagem = "SELECT * FROM produtos";
         PreparedStatement lista = conexao.prepareStatement(listagem);
           
          ResultSet resultSet = lista.executeQuery();
          
          while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            double preco = resultSet.getDouble("preco");
            String descricao = resultSet.getString("descricao");

            Produtos produto = new Produtos(id, nome, descricao, preco);
                
                
                produtos.add(produto);
          }
            
    
        return produtos; 
    }
        

   
    @Override
    public void Deletar(int id) throws Exception {
        
        String dropSQL = "DELETE FROM produtos WHERE id = ?";
            
            PreparedStatement drop = conexao.prepareStatement(dropSQL);
            drop.setInt(1, id);
            int linhasAfetadas = drop.executeUpdate();
    }
    
    
}
