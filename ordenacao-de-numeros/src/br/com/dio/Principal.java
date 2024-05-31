package br.com.dio;

import br.com.dio.models.OrdencaoNumeros;

public class Principal {
    public static void main(String[] args) {
        OrdencaoNumeros ordencaoNumeros = new OrdencaoNumeros();

        ordencaoNumeros.adicionarNumero(1);
        ordencaoNumeros.adicionarNumero(5);
        ordencaoNumeros.adicionarNumero(2);
        ordencaoNumeros.adicionarNumero(4);
        ordencaoNumeros.adicionarNumero(3);
        System.out.println(ordencaoNumeros.ordenarAscendente());
        System.out.println(ordencaoNumeros.ordenarDescendente());

    }
}
