import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RelatorioLivros {

    public void gerarRelatorioAtrasos(List<Emprestimo> emprestimos) {
        List<Emprestimo> emprestimosAtrasados = new ArrayList<>();

        LocalDate hoje = LocalDate.now();

        for (Emprestimo emprestimo : emprestimos) {
            LocalDate dataDevolucao = emprestimo.getDataFim();
            if (hoje.isAfter(dataDevolucao) && emprestimo.getStatus() != StatusEmprestimo.RETORNADO) {
                emprestimosAtrasados.add(emprestimo);
            }
        }

        if (emprestimosAtrasados.isEmpty()) {
            System.out.println("Não há livros atrasados para devolução.");
        } else {
            System.out.println("Livros atrasados para devolução:");
            for (Emprestimo emprestimo : emprestimosAtrasados) {
                System.out.println("- " + emprestimo.getLivro().getTitulo() + " (" + emprestimo.getLivro().getAutor() + ")");
            }
        }
    }

    public void buscarLivrosEmEmprestimo(List<Emprestimo> emprestimos) {
        List<Emprestimo> emprestimosEmAndamento = new ArrayList<>();

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getStatus() == StatusEmprestimo.EM_EMPRESTIMO) {
                emprestimosEmAndamento.add(emprestimo);
            }
        }

        if (emprestimosEmAndamento.isEmpty()) {
            System.out.println("Não há livros em empréstimo no momento.");
        } else {
            System.out.println("Livros em empréstimo:");
            for (Emprestimo emprestimo : emprestimosEmAndamento) {
                System.out.println("- " + emprestimo.getLivro().getTitulo() + " (" + emprestimo.getLivro().getAutor() + ")");
            }
        }
    }

    public void imprimirQuantidadeLivros(List<Livro> livros) {
        int quantidadeLivros = livros.size();
        System.out.println("Quantidade de livros: " + quantidadeLivros);
    }

}