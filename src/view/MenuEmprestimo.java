import java.time.LocalDate;
import java.util.List;

public class MenuEmprestimo {
    private Livraria livraria;
    private Inputs inputs;
    private AtualizarEmprestimo atualizadorEmprestimo;

    public MenuEmprestimo(Livraria livraria, Inputs inputs) {
        this.livraria = livraria;
        this.inputs = inputs;
        this.atualizadorEmprestimo = new AtualizarEmprestimo(livraria, inputs);
    }

    public void displayMenuEmprestimos() {
        int op;

        do {
            System.out.println("\n==== Gerenciar Empréstimos ====");
            System.out.println("1. Registrar Empréstimo");
            System.out.println("2. Finalizar Empréstimo");
            System.out.println("3. Listar Empréstimos Ativos");
            System.out.println("4. Atualizar Empréstimos");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            op = inputs.getIntInput();

            
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
                    atualizadorEmprestimo.displayMenuAtualizarEmprestimo();
                    break;
                case 5:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (op != 5);
    }

    private void registrarEmprestimo() {
        System.out.println("\n==== Registrar Empréstimos ====");

        System.out.println(livraria.getGerenciadorMembros().listar());

        System.out.print("ID do Membro: ");
        int idMembro = inputs.getIntInput();
        Membro membro = livraria.getGerenciadorMembros().buscaPorId(idMembro);

        if (membro == null) {
            System.out.println("Membro não encontrado!");
            return;
        }

        System.out.println(livraria.getGerenciadorLivros().listar());

        System.out.print("\nID do Livro: ");
        int idLivro = inputs.getIntInput();
        Livro livro = livraria.getGerenciadorLivros().buscaPorId(idLivro);

        if (livro == null || !livro.isLivroDisponivel()) {
            System.out.println("Livro não encontrado ou não disponível!");
            return;
        }

        System.out.print("\nData de Início (YYYY-MM-DD): ");
        LocalDate dataInicio = LocalDate.parse(inputs.getStringInput());
        System.out.print("\nData de Fim (YYYY-MM-DD): ");
        LocalDate dataFim = LocalDate.parse(inputs.getStringInput());

        Emprestimo emprestimo = new Emprestimo(livro, membro, dataInicio, dataFim, StatusEmprestimo.EM_EMPRESTIMO);
        livraria.getGerenciadorEmprestimos().add(emprestimo);
        membro.adicionarEmprestimoAoHistorico(emprestimo);

        System.out.println("\nEmpréstimo registrado com sucesso!");
    }

    private void finalizarEmprestimo() {
        System.out.println("\n==== Finalizar Empréstimos ====");

        System.out.println(livraria.getGerenciadorLivros().listar());
        
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
        System.out.println("\n==== Lista de Empréstimos Ativos ====");

        System.out.println(livraria.getGerenciadorEmprestimos().listar());
    }
}
