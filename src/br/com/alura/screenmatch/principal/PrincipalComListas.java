package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1973);
        meuFilme.avalia(5);
        Filme filmeDaCaroline = new Filme("Todos menos você", 2023);
        filmeDaCaroline.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filmeDaCaroline);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordena por ana: ");
        System.out.println(lista);
    }
}