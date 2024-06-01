package br.com.dio;

import br.com.dio.models.GerenciadorAlunos;

public class Principal {
    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Ari",2024454521L,10.0);
        alunos.adicionarAluno("Ari",2024454521L,7.0);
        alunos.adicionarAluno("João",2024454522L,8.0);
        alunos.adicionarAluno("Maria",2026454522L,2.0);
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());
        System.out.println(alunos.exibirAlunos());
    }
}
