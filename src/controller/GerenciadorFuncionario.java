import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario implements Gerenciador<Funcionario> {
    private List<Funcionario> funcionarios;

    public GerenciadorFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void add(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public void remove(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    @Override
    public void update(Funcionario funcionario) {
        int index = funcionarios.indexOf(funcionario);
        if (index != -1) {
            funcionarios.set(index, funcionario);
        }
    }

    @Override
    public List<Funcionario> listar() {
        return funcionarios;
    }
}
