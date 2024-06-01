package br.com.dio.models;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoDePalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoDePalavras = new HashSet<>();
    }
    public  void adicionarPalavra(String palavra){
        this.conjuntoDePalavras.add(palavra);
    }
    public void removerPalavra(String palavra){
        if (!this.conjuntoDePalavras.isEmpty()){
            if (conjuntoDePalavras.contains(palavra)) {
                this.conjuntoDePalavras.remove(palavra);
            }else {
                System.out.println("não existe nenhum conjunto de palavras com esta palavra");
            }

        }else {
            throw new RuntimeException();
        }
    }
    public boolean verificarPalavra(String palavra){
        boolean verifica = false;
        if (!this.conjuntoDePalavras.isEmpty()){
            if (conjuntoDePalavras.contains(palavra)) {
                verifica = true;
            }else {
                System.out.println("não existe nenhum conjunto de palavras com esta palavra");
            }
        }else {
            throw new RuntimeException("Erro: Conjunto de palavras vazio");
        }
        return verifica;
    }
    public void exibirPalavrasUnicas(){
        if (!conjuntoDePalavras.isEmpty()){
            System.out.println(conjuntoDePalavras);
        }else {
            System.out.println("Tá vazio!");
        }
    }


    @Override
    public String toString() {
        return "Conjunto de palavras: " + conjuntoDePalavras;
    }
}
