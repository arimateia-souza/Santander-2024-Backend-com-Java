package br.com.dio;

import br.com.dio.models.ListaTarefas;

public class Principal {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Jogar bola");
        listaTarefas.adicionarTarefa("Agoar plantas");
        listaTarefas.adicionarTarefa("Estudar");

        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        listaTarefas.marcarTarefaConcluida("Estudar");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Estudar");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("Antes de limpar");
        listaTarefas.exibirTarefas();
        System.out.println("Depois de limpar");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

        //System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

    }
}
