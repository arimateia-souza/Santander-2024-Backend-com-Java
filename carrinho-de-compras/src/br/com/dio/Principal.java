package br.com.dio;

import br.com.dio.models.CarrinhoDeCompras;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

//        carrinhoDeCompras.adicionarItem("teste",100,5);
//        carrinhoDeCompras.adicionarItem("caju",5,2);
//        carrinhoDeCompras.adicionarItem("quadro",50,1);

        carrinhoDeCompras.removerItem("teste");

        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());

    }
}
