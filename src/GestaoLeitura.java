import java.time.LocalDate;

public class GestaoLeitura {
    private Sala sala;
    private String tipo_livro;
    private LocalDate data;
    private int nr_horas;
    private Leitor leitor;

    public GestaoLeitura(Sala sala, String tipo_livro, LocalDate data, int nr_horas, Leitor leitor) {
        this.sala = sala;
        this.tipo_livro = tipo_livro;
        this.data = data;
        this.nr_horas = nr_horas;
        this.leitor = leitor;
    }

    public Sala getSala() {
        return sala;
    }

    public String getTipo_livro() {
        return tipo_livro;
    }

    public LocalDate getData() {
        return data;
    }

    public int getNr_horas() {
        return nr_horas;
    }

    public Leitor getLeitor() {
        return leitor;
    }
}
