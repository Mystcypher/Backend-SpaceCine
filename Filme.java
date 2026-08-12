import java.time.LocalDate;

import enums.GeneroFilme;

public class Filme {

    private int id;
    private String nome;
    private GeneroFilme generoFilme;
    private double duracao;
    private String idioma;
    private String sinopse;
    private LocalDate dtEstreia;

    public int getId(){
        return id;
    }

    public void setId(int id){
            this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public GeneroFilme getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(GeneroFilme generoFilme) {
        this.generoFilme = generoFilme;
    }

    public double getDuracao(){
        return duracao;
    }

    public void setDuracao(double duracao){
        if (duracao < 0){
            IO.println("A duração não pode ser negativa");
        } else {
            this.duracao = duracao;
        }
    }

    public String getIdioma(){
        return idioma;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public String getSinopse(){
        return sinopse;
    }

    public void setSinopse(String sinopse){
        this.sinopse = sinopse;
    }

    public LocalDate getDtEstreia(){
        return dtEstreia;
    }

    public void setDtEstreia(LocalDate dtEstreia){
        this.dtEstreia = dtEstreia;
    }


    //CONSTRUTOR VAZIO
    public Filme() {
    }

    // CONSTRUTOR COM ARGUMENTOS
    public Filme(int id, String nome, GeneroFilme generoFilme, double duracao, String idioma, String sinopse, LocalDate dtEstreia) {
        this.id = id;
        this.nome = nome;
        this.generoFilme = generoFilme;
        this.duracao = duracao;
        this.idioma = idioma;
        this.sinopse = sinopse;
        this.dtEstreia = dtEstreia;
    }
}