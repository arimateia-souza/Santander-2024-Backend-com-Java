package br.com.dio;

import br.com.dio.models.ConjuntoPalavrasUnicas;

public class Principal {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Eu sei");
        conjuntoPalavrasUnicas.adicionarPalavra("ok meu Java");
        conjuntoPalavrasUnicas.adicionarPalavra("amora");
        conjuntoPalavrasUnicas.adicionarPalavra("amora");
        System.out.println(conjuntoPalavrasUnicas);
        conjuntoPalavrasUnicas.removerPalavra("Amor");
        System.out.println(conjuntoPalavrasUnicas);
        String palavra = "amora";
        if (conjuntoPalavrasUnicas.verificarPalavra(palavra)){
            System.out.println("A palavra: " + palavra + "Está presente!");
        }else {
            System.out.println("A palavra: " + palavra + "NÃO está presente!");
        }
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
