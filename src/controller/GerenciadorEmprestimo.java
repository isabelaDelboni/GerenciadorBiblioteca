import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmprestimo implements Gerenciador<Emprestimo> {
    private List<Emprestimo> emprestimos;
    private Arquivo arquivo;

    public GerenciadorEmprestimo (){
        this.emprestimos = new ArrayList<Emprestimo>();
        arquivo = new Arquivo("emprestimos.txt");
        lerArquivo();
    }

    @Override
    public void add(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        escreverArquivo();
    }

    @Override
    public void remove(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
        escreverArquivo();
    }

    @Override
    public void update(Emprestimo emprestimo) {
        int index = emprestimos.indexOf(emprestimo);
        if (index != -1) {
            emprestimos.set(index, emprestimo);
        }
        escreverArquivo();
    }

    @Override
    public List<Emprestimo> listar() {
        System.out.println("===== Lista de Emprestimos Ativos ======");

        for (int i = 0; i < emprestimos.size(); i++){
            if(emprestimos.get(i).getStatus() == StatusEmprestimo.EM_EMPRESTIMO){
                System.out.println(emprestimos.get(i));
            }
        }

        return null;
    }

    public Emprestimo buscaPorId(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getIdEmprestimo() == id) {
                return emprestimo;
            }
        }
        return null;
    }

    @Override
    public void escreverArquivo(){
        arquivo.escrever(emprestimos);
    }

    @Override
    public void lerArquivo(){
        if (arquivo.ler() != null) {
            emprestimos = arquivo.ler();
        }
    }
}