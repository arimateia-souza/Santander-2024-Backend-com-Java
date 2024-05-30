package br.com.dio.iphone.models;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    public Iphone(String modelo){
        this.modelo = modelo;
    }


    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("chamada atendida");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Correio de voz");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("pagina da WEB");

    }

    @Override
    public void adiconarNovaAba() {
        System.out.println("Nova aba na WEB");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina da WEB");

    }

    @Override
    public void tocar(String musica) {
        System.out.println("tocando musica" + musica);

    }

    @Override
    public void pausar() {
        System.out.println("musica pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("musica selecionada: "+ musica);
        tocar(musica);

    }
}
