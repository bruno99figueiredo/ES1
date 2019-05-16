import java.time.LocalDate;

public class TipoSala {
    private String descricao;
    private int tempo_utilizacao;
    private LocalDate data;

    public TipoSala(String descricao, int tempo_utilizacao, LocalDate data) {
        this.descricao = descricao;
        this.tempo_utilizacao = tempo_utilizacao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTempo_utilizacao() {
        return tempo_utilizacao;
    }

    public LocalDate getData() {
        return data;
    }
}
