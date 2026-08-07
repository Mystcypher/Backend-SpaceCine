import java.time.LocalDate;

import enums.GeneroFilme;

public class Filme {

    public int id;
    public String nome;
    public GeneroFilme generoFilme;
    public double duracao;
    public String idioma;
    public String sinopse;
    public LocalDate dt_est;

    //CONSTRUTOR VAZIO
    public Filme() {
    }

    // CONSTRUTOR COM ARGUMENTOS
    public Filme(int id, String nome, GeneroFilme generoFilme, double duracao, String idioma, String sinopse, LocalDate dt_est) {
        this.id = id;
        this.nome = nome;
        this.generoFilme = generoFilme;
        this.duracao = duracao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.dt_est = dt_est;
    }
}