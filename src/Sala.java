public class Sala {
    private String estado;
    private String descricao;
    private int nr_sala;

    public Sala(String estado, String descricao, int nr_sala) {
        this.estado = estado;
        this.descricao = descricao;
        this.nr_sala = nr_sala;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNr_sala() {
        return nr_sala;
    }
}
