/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import bancodedados.ConexaoBD;
import modelos.IVENDAS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.IProduto;
import modelos.ProdutoBase;
import modelos.Produtos;

/**
 *
 * @author pcgamergab
 */
public class VendaDAO implements IVENDAS{
    
        private Connection conexao = null;
	private PreparedStatement stm = null;

    
    public VendaDAO() throws SQLException {
        
        conexao = ConexaoBD.createConnection();
    }

    @Override
   public void registrarVenda(List<IProduto> listaDeProdutos) {
        String sql = "INSERT INTO tabela_vendas (nome, quantidade, preco) VALUES (?,?,?)";
        
            for (IProduto produto : listaDeProdutos) {
                try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                    // Substituir os pontos de interrogação pelos valores reais
                    preparedStatement.setString(1, produto.getNome());
                    preparedStatement.setInt(2, produto.getQuantidade());
                    preparedStatement.setDouble(3, produto.getPreco());
                    

                    // Executar a inserção
                    preparedStatement.executeUpdate();                   
                } catch (SQLException e) {
                    e.printStackTrace();
                }         
        }
   }
   
    @Override
    public List<IProduto> obterVendasOrdenadas() {
        List<IProduto> listaDeProdutos = new ArrayList<>();
        String sql = "SELECT * FROM tabela_vendas ORDER BY nome, quantidade";

        try (
             PreparedStatement stm = conexao.prepareStatement(sql);
             ResultSet resultSet = stm.executeQuery()) {

            while (resultSet.next()) {
                String produto = resultSet.getString("nome");
                String quantidade = resultSet.getString("quantidade");
                double precoTotal = resultSet.getDouble("preco");

                // Criar instância de IProduto e adicionar à lista
                IProduto produtoObj = new ProdutoBase(produto, precoTotal, quantidade);
                listaDeProdutos.add(produtoObj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaDeProdutos;
    }
}



    



    


    
    

