public class Sessao {

    private String infoIngresso;
    private int sala;
    private int horarios;
    private String local;
    private int dia;
    private String tipoSessao;

    public String getInfoIngresso() {
        return infoIngresso;
    }

    public void setInfoIngresso(String infoIngresso) {
        this.infoIngresso = infoIngresso;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getHorarios() {
        return horarios;
    }

    public void setHorarios(int horarios) {
        this.horarios = horarios;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getTipoSessao() {
        return tipoSessao;
    }

    public void setTipoSessao(String tipoSessao) {
        this.tipoSessao = tipoSessao;
    }

    public Sessao(String infoIngresso, int sala, int horarios, String local, int dia, String tipoSessao) {
        this.infoIngresso = infoIngresso;
        this.sala = sala;
        this.horarios = horarios;
        this.local = local;
        this.dia = dia;
        this.tipoSessao = tipoSessao;
    }
}