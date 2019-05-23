import java.time.LocalDate;

public class AluguerSala {
    private UtilizadorSala utilizadorSala;
    private int hora_entrada;
    private int tempo_utilizacao;
    private LocalDate data;
    private Sala sala;

    public AluguerSala(UtilizadorSala utilizadorSala, int hora_entrada, int tempo_utilizacao, LocalDate data, Sala sala) {
        this.utilizadorSala = utilizadorSala;
        this.hora_entrada = hora_entrada;
        this.tempo_utilizacao = tempo_utilizacao;
        this.data = data;
        this.sala = sala;
    }

    public UtilizadorSala getUtilizadorSala() {
        return utilizadorSala;
    }

    public int getHora_entrada() {
        return hora_entrada;
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

