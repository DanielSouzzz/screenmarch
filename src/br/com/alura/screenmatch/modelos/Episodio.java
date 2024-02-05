package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifica;

public class Episodio implements Classifica {
    private int numero_ep;
    private String nome_ep;
    private Serie serie;
    private int totalVisualizacoes;

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

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

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
