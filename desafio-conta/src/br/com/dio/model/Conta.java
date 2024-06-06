package br.com.dio.model;

public  class Conta implements IConta {
    protected int agencia;
    private static int sequencial = 1;
    protected int numero;
    protected double saldo ;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = 1516;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente");
        }else {
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new RuntimeException("Impossivel depositar, Valor do deposito menor ou igual a 0");
        }else{
            this.saldo += valor;
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        if (valor > saldo) {
            throw new SaldoInsuficienteExeception("Saldo infuficiente");
        }else {
            this.sacar(valor);
            conta.depositar(valor);
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Agencia: " +this.agencia);
        System.out.println("numero: " +this.numero);
        System.out.println("saldo: " +this.saldo);
        System.out.println("nome do cliente: " +this.cliente);
    }

}
