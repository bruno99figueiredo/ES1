import java.time.LocalDate;

public class Main {

    private Repositorio repo;

    public static void main(String args[]){
        Utilizador u = new Utilizador("Manuel","Ativo", new TipoUtilizador("aluno",10));
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);

        /*Novas Classes*/
        //
        Leitor leitor= new Leitor("Bruno","ativo", "aluno");
        Sala sala =new Sala("livre","sala de leitura",1);
        AluguerSala aluguerSala= new AluguerSala("Bruno",3, LocalDate.now(),sala);
        SistemaLimpeza sistemaLimpeza = new SistemaLimpeza("Ajax",3, LocalDate.now(),sala);
        GestaoLeitura gestaoLeitura= new GestaoLeitura(sala,"Romance", LocalDate.now(), 3, leitor);
        //

        //... criação do objeto repositorio
        Repositorio repo = new RepositorioMem();
        repo.adicionaEntradaNovoLivro(entradaNovoLivro);
    }
}
