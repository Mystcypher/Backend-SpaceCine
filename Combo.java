public class Combo {

    private float preco;
    private String tipoCombo;
    private String brindes;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipoCombo() {
        return tipoCombo;
    }

    public void setTipoCombo(String tipoCombo) {
        this.tipoCombo = tipoCombo;
    }

    public String getBrindes() {
        return brindes;
    }

    public void setBrindes(String brindes) {
        this.brindes = brindes;
    }

    public Combo(float preco, String tipoCombo, String brindes) {
        this.preco = preco;
        this.tipoCombo = tipoCombo;
        this.brindes = brindes;
    }
}