import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AtualizarEmprestimo {
    private Livraria livraria;
    private Inputs inputs;

    public AtualizarEmprestimo(Livraria livraria, Inputs inputs) {
        this.livraria = livraria;
        this.inputs = inputs;
    }

    public void displayMenuAtualizarEmprestimo() {
        System.out.println("\n==== Atualizar Empréstimo ====");
        System.out.print("Digite o ID do empréstimo que deseja atualizar: ");
        int idEmprestimo = inputs.getIntInput();

        Emprestimo emprestimo = livraria.getGerenciadorEmprestimos().buscaPorId(idEmprestimo);
        if (emprestimo == null) {
            System.out.println("Empréstimo não encontrado!");
            return;
        }

        System.out.println("Empréstimo encontrado:");
        System.out.println(emprestimo);

        System.out.println("\nEscolha o que deseja atualizar:");
        System.out.println("1. Data de Devolução");
        System.out.println("2. Status");
        System.out.println("3. Voltar");
        int opcao = inputs.getIntInput();

        switch (opcao) {
            case 1:
                atualizarDataDevolucao(emprestimo);
                break;
            case 2:
                atualizarStatus(emprestimo);
                break;
            case 3:
                System.out.println("Voltando...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void atualizarDataDevolucao(Emprestimo emprestimo) {
        System.out.println("Digite a nova data de devolução (YYYY-MM-DD): ");
        String novaData = inputs.getStringInput();

        LocalDate novaDataDevolucao = converteStringParaData(novaData);
        if (novaDataDevolucao != null) {
            emprestimo.setDataFim(novaDataDevolucao);
            livraria.getGerenciadorEmprestimos().update(emprestimo);
            System.out.println("Data de devolução atualizada com sucesso!");
        }
    }

    private void atualizarStatus(Emprestimo emprestimo) {
        System.out.println("Digite o novo status (1 para ativo, 2 para retornado): ");
        int statusInput = inputs.getIntInput();

        StatusEmprestimo novoStatus;
        if (statusInput == 1) {
            novoStatus = StatusEmprestimo.EM_EMPRESTIMO;
        } else if (statusInput == 2) {
            novoStatus = StatusEmprestimo.RETORNADO;
        } else {
            System.out.println("Status inválido!");
            return;
        }

        emprestimo.setStatus(novoStatus);
        if (novoStatus == StatusEmprestimo.RETORNADO) {
            emprestimo.finalizarEmprestimo();
        }
        livraria.getGerenciadorEmprestimos().update(emprestimo);
        System.out.println("Status atualizado com sucesso!");
    }

    private LocalDate converteStringParaData(String dataStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(dataStr, formatter);
        } catch (Exception e) {
            System.out.println("Formato de data inválido!");
            return null;
        }
    }
}
