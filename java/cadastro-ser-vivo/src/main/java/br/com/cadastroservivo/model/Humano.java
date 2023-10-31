package br.com.cadastroservivo.model;

public class Humano extends SerVivo {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void emitirSom() {
        System.out.println("Consegue falar 'blá blá blá'");
    }
}
