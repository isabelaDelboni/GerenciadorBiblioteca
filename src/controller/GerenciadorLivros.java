import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivros implements Gerenciador<Livro> {
    private List<Livro> livros;
    private Arquivo arquivo;

    public GerenciadorLivros() {
        arquivo = new Arquivo("C:/Users/Pichau/OneDrive/Documentos/GitHub/GerenciadorBiblioteca/src/data/livros.txt");
        this.livros = new ArrayList<>();
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
    }

    @Override
    public void update(Livro livro) {
        int index = livros.indexOf(livro);
        if (index != -1) {
            livros.set(index, livro);
        }
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

    public void escreverArquivo(){
        arquivo.escrever(livros);
    }

    public void lerArquivo(){
        livros = arquivo.ler();
    }
}
