package br.com.dio.models;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        if (!alunosSet.isEmpty()){
            for (Aluno a : alunosSet){
                if (a.getMatricula().equals(matricula)){
                    alunosSet.remove(a);
                }
            }
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
       Set<Aluno> alunoPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()){
            alunoPorNome.addAll(alunosSet);
            return alunoPorNome;
        }else {
            throw new RuntimeException("con. Vazio");
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunosSet.isEmpty()){
            alunoPorNota.addAll(alunosSet);
            return alunoPorNota;
        }else {
            throw new RuntimeException("conj. vazio");
        }
    }
    public Set<Aluno> exibirAlunos(){
        return alunosSet;
    }

}
