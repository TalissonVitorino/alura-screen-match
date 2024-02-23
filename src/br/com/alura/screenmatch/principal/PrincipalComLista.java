package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter", 2003);
        meuFilme.avalia(9);
        Serie dragonball = new Serie("Dragon ball Super", 2015);
        dragonball.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2003);
        outroFilme.avalia(7);
        var filmePauloGustavo = new Filme("Minha mãe é uma peça", 2017);
        filmePauloGustavo.avalia(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmePauloGustavo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(dragonball);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("classificação " + filme.getClassificacao());

        }
    }
}
