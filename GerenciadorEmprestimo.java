import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmprestimo implements Gerenciador<Emprestimo>{
    @Override
    public void add(List<Emprestimo> emprestimos, Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    @Override
    public void remove(List<Emprestimo> emprestimos, Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }

    @Override
    public void update(List<Emprestimo> emprestimos, Emprestimo emprestimo) {
        int index = emprestimos.indexOf(emprestimo);
        if (index != -1) {
            emprestimos.set(index, emprestimo);
        }
    }

    // @Override
    // public void show(List<Emprestimo> emprestimos){
        
    // }
}
