package br.com.dio;

import br.com.dio.models.SomaNumeros;

public class Principal {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(50);
        numeros.adicionarNumero(61000);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(5);
        System.out.println(numeros.calcularSoma());
        System.out.println("numero maior: " + numeros.encontrarMaiorNumero());
        System.out.println("numero menor: " + numeros.encontrarMenorNumero());
        System.out.println("Lista de todos os numeros: " + numeros.exibirNumeros());
    }
}
