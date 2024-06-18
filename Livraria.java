import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros;
    private List<Membro> mebros;
    private List<Emprestimo> emprestimos;
    private List<Funcionario> funcionarios;

    public Livraria() {
        this.livros = new ArrayList<>();
        this.mebros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Membro> getMebros() {
        return mebros;
    }

    public void setMebros(List<Membro> mebros) {
        this.mebros = mebros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }


}
