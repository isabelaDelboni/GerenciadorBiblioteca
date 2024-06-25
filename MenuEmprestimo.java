import java.time.LocalDate;
import java.util.List;

public class MenuEmprestimo {
    private Inputs inputs;
    private Livraria livraria;

    public MenuEmprestimo(Livraria livraria, Inputs inputs) {
        this.inputs = inputs;
        this.livraria = livraria;
    }

    public void displayMenuEmprestimos() {
        int op;

        do {
            System.out.println("\n==== Gerenciar Empréstimos ====");
            System.out.println("1. Registrar Empréstimo");
            System.out.println("2. Finalizar Empréstimo");
            System.out.println("3. Listar Empréstimos Ativos");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            op = inputs.getIntInput();

            try {
                switch (op) {
                    case 1:
                        registrarEmprestimo();
                        break;
                    case 2:
                        finalizarEmprestimo();
                        break;
                    case 3:
                        listarEmprestimosAtivos();
                        break;
                    case 4:
                        System.out.println("Voltando...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (op != 4);
    }

    private void registrarEmprestimo() {
        System.out.print("ID do Membro: ");
        String idMembro = inputs.getStringInput();
        Membro membro = livraria.getGerenciadorMembros().buscaPorId(idMembro);

        if (membro == null) {
            System.out.println("Membro não encontrado!");
            return;
        }

        System.out.print("ID do Livro: ");
        int idLivro = inputs.getIntInput();
        Livro livro = livraria.getGerenciadorLivros().buscaPorId(idLivro);

        if (livro == null || !livro.isLivroDisponivel()) {
            System.out.println("Livro não encontrado ou não disponível!");
            return;
        }

        System.out.print("Data de Início (YYYY-MM-DD): ");
        LocalDate dataInicio = LocalDate.parse(inputs.getStringInput());
        System.out.print("Data de Fim (YYYY-MM-DD): ");
        LocalDate dataFim = LocalDate.parse(inputs.getStringInput());

        Emprestimo emprestimo = new Emprestimo(livro, membro, dataInicio, dataFim, StatusEmprestimo.EM_EMPRESTIMO);
        livraria.getGerenciadorEmprestimos().add(emprestimo);
        membro.adicionarEmprestimo(emprestimo);

        System.out.println("Empréstimo registrado com sucesso!");
    }

    private void finalizarEmprestimo() {
        System.out.print("ID do Livro: ");
        int idLivro = inputs.getIntInput();
        Livro livro = livraria.getGerenciadorLivros().buscaPorId(idLivro);

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        List<Emprestimo> emprestimos = livraria.getGerenciadorEmprestimos().listar();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getIdLivro() == idLivro && emprestimo.getStatus() == StatusEmprestimo.EM_EMPRESTIMO) {
                emprestimo.finalizarEmprestimo();
                System.out.println("Empréstimo finalizado com sucesso!");
                return;
            }
        }

        System.out.println("Empréstimo não encontrado!");
    }

    private void listarEmprestimosAtivos() {
        List<Emprestimo> emprestimos = livraria.getGerenciadorEmprestimos().listar();
        System.out.println("Empréstimos Ativos:");
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getStatus() == StatusEmprestimo.EM_EMPRESTIMO) {
                System.out.println(emprestimo);
            }
        }
    }
}
