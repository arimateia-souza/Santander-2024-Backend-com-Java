package br.com.dio.model;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta conta);
    void exibirDados();
}
