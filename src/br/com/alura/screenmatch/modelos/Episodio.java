package br.com.alura.screenmatch.modelos;

public class Episodio {
    private int numero_ep;
    private String nome_ep;

    private Serie serie;

    public int getNumero_ep() {
        return numero_ep;
    }

    public String getNome_ep() {
        return nome_ep;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNumero_ep(int numero_ep) {
        this.numero_ep = numero_ep;
    }

    public void setNome_ep(String nome_ep) {
        this.nome_ep = nome_ep;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
