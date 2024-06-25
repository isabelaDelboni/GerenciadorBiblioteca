import java.time.LocalDate;

public class Emprestimo {

    private Livro livro;
    private Membro membro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private StatusEmprestimo status;

    public Emprestimo(Livro livro, Membro membro, LocalDate dataInicio, LocalDate dataFim, StatusEmprestimo status) {
        this.livro = livro;
        this.membro = membro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        livro.setLivroDisponivel(false);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
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

    public StatusEmprestimo getStatus() {
        return status;
    }

    public void setStatus(StatusEmprestimo status) {
        this.status = status;
    }

    public void finalizarEmprestimo() {
        livro.setLivroDisponivel(true);
        membro.adicionarEmprestimoAoHistorico(this);
        setStatus(StatusEmprestimo.RETORNADO);
    }

    public static void add(Emprestimo emprestimo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}
