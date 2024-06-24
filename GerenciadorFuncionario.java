import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorFuncionario implements Gerenciador<Funcionario> {
    private List<Funcionario> funcionarios = new ArrayList<>();

    // public GerenciadorFuncionario() {
    // this.funcionarios = new ArrayList<>();
    // }

    @Override
    public void add(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // public void exibirInformacoes(int id) {
    // System.out.print("O nome do funcionário é: " + getNome());
    // System.out.print("O ID do funcionário é: " + getId());
    // System.out.print("O cargo do funcionário é: " + getfuncao());

    // }

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
}
