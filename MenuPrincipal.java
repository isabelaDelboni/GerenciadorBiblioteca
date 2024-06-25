public class MenuPrincipal {
    private Inputs inputs;
    private MenuLivros menuLivros;

    public MenuPrincipal (){
        menuLivros = new MenuLivros();
        inputs = new Inputs();
    }

    public void displayMenuPrincipal(){
        int op;

        do {
            System.out.println("\n==== Biblioteca ====");
            System.out.println("1. Gerenciar Livros");
            System.out.println("2. Gerenciar Membros");
            System.out.println("3. Gerenciar Emprestimos");
            System.out.println("4. Gerenciar Funcionarios");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            op = inputs.getIntInput();

            switch (op) {
                case 1:
                MenuLivros menuLivros = new MenuLivros();
                menuLivros.displayMenuLivros();
                break;
            case 2:
                //MenuMembro menuMembro = new MenuMembro();
                //menuMembro.displayMenuMembro();
                break;
            case 3:
                MenuEmprestimo menuEmprestimo = new MenuEmprestimo();
                menuEmprestimo.displayMenuEmprestimo();
                break;
            case 4:
                System.out.println("Saindo...");
                break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } 
        while (op != 5);
    }
}