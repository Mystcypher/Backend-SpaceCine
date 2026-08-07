public class Sessao {

    public String info_ingres;
    public int sala;
    public int horarios;
    public String local;
    public int dia;
    public String tipo_sessao;

    public Sessao(String info_ingres, int sala, int horarios, String local, int dia, String tipo_sessao) {
        this.info_ingres = info_ingres;
        this.sala = sala;
        this.horarios = horarios;
        this.local = local;
        this.dia = dia;
        this.tipo_sessao = tipo_sessao;
    }
}