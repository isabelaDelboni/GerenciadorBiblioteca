import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private GerenciadorLivros gerenciadorLivros;
    private GerenciadorMembros gerenciadorMembros;
    private GerenciadorEmprestimo gerenciadorEmprestimos;
    private GerenciadorFuncionario gerenciadorFuncionarios;

    public Livraria() {
        this.gerenciadorLivros = new GerenciadorLivros();
        this.gerenciadorMembros = new GerenciadorMembros();
        this.gerenciadorEmprestimos = new GerenciadorEmprestimo();
        this.gerenciadorFuncionarios = new GerenciadorFuncionario();
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
