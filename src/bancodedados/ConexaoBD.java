/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodedados;

import java.sql.*;

public class ConexaoBD {
   
   
     public static Connection createConnection() throws SQLException{
           
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja", "root", "aluno");
             return conn;
        }
   
}
