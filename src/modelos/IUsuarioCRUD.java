/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import java.util.List;

/**
 *
 * @author aluno
 */
public interface IUsuarioCRUD {
    
    public void Incluir (Usuario objusuario) throws Exception;
    public void Alterar(Usuario objusuario)throws Exception;
    public void Deletar(Usuario objusuario)throws Exception;
    public Usuario Consultar(Usuario objusuario)throws Exception;
    public  List<Usuario> GetAllUsers()throws Exception; 
    
}
