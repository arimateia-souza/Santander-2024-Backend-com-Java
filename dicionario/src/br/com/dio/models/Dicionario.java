package br.com.dio.models;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
                dicionarioMap.remove(palavra);
        }else {
            throw new RuntimeException();
        }
    }
    public Map<String,String> exibirPalavras(){
        return dicionarioMap;
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = "Não encontrado";
        if (!dicionarioMap.isEmpty()){
            definicao = dicionarioMap.get(palavra);
        }
        return definicao;
    }


}
