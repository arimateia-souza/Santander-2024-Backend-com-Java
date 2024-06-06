package br.com.dio.model;

public class Cliente {
    private String nome;
    private String cpf;
    private Long celular;
    private String senha;

    public Cliente(String nome, String cpf, Long celular, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.senha = senha;
    }
    public void alterarCelular(Long novoCelular){
        setCelular(novoCelular);
    }

    private void setCelular(Long celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", celular=" + celular +
                '}';
    }
}
