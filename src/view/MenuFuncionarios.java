import java.util.List;

public class MenuFuncionarios {
    private Livraria livraria;
    private Inputs inputs;
    private CriadorDeIdUnico criadorDeIdUnico;

    public MenuFuncionarios(Livraria livraria, Inputs inputs, CriadorDeIdUnico criadorDeIdUnico) {
        this.livraria = livraria;
        this.inputs = inputs;
        this.criadorDeIdUnico = criadorDeIdUnico;
    }

    public void displayMenuFuncionarios() {
        int op;

        do {
            System.out.println("\n==== Gerenciar Funcionários ====");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            op = inputs.getIntInput();

            switch (op) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 4);
    }

    private void adicionarFuncionario() {
        System.out.println("\n==== Adicionar Funcionario ====");

        System.out.print("Nome do Funcionário: ");
        String nome = inputs.getStringInput();

        System.out.println("\nEscolha a função do funcionário: ");
        for (FuncaoFuncionario funcao : FuncaoFuncionario.values()) {
            System.out.println(funcao.ordinal() + 1 + ". " + funcao.getDescricao());
        }
        System.out.println("\nDigite: ");
        int escolhaFuncao = inputs.getIntInput();
        FuncaoFuncionario funcao = FuncaoFuncionario.values()[escolhaFuncao - 1];

        int idFuncionario = criadorDeIdUnico.gerarIdUnico();
        Funcionario funcionario = new Funcionario(nome, idFuncionario, funcao);
        livraria.getGerenciadorFuncionarios().add(funcionario);

        System.out.println("\nFuncionário adicionado com sucesso!");
    }

    private void removerFuncionario() {
        System.out.println("\n==== Remover Funcionario====");

        listarFuncionarios();

        System.out.print("ID do Funcionário: ");
        int idFuncionario = inputs.getIntInput();

        List<Funcionario> funcionarios = livraria.getGerenciadorFuncionarios().listar();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFuncionario() == idFuncionario) {
                livraria.getGerenciadorFuncionarios().remove(funcionario);
                System.out.println("Funcionário removido com sucesso!");
                return;
            }
        }

        System.out.println("Funcionário não encontrado!");
    }

    private void listarFuncionarios() {
        System.out.println(livraria.getGerenciadorFuncionarios().listar());
    }
}
