import java.time.LocalDate;
import java.util.List;

public class Emprestimo {

    private int idEmprestimo;
    private int idLivro;
    private int idMembro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean status;

    CriadorDeIdUnico criador = new CriadorDeIdUnico();
    List<Livro> livros;

    public Emprestimo(int idMembro, int idLivro, LocalDate dataInicio, LocalDate dataFim) {
        this.idEmprestimo = criador.gerarIdUnico();
        this.idLivro = idLivro;
        this.idMembro = idMembro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        ((Livro) livros).setLivroDisponivel(false);
    }

    public int getIdLivro(){
        return idLivro;
    }

    public int getIdMembro(){
        return idMembro;
    }
    
    public int getIdEmprestimo(){
        return idEmprestimo;
    }

    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    } 
    
    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo= idEmprestimo;
    }

    public void setIdMembro(int idMembro2){
        this.idMembro = idLivro;
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

    // public StatusEmprestimo getStatus() {
    //     return status;
    // }

    // public void setStatus(StatusEmprestimo status) {
    //     this.status = status;
    // }

    // public void finalizarEmprestimo() {
    //     livro.setLivroDisponivel(true);
    //     membro.adicionarEmprestimoAoHistorico(this);
    //     setStatus(StatusEmprestimo.RETORNADO);
    // }

}
