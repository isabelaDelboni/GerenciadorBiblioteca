import java.util.ArrayList;
import java.util.List;

public class BuscaLivraria implements Busca<Livro> {
    @Override
    public List<Livro> buscaPorNome(List<Livro> livros, String nome) {
        List<Livro> resultados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().contains(nome)) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    @Override
    public Livro buscaPorId(List<Livro> livros, int id) {
        for (Livro livro : livros) {
            if (id == (livro.getIdLivro())) {
                return livro;
            }
        }
        return null;
    }
}
