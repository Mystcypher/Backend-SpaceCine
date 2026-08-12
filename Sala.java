import enums.TiposSala;

public class Sala {

    private int id;
    private String assentos;
    private String infoSala;
    private TiposSala tiposSala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssentos() {
        return assentos;
    }

    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }

    public String getInfoSala() {
        return infoSala;
    }

    public void setInfoSala(String infoSala) {
        this.infoSala = infoSala;
    }

    public TiposSala getTiposSala() {
        return tiposSala;
    }

    public void setTiposSala(TiposSala tiposSala) {
        this.tiposSala = tiposSala;
    }

    public Sala(int id, TiposSala tiposSala, String infoSala, String assentos) {
        this.id = id;
        this.tiposSala = tiposSala;
        this.infoSala = infoSala;
        this.assentos = assentos;
    }
}