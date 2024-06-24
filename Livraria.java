import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros;
    private List<Membro> membros;
    private List<Emprestimo> emprestimos;
    private List<Funcionario> funcionarios;

    private GerenciadorLivros gerenciadorLivros;
    private GerenciadorMembros gerenciadorMembros;
    private GerenciadorEmprestimo gerenciadorEmprestimos;
    private GerenciadorFuncionario gerenciadorFuncionarios;

    public Livraria() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();

        this.gerenciadorLivros = new GerenciadorLivros();
        this.gerenciadorMembros = new GerenciadorMembros();
        this.gerenciadorEmprestimos = new GerenciadorEmprestimo();
        this.gerenciadorFuncionarios = new GerenciadorFuncionario();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public GerenciadorLivros getGerenciadorLivros() {
        return gerenciadorLivros;
    }

    public GerenciadorMembros getGerenciadorMembros() {
        return gerenciadorMembros;
    }

    public GerenciadorEmprestimo getGerenciadorEmprestimos() {
        return gerenciadorEmprestimos;
    }

    public GerenciadorFuncionario getGerenciadorFuncionarios() {
        return gerenciadorFuncionarios;
    }
}
