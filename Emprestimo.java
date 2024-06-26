import java.io.Serializable;
import java.time.LocalDate;

<<<<<<< Updated upstream:Emprestimo.java
public class Emprestimo {

=======
public class Emprestimo implements Serializable{
    private static int contadorId = 0; // Contador estático para gerar IDs únicos
    private int id; // Identificador único para cada empréstimo
>>>>>>> Stashed changes:src/model/Emprestimo.java
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

<<<<<<< Updated upstream:Emprestimo.java
=======
    @Override
    public String toString() {
        return "\nId: " + id
        + "\nMembro: " + membro.getNome()
        + "\nLivro: " + livro.getTitulo()
        + "\nData inicio: " + dataInicio
        + "\nData fim: " + dataFim
        + "\nStatus: " + status.getDescricao()
        +"\n=================";
    }
>>>>>>> Stashed changes:src/model/Emprestimo.java
}
