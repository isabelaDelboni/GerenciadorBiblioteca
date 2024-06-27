import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario implements Gerenciador<Funcionario> {
    private List<Funcionario> funcionarios;
    private Arquivo arquivo;

    public GerenciadorFuncionario() {
        this.funcionarios = new ArrayList<>();
        arquivo = new Arquivo("funcionarios.txt");
        lerArquivo();
    }

    @Override
    public void add(Funcionario funcionario) {
        funcionarios.add(funcionario);

        escreverArquivo();
    }

    @Override
    public void remove(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario)) {
            throw new IllegalArgumentException("Erro: Funcionario não encontrado na lista.");
        }
        escreverArquivo();
    }

    @Override
    public void update(Funcionario funcionario) {
        int index = funcionarios.indexOf(funcionario);
        
        if (index == -1) {
            throw new IllegalArgumentException("Erro: Funcionario não encontrado na lista.");
        }

        escreverArquivo();
    }

    @Override
    public List<Funcionario> listar() {
        System.out.println("===== Lista de Funcionarios ======");
        return funcionarios;
    }

    @Override
    public void escreverArquivo(){
        arquivo.escrever(funcionarios);
    }

    @Override
    public void lerArquivo(){
        if (arquivo.ler() != null) {
            funcionarios = arquivo.ler();
        }
    }
}