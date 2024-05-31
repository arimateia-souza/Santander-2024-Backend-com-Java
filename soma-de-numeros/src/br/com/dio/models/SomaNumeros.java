package br.com.dio.models;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }
    public int calcularSoma(){
        int total = 0;
        if (!numerosList.isEmpty()){
            for (int numero : numerosList){
                total += numero;
            }
        }
        return total;
    }
    public int encontrarMaiorNumero(){
        int maior = 0;
        if (!numerosList.isEmpty()){
            for (int numero : numerosList){
                if (numero >= maior){
                    maior = numero;
                }
            }
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        //System.out.println(menorNumero);
        if (!numerosList.isEmpty()){
            for (int numero : numerosList){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return numerosList;
    }
}
