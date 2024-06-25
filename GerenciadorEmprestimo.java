import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmprestimo implements Gerenciador<Emprestimo> {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    @Override
    public void add(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    @Override
    public void remove(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }

    @Override
    public void update(Emprestimo emprestimo) {
        int index = emprestimos.indexOf(emprestimo);
        if (index != -1) {
            emprestimos.set(index, emprestimo);
        }
    }

    @Override
    public List<Emprestimo> listar() {
        return emprestimos;
    }

    public Emprestimo buscaPorId(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                return emprestimo;
            }
        }
        return null;
    }
}
