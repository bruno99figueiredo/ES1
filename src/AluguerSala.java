import java.time.LocalDate;

public class AluguerSala {
    private int tempo_utilizacao;
    private LocalDate data;
    private Sala sala;

    public AluguerSala(int tempo_utilizacao, LocalDate data, Sala sala) {
        this.tempo_utilizacao = tempo_utilizacao;
        this.data = data;
        this.sala = sala;
    }

    public int getTempo_utilizacao() {
        return tempo_utilizacao;
    }

    public LocalDate getData() {
        return data;
    }

    public Sala getSala() {
        return sala;
    }
}

