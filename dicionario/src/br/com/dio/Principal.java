package br.com.dio;

import br.com.dio.models.Dicionario;

public class Principal {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("melhor bebida", "cafe");
        dicionario.adicionarPalavra("melhor ide", "IntelliJ");

        System.out.println(dicionario.exibirPalavras());

        System.out.println(dicionario.pesquisarPorPalavra("melhor bebida"));
        dicionario.removerPalavra("melhor bebida");
        System.out.println(dicionario.exibirPalavras());



    }
}
