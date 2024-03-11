/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.IUsuarioCRUD;
import modelos.Produtos;
import modelos.Usuario;
import persistencia.UsuarioDAO;

/**
 *
 * @author aluno
 */
public class UsuarioControle implements IUsuarioCRUD{
    IUsuarioCRUD usuarioPersistencia = null;
    ValidaCpf validarCpf = new ValidaCpf();
    
    public UsuarioControle() throws SQLException {
        usuarioPersistencia = new UsuarioDAO();
         
    }

    
    @Override
    public void Incluir(Usuario objusuario) throws Exception {
        
             //validações dos campos da TelaCadastroCliente
             if( ValidaCpf.isCPF(objusuario.getCpf())== false) throw new Exception("CPF INVÁLIDO");
             if(objusuario.getNome().equals(""))throw new Exception("Campo nome está vazio");
             if(ValidarEmail.isValidEmailAddressRegex(objusuario.getEmail()) == false)throw new Exception("EMAIL Incorreto");
             if(objusuario.getTelefone().equals("       -    "))throw new Exception("Campo numero está vazio");
             if(objusuario.getEndereco().equals(""))throw new Exception("Campo endereço está vazio");
             if(objusuario.getCep().equals("     -   "))throw new Exception("Campo cep está vazio");
             
         
             usuarioPersistencia.Incluir(objusuario);throw new Exception("Usuário Cadastrado Com Sucesso");
    
               
    }

    @Override
    public void Alterar(Usuario objusuario) throws Exception {
        
        usuarioPersistencia.Alterar(objusuario); 
    }

    @Override
    public void Deletar(Usuario objusuario) throws Exception {
        
        usuarioPersistencia.Deletar(objusuario);
    }

    @Override
    public Usuario Consultar(Usuario objusuario) throws Exception {
     return   usuarioPersistencia.Consultar(objusuario);
    }

    @Override
    public List<Usuario> GetAllUsers() throws Exception {
             return usuarioPersistencia.GetAllUsers();
        }
    
}
