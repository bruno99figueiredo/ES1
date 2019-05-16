public class Leitor {
    private String nome_leitor;
    private String estado;
    private String descricao;

    public Leitor(String nome_leitor, String estado, String descricao) {
        this.nome_leitor = nome_leitor;
        this.estado = estado;
        this.descricao = descricao;
    }

    public String getNome_leitor() {
        return nome_leitor;
    }

    public String getEstado() {
        return estado;
    }

    public String getDescricao() {
        return descricao;
    }
}
