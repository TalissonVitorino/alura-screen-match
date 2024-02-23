package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int minutosPorEpisodio;
    private int temporadas;
    private boolean ativa;
    private int EpisodioPorTemporada;

    public Serie(String nome, int anoDelacamento) {
        super(nome, anoDelacamento);
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodioPorTemporada() {
        return EpisodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.EpisodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * EpisodioPorTemporada * minutosPorEpisodio;
    }
}
