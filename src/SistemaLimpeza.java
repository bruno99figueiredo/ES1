import java.time.LocalDate;

public class SistemaLimpeza {
    private String nome_empresa;
    private int hora_entrada;
    private int nr_horas;
    private LocalDate data;
    private Sala sala;

    public SistemaLimpeza(String nome_empresa, int hora_entrada, int nr_horas, LocalDate data, Sala sala) {
        this.nome_empresa = nome_empresa;
        this.hora_entrada = hora_entrada;
        this.nr_horas = nr_horas;
        this.data = data;
        this.sala = sala;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public int getNr_horas() {
        return nr_horas;
    }

    public LocalDate getData() {
        return data;
    }

    public Sala getSala() {
        return sala;
    }
}
