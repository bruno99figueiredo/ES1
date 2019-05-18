import java.time.LocalDate;

public class GestaoLeitura {
    private Sala sala;
    private Livro livro;
    private String tipo_livro;
    private LocalDate data;
    private int nr_horas;
    private Leitor leitor;

    public GestaoLeitura(Sala sala, Livro livro, String tipo_livro, LocalDate data, int nr_horas, Leitor leitor) {
        this.sala = sala;
        this.livro = livro;
        this.tipo_livro = tipo_livro;
        this.data = data;
        this.nr_horas = nr_horas;
        this.leitor = leitor;
    }

    public Sala getSala() {
        return sala;
    }

    public Livro getLivro() {
        return livro;
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
