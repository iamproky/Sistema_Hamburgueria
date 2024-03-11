/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author pcgamergab
 */
public interface IVENDAS {
    public void registrarVenda(List<IProduto> listaDeProdutos);
    public List<IProduto> obterVendasOrdenadas();
       
}
