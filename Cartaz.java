public class Cartaz {

    private String titulo;
    private String imagem;
    private int classIndica;
    private int dtEstreia;
    private String genero;
    private double duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getClassIndica() {
        return classIndica;
    }

    public void setClassIndica(int classIndica) {
        this.classIndica = classIndica;
    }

    public int getDtEstreia() {
        return dtEstreia;
    }

    public void setDtEstreia(int dtEstreia) {
        this.dtEstreia = dtEstreia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public Cartaz(String titulo, String imagem, int classIndica, int dtEstreia, String genero, int duracao) {
        this.titulo = titulo;
        this.imagem = imagem;
        this.classIndica = classIndica;
        this.dtEstreia = dtEstreia;
        this.genero = genero;
        this.duracao = duracao;
    }
}