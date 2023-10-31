package br.com.cadastroservivo.model;

public class Animal extends SerVivo {
    private String tipo;
    private String raca;
    private String porte;
    private String cor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println("Faz som específico da sua espécie 'au au au'");
    }
}
