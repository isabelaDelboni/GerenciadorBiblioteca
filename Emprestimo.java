import java.time.LocalDate;

public class Emprestimo {

    private Livros livro;
    private Membro membro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean ativo;

    public Emprestimo(Livros livro, Membro membro, LocalDate dataInicio, LocalDate dataFim) {
        this.livro = livro;
        this.membro = membro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ativo = true;
        livro.setLivroDisponivel(false);
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void finalizarEmprestimo() {
        this.ativo = false;
        livro.setLivroDisponivel(true);
        membro.adicionarEmprestimoAoHistorico(this);
    }

}
