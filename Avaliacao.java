public class Avaliacao {

    public String usuario;
    public int estrelas;
    public String resenha;
    public int dt_resenha;

    public Avaliacao(String usuario, int estrelas, String resenha, int dt_resenha) {
        this.usuario = usuario;
        this.estrelas = estrelas;
        this.resenha = resenha;
        this.dt_resenha = dt_resenha;
    }
}