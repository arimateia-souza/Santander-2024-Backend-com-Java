package br.com.dio.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdencaoNumeros {
    List<Integer> numeros;

    public OrdencaoNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
         List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
         if (!numeros.isEmpty()){
             Collections.sort(numerosAscendentes);
         }
         return numerosAscendentes;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);
        if (!this.numeros.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
        }else {
            throw new RuntimeException("Ta vazio");
        }
        return numerosDescendentes;
    }




}
