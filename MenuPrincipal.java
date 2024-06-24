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
                    menuLivros.displayMenuLivros();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } 
        while (op != 5);
    }
}
