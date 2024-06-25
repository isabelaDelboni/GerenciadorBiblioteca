import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivros implements Gerenciador<Livro> {
    private List<Livro> livros;

    public GerenciadorLivros() {
        this.livros = new ArrayList<>();
    }

    @Override
    public void add(Livro livro) {
        livros.add(livro);
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

}
