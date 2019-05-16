public class Sala {
    private String estado;
    private TipoSala tipoSala;
    private int nr_sala;

    public Sala(String estado, TipoSala tipoSala, int nr_sala) {
        this.estado = estado;
        this.tipoSala = tipoSala;
        this.nr_sala = nr_sala;
    }

    public String getEstado() {
        return estado;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public int getNr_sala() {
        return nr_sala;
    }
}
