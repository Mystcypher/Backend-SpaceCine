public class Avaliacao {

    private String usuario;
    private int estrelas;
    private String resenha;
    private int dtResenha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public String getResenha() {
        return resenha;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public int getDtResenha() {
        return dtResenha;
    }

    public void setDtResenha(int dtResenha) {
        this.dtResenha = dtResenha;
    }

    public Avaliacao(String usuario, int estrelas, String resenha, int dtResenha) {
        this.usuario = usuario;
        this.estrelas = estrelas;
        this.resenha = resenha;
        this.dtResenha = dtResenha;
    }
}