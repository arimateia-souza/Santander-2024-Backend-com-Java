package br.com.dio.models;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        this.itensList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()){
            for(Item i : itensList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }
            itensList.removeAll(itemsParaRemover);
        }else {
            System.out.println("Lista vazia");
        }
    }
    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itensList.isEmpty()) {
            for (Item i : itensList) {
                valorTotal += (i.getPreco() * i.getQuantidade());
            }
        } else {
            System.out.println("Não há itens no seu carrinho.");
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println(itensList);
    }

}
