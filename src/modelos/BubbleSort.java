/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author pcgamergab
 */
import java.util.List;

public class BubbleSort  {

    public static void sort(List<IProduto> listaDeProdutos) {
        if (listaDeProdutos == null || listaDeProdutos.isEmpty()) {
            return;
        }

        int n = listaDeProdutos.size();
        boolean troca;

        do {
            troca = false;
            for (int i = 0; i < n - 1; i++) {
                IProduto produtoAtual = listaDeProdutos.get(i);
                IProduto proximoProduto = listaDeProdutos.get(i + 1);

                // Comparação por nome e, em caso de empate, por valor
                if (produtoAtual.getNome().compareTo(proximoProduto.getNome()) > 0
                        || (produtoAtual.getNome().equals(proximoProduto.getNome())
                        && produtoAtual.getPreco()> proximoProduto.getPreco())) {
                    swap(listaDeProdutos, i, i + 1);
                    troca = true;
                }
            }
            n--;
        } while (troca);
    }

    private static void swap(List<IProduto> listaDeProdutos, int i, int j) {
        IProduto temp = listaDeProdutos.get(i);
        listaDeProdutos.set(i, listaDeProdutos.get(j));
        listaDeProdutos.set(j, temp);
    }
}
    

    

