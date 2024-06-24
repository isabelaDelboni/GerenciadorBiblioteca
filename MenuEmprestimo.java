import java.time.LocalDate;
import java.util.List;

public class MenuEmprestimo {
    private Inputs inputs;
    private Livraria livraria;

    public MenuEmprestimo() {
        inputs = new Inputs();
        livraria = new Livraria();
    }

    public void displayMenuEmprestimo() {
        int op;

        do {
            System.out.println("\n==== Gerenciar Empréstimos ====");
            System.out.println("1. Realizar Empréstimo");
            System.out.println("2. Finalizar Empréstimo");
            System.out.println("3. Mostrar Empréstimos");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            op = inputs.getIntInput();

            try {
                switch (op) {
                    case 1:
                        realizarEmprestimo();
                        break;
                    case 2:
                        finalizarEmprestimo();
                        break;
                    case 3:
                        mostrarEmprestimos();
                        break;
                    case 4:
                        System.out.println("Voltando...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        } while (op != 4);
    }

    private void realizarEmprestimo() {
        System.out.println("Digite o ID do livro:");
        int idLivro = inputs.getIntInput();
        Livro livro = livraria.getGerenciadorLivros().buscaPorId(idLivro);
        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        System.out.println("Digite o ID do membro:");
        String idMembro = inputs.getStringInput();
        Membro membro = livraria.getGerenciadorMembros().buscaPorId(idMembro);
        if (membro == null) {
            System.out.println("Membro não encontrado!");
            return;
        }

        if (!livro.isLivroDisponivel()) {
            System.out.println("Livro não disponível para empréstimo!");
            return;
        }

        Emprestimo emprestimo = new Emprestimo(livro, membro, LocalDate.now(), LocalDate.now().plusDays(14), StatusEmprestimo.EM_ANDAMENTO);
        livraria.getGerenciadorEmprestimos().add(emprestimo);
        livro.setLivroDisponivel(false);

        System.out.println("Empréstimo realizado com sucesso!");
    }

    private void finalizarEmprestimo() {
        System.out.println("Digite o ID do empréstimo a ser finalizado:");
        int idEmprestimo = inputs.getIntInput();

        Emprestimo emprestimo = buscarEmprestimoPorId(idEmprestimo);
        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado!");
            return;
        }

        emprestimo.finalizarEmprestimo();
        livraria.getGerenciadorEmprestimos().update(emprestimo);

        System.out.println("Empréstimo finalizado com sucesso!");
    }

    private Emprestimo buscarEmprestimoPorId(int idEmprestimo) {
        List<Emprestimo> emprestimos = livraria.getGerenciadorEmprestimos().listar();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getIdLivro() == idEmprestimo) {
                return emprestimo;
            }
        }
        return null;
    }

    private void mostrarEmprestimos() {
        List<Emprestimo> emprestimos = livraria.getGerenciadorEmprestimos().listar();
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
            System.out.println("Membro: " + emprestimo.getMembro().getNome());
            System.out.println("Status: " + emprestimo.getStatus().getDescricao());
            System.out.println("==============================");
        }
    }
}
