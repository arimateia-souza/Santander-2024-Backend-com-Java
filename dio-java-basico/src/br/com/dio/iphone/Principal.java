package br.com.dio.iphone;

import br.com.dio.iphone.models.Iphone;

public class Principal {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("15 Pro");
        iphone.ligar("088888888");
        iphone.atender();
        iphone.selecionarMusica("Believer");
        iphone.exibirPagina("google");
        iphone.atualizarPagina();
        iphone.adiconarNovaAba();


    }
}
