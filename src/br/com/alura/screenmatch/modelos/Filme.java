package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifica;

public class Filme extends Titulo implements Classifica {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}