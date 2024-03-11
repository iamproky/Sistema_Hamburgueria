/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author aluno
 */


public class CarrinhoDeCompras {
    // A instância única da classe CarrinhoDeCompras
    private static CarrinhoDeCompras instance;

    private List<CarrinhoObserver> observers = new ArrayList<>();
    private List<IProduto> itens = new ArrayList<>();

    public void adicionarObserver(CarrinhoObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(CarrinhoObserver observer) {
        observers.remove(observer);
    }


    private void notificarObservers(IProduto produto) {
        for (CarrinhoObserver observer : observers) {
            observer.itemAdicionado(produto);
        }
    }

    // Construtor privado para evitar criação direta de instâncias
    private CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    // Método público para obter a instância única
    public static CarrinhoDeCompras getInstance() {
        if (instance == null) {
            instance = new CarrinhoDeCompras();
        }
        return instance;
    }
    

    public void removerItem(IProduto item) {
        itens.remove(item);
    }

    public List<IProduto> getItens() {
        return itens;
    }
    public boolean estaVazio() {
        return itens.isEmpty();
    }
     public void limparCarrinho(){
        itens.clear();
    }
    public double calcularTotal() {
        double total = 0.00;
        for (IProduto item : itens) {
            total += item.getPreco()  * item.getQuantidade();
        }
        return total;
    }
    
     public ArrayList<IProduto> listarProdutosNoCarrinhoTable() {
        return new ArrayList<>(itens);
    }
     
    public void adicionarItem(IProduto item) {
    for (IProduto it : itens) {
        if (saoIguais(it, item)) {
            it.aumentarQuantidadeProduto(item.getQuantidade());
            notificarObservers(item);
            return;
        }
    }
    itens.add(item);
}

private boolean saoIguais(IProduto produto1, IProduto produto2) {
    // Comparação baseada no nome e adicionais
    return produto1.getNome().equals(produto2.getNome()) && temMesmosAdicionais(produto1, produto2);
}

private boolean temMesmosAdicionais(IProduto produto1, IProduto produto2) {
    // Adicione a lógica específica para comparar os adicionais aqui
    // Por exemplo, se ambos são decoradores, compare os tipos de decoradores
    return true; // Implemente conforme necessário
}
}
