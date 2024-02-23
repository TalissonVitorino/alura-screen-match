package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter", 2003);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFixaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações do filme: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDasAvaliaCoes());

        Serie dragonball = new Serie("Dragon ball Super", 2015);
        dragonball.exibeFixaTecnica();
        dragonball.setTemporadas(10);
        dragonball.setEpisodioPorTemporada(10);
        dragonball.setMinutosPorEpisodio(50);
        System.out.println("Duração do serie: " + dragonball.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2003);
//        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2003);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(dragonball);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(dragonball);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmePauloGustavo = new Filme("Minha mãe é uma peça", 2017);
        filmePauloGustavo.setDuracaoEmMinutos(200);
        filmePauloGustavo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmePauloGustavo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista: " + listaDeFilmes.size());
        System.out.println("primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println(" toString do filme " + listaDeFilmes.get(0).toString());
    }
}