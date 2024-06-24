import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivros implements Gerenciador<Livro> {
    @Override
    public void add(List<Livro> livros, Livro livro) {
        livros.add(livro);
    }

    @Override
    public void remove(List<Livro> livros, Livro livro) {
        livros.remove(livro);
    }

    @Override
    public void update(List<Livro> livros, Livro livro) {
        int index = livros.indexOf(livro);
        if (index != -1) {
            livros.set(index, livro);
        }
    }

}
