import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscaLivraria extends GerenciadorLivros implements Busca<Livro> {

    private List<Livro> livros;

    public BuscaLivraria() {
        this.livros = new ArrayList<>();
    }

    @Override
    public List<Livro> buscaPorNome(String nome) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(nome)) {
                livrosEncontrados.add(livro);
            }
        }

        if (livrosEncontrados.isEmpty()) {
            System.out.println("Livro não encontrado.");
        } else {
            System.out.println("Livro(s) encontrado(s):");
            for (Livro livro : livrosEncontrados) {
                System.out.println(livro);
            }
        }

        return livrosEncontrados;
    }

    @Override
    public Livro buscaPorId(String id) {
        try {
            int idInt = Integer.parseInt(id);
            for (Livro livro : livros) {
                if (livro.getIdLivro() == idInt) {
                    System.out.println("Livro encontrado:");
                    System.out.println(livro);
                    return livro;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("ID inválido. Por favor, insira um número.");
        }

        System.out.println("Livro não encontrado.");
        return null;
    }

    public void buscaPorNome(Scanner leitor) {
        System.out.print("Qual o título do livro que deseja buscar? ");
        String t = leitor.nextLine();
        buscaPorNome(t);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
}
