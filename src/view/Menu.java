public class Menu {
    private Livraria livraria;
    private Inputs inputs;
    private CriadorDeIdUnico criadorDeIdUnico;

    public Menu(Livraria livraria, Inputs inputs, CriadorDeIdUnico criadorDeIdUnico) {
        this.livraria = livraria;
        this.inputs = inputs;
        this.criadorDeIdUnico = criadorDeIdUnico;
    }

    public void exibirMenuPrincipal() {
        int opcao;

        do {
            System.out.println("\n==== Sistema de Biblioteca ====");
            System.out.println("1. Gerenciar Livros");
            System.out.println("2. Gerenciar Membros");
            System.out.println("3. Gerenciar Funcionários");
            System.out.println("4. Gerenciar Empréstimos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = inputs.getIntInput();

            switch (opcao) {
                case 1:
                MenuLivro menuLivros = new MenuLivro(livraria, inputs, criadorDeIdUnico);
                    menuLivros.displayMenuLivros();
                    break;
                case 2:
                    MenuMembro menuMembros = new MenuMembro(livraria, inputs, criadorDeIdUnico);
                    menuMembros.displayMenuMembros();
                    break;
                case 3:
                    MenuFuncionarios menuFuncionarios = new MenuFuncionarios(livraria, inputs, criadorDeIdUnico);
                    menuFuncionarios.displayMenuFuncionarios();
                    break;
                case 4:
                    MenuEmprestimo menuEmprestimos = new MenuEmprestimo(livraria, inputs);
                    menuEmprestimos.displayMenuEmprestimos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);
    }
}
