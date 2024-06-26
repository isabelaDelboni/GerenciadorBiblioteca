import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario implements Gerenciador<Funcionario> {
    private List<Funcionario> funcionarios;

    public GerenciadorFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void add(List<Funcionario> funcionarios, Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public void remove(List<Funcionario> funcionarios,Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    @Override
    public void update(List<Funcionario> funcionarios,Funcionario funcionario) {
        int index = funcionarios.indexOf(funcionario);
        if (index != -1) {
            funcionarios.set(index, funcionario);
        }
    }
<<<<<<< Updated upstream:GerenciadorFuncionario.java
=======

    @Override
    public List<Funcionario> listar() {
        System.out.println("===== Lista de Funcionarios ======");
        return funcionarios;
    }
>>>>>>> Stashed changes:src/controller/GerenciadorFuncionario.java
}
