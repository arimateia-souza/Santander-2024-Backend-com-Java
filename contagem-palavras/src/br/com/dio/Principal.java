package br.com.dio;

import br.com.dio.models.Contagempalavras;

public class Principal {
    public static void main(String[] args) {
        Contagempalavras contagem = new Contagempalavras();
        contagem.adicionarPalavra("teste",2);
        contagem.adicionarPalavra("outro",8);
        contagem.adicionarPalavra("aa",2);
        System.out.println(contagem.encontrarPalavraMaisFrequente());
        contagem.removerPalavra("outro");
        System.out.println(contagem.encontrarPalavraMaisFrequente());
        System.out.println(contagem.exibirContagemPalavras());


    }
}
