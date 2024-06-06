package br.com.dio;

import br.com.dio.model.Cliente;
import br.com.dio.model.Conta;
import br.com.dio.model.ContaCorrente;
import br.com.dio.model.SaldoInsuficienteExeception;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao =0;
        Cliente clienteJunior = new Cliente("Junior","00000",88265465451L,"12345");
        Cliente clienteMaria = new Cliente("Maria","123",88265465451L, "minhasenha");
        Conta contaJunior = new ContaCorrente(clienteJunior);
        Conta contaMaria = new ContaCorrente(clienteMaria);
        contaJunior.exibirDados();
        contaMaria.exibirDados();
        contaJunior.depositar(600);
        contaJunior.transferir(100, contaMaria);
        try {
            contaJunior.transferir(800,contaMaria);

        }catch (SaldoInsuficienteExeception e){
            System.out.println(e.getMessage());
        }
        contaJunior.exibirDados();
        contaMaria.exibirDados();
    }

}
