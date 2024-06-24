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

            try {
                switch(op){
                    case 1:
                        adicionarLivro();
                        break;
                    case 2:
                        removerLivro();
                        break;
                    case 3:
                        atualizarLivro();
                        break;
                    case 4:
                        mostrarLivros();
                        break;
                    case 5:
                        System.out.println("Voltando...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        } while(op != 5);
    }

    private void adicionarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = inputs.getStringInput();

        System.out.println("Digite o autor do livro:");
        String autor = inputs.getStringInput();

        System.out.println("Selecione a categoria do livro:");
        CategoriaLivro categoria = CategoriaLivro.values()[inputs.getIntInput() - 1];

        Livro novoLivro = new Livro(titulo, autor, categoria, CriadorDeIdUnico.gerarIdUnico(), true);

        livraria.getGerenciadorLivros().add(novoLivro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private void removerLivro() {
        System.out.println("Digite o ID do livro a ser removido:");
        int id = inputs.getIntInput();

        Livro livro = livraria.getGerenciadorLivros().buscaPorId(id);
        if (livro != null) {
            livraria.getGerenciadorLivros().remove(livro);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    private void atualizarLivro() {
        private void atualizarLivro() {
            System.out.println("Digite o ID do livro a ser atualizado:");
            int id = inputs.getIntInput();
        
            Livro livro = livraria.getGerenciadorLivros().buscaPorId(id);
            if (livro == null) {
                System.out.println("Livro não encontrado!");
                return;
            }
        
            System.out.println("Digite o novo título do livro:");
            String novoTitulo = inputs.getStringInput();
            livro.setTitulo(novoTitulo);
        
            System.out.println("Digite o novo autor do livro:");
            String novoAutor = inputs.getStringInput();
            livro.setAutor(novoAutor);
        
            System.out.println("Selecione a nova categoria do livro:");
            CategoriaLivro novaCategoria = CategoriaLivro.values()[inputs.getIntInput() - 1];
            livro.setCategoria(novaCategoria);
        
            livraria.getGerenciadorLivros().update(livro);
            System.out.println("Livro atualizado com sucesso!");
        }
        
    }

    private void mostrarLivros() {
        List<Livro> livros = livraria.getGerenciadorLivros().listar();
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor());
        }
    }
}