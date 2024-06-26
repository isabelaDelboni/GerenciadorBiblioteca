import java.util.ArrayList;
import java.util.List;

public class HistoricoEmprestimos {
    private List<Emprestimo> emprestimos;

    public HistoricoEmprestimos() {
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
