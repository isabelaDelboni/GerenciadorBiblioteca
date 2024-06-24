public class MenuLivros {
    private Inputs inputs;
    private Livraria livraria;

    public MenuLivros(){
        inputs = new Inputs();
        livraria = new Livraria();
    }

    public void displayMenuLivros(){
        int op;

        do {
            System.out.println("\n==== Gerenciar Livros ====");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Mostrar Livros");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opcao: ");
            op = inputs.getIntInput();

            switch (op) {
                case 1:
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = inputs.getStringInput();
                    
                    System.out.print("Digite o autor do livro: ");
                    String autor = inputs.getStringInput();

                    System.out.println("Escolha a categoria do livro:");
                    CategoriaLivro[] categorias = CategoriaLivro.values();
                    for (int i = 0; i < categorias.length; i++) {
                        System.out.println((i + 1) + ". " + categorias[i].getDescricao());
                    }
                    System.out.print("Digite o numero da categoria: ");
                    CategoriaLivro categoria = categorias[inputs.getIntInput() - 1];

                    int id = livraria.getLivros().size();
                    
                    Livro livro = new Livro(titulo, autor, categoria, id, true);

                    livraria.getGerenciadorLivros().add(livraria.getLivros(), livro);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println(livraria.getLivros());
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 5);
    }
}
