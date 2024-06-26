import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivros implements Gerenciador<Livro> {
    private List<Livro> livros;
    private Arquivo arquivo;

    public GerenciadorLivros() {
        this.livros = new ArrayList<>();
        arquivo = new Arquivo("livros.txt");
        lerArquivo();
    }

    @Override
    public void add(Livro livro) {
        livros.add(livro);
        escreverArquivo();
    }

    @Override
    public void remove(Livro livro) {
        livros.remove(livro);
        escreverArquivo();
    }

    @Override
    public void update(Livro livro) {
        int index = livros.indexOf(livro);

        if (index != -1) {
            livros.set(index, livro);
        }

        escreverArquivo();
    }

    @Override
    public List<Livro> listar() {
        System.out.println("===== Lista de Livros ======");
        return livros;
    }

    public Livro buscaPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getIdLivro() == id) {
                return livro;
            }
        }
        return null;
    }

    @Override
    public void escreverArquivo(){
        arquivo.escrever(livros);
    }

    @Override
    public void lerArquivo(){
        if (arquivo.ler() != null) {
            livros = arquivo.ler();
        }
    }
}