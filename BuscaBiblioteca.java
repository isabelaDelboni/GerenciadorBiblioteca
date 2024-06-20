import java.util.ArrayList;
import java.util.List;

public class BuscaBiblioteca implements Busca {
    private List<Livro> livros;

    public BuscaBiblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public List<Livro> buscaPorNome(String nome) {
        List<Livro> resultados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().contains(nome)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    @Override
    public Livro buscaPorId(String id) {
        for (Livro livro : livros) {
            if (id.equals(livro.getIdLivro())) {
                return livro;
            }
        }
        return null;
    }
}
