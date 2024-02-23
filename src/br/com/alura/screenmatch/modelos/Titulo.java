package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Titulo {

    private String nome;
    int anoDeLancamento;
    private boolean incluidoNoPalno;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meutituloOmdb) {
        this.nome = meutituloOmdb.title();

        if (meutituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException
                    (" Não consegui converter o ano por que tem mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meutituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meutituloOmdb.runtime().substring(0, 2));

    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPalno() {
        return incluidoNoPalno;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPalno(boolean incluidoNoPalno) {
        this.incluidoNoPalno = incluidoNoPalno;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFixaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("O ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double mediaDasAvaliaCoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "(nome = " + nome +
                ", anoDeLancamento = " + anoDeLancamento + "," +
                " duração = " + duracaoEmMinutos + ")";

    }
}
