/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import bancodedados.ConexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.IUsuarioCRUD;
import modelos.Produtos;
import modelos.Usuario;

/**
 *
 * @author aluno
 */
public class UsuarioDAO implements IUsuarioCRUD {
    
    
        private Connection conexao = null;
	private PreparedStatement stm = null;

    
    public UsuarioDAO() throws SQLException {
        
        conexao = ConexaoBD.createConnection();
    }
    
    

    @Override
    public void Incluir(Usuario objusuario) throws Exception {
        try {
            String insertSQL = "INSERT INTO USUARIO (CPF,NOME,ENDERECO,CEP,TELEFONE,EMAIL) VALUES (?,?,?,?,?,?)";
            PreparedStatement insert = conexao.prepareStatement(insertSQL);
           
		
                insert.setString(1, objusuario.getCpf());
		insert.setString(2, objusuario.getNome());
                insert.setString(3, objusuario.getEndereco());
                insert.setString(4, objusuario.getCep());
		insert.setString(5, objusuario.getTelefone());
		insert.setString(6, objusuario.getEmail());
		
		insert.executeUpdate();
		insert.close();
                  
        } catch (SQLException erro){
            throw new SQLException(erro);
       
        }
    }
                   
                

    @Override
    public void Alterar(Usuario objusuario) throws Exception {
        
        stm = conexao.prepareStatement("UPDATE USUARIO SET NOME = ?, TELEFONE = ? , EMAIL = ? WHERE CPF = ?");
		stm.setString(4, objusuario.getCpf());
		stm.setString(1, objusuario.getNome());
		stm.setString(2, objusuario.getTelefone());
		stm.setString(3, objusuario.getEmail());
		stm.executeUpdate();
		stm.close();
    }

    @Override
    public void Deletar(Usuario objusuario) throws Exception {
        
        stm = conexao.prepareStatement("DELETE FROM USUARIO WHERE LOGIN = ?");
		stm.setString(1, objusuario.getCpf());
		stm.executeUpdate();
		stm.close();
    }

    @Override
    public Usuario Consultar(Usuario objusuario) throws Exception {
        
         JOptionPane.showMessageDialog(null, "Nada");
            return null;
            
    }

    @Override
    public List<Usuario> GetAllUsers() throws SQLException{
	        return null;
	}
    }
