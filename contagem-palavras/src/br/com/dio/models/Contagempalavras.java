package br.com.dio.models;

import java.util.HashMap;
import java.util.Map;

public class Contagempalavras {
    Map<String, Integer> contagemMap;

    public Contagempalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra,contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemMap.isEmpty()){
            contagemMap.remove(palavra);
        }
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : contagemMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente(){
       String palavraMaisFrequente = null;
       int contagem = 0;
       for (Map.Entry<String,Integer> entry : contagemMap.entrySet()){
           if (entry.getValue() > contagem) {
               contagem = entry.getValue();
               palavraMaisFrequente = entry.getKey();
           }
        }
        return palavraMaisFrequente;
    }

}
