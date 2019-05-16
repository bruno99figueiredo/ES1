public interface Repositorio {

    void adicionaUtilizador(Utilizador utilizador);
    void adicionaTipoUtilizador(TipoUtilizador tipo);
    void adicionaRequisicao(Requisicao requisicao);
    void adicionaCopia(Copia copia);
    void adicionaLivro(Livro livro);
    void adicionaEmprestimo(Emprestimo emprestimo);
    void adicionaNotificacao(Notificacao notificacao);
    void adicionaDevolucao(Devolucao devolucao);
    void adicionaCoima(Coima coima);
    Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
    void	adicionaEncomenda(Encomenda encomenda);
    void	adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    void	adicionaPropostaRequisicao(PropostaAquisicao proposta);
    void	adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);


    /*Novas Classes*/
    //
    void adicionaLeitor (Leitor leitor);
    void adicionaSala(Sala sala);
    void adicionaAluguerSala(AluguerSala aluguerSala);
    void adicionaSistemaLimpeza(SistemaLimpeza sistemaLimpeza);
    void adicionaGestaoLeitura(GestaoLeitura gestaoLeitura);
}
