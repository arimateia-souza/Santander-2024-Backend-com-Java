package br.com.dio.model;

public class SaldoInsuficienteExeception extends RuntimeException{

    public SaldoInsuficienteExeception(String mensagem) {
        super(mensagem);
    }
}
