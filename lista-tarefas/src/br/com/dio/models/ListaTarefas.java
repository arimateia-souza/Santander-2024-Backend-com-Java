package br.com.dio.models;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = t;
                    break;
                }else {
                    System.out.println();
                }
            }
        }
        tarefaSet.remove(tarefaRemover);
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet){
                if (!t.isConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }else {
            throw new RuntimeException("TarefaSet Vazio.");
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(true);
                }
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluida(false);
                }
            }
        }
    }
    public void limparListaTarefas(){
        if (tarefaSet.isEmpty()){
            System.out.println("Ta vazia");
        }else {
            tarefaSet.clear();
        }
    }


}
