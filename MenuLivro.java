import java.util.List;

public class MenuLivro {
    private Inputs inputs;
    private Livraria livraria;
    private CriadorDeIdUnico criadorDeIdUnico;

    public MenuLivro(Livraria livraria, Inputs inputs, CriadorDeIdUnico criadorDeIdUnico) {
        this.livraria = livraria;
        this.inputs = inputs;
        this.criadorDeIdUnico = criadorDeIdUnico;
    }

    public void displayMenuLivros() {
        int op;

        do {
            System.out.println("\n==== Gerenciar Livros ====");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Mostrar Livros");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            op = inputs.getIntInput();

            try {
                switch (op) {
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
        } while (op != 5);
    }

    private void adicionarLivro() {
        System.out.println("Digite o título do livro: ");
        String titulo = inputs.getStringInput();

        System.out.println("Digite o autor do livro: ");
        String autor = inputs.getStringInput();

        for (CategoriaLivro categoria : CategoriaLivro.values()) {
            System.out.println(categoria.ordinal() + 1 + ". " + categoria.getDescricao());
        }
        System.out.println("Digite a categoria do livro: ");
        int categoriaIndex = inputs.getIntInput() - 1;
        CategoriaLivro categoria = CategoriaLivro.values()[categoriaIndex];

        System.out.println("Digite o tipo de livro (1 - Físico, 2 - Ebook, 3 - Audiobook): ");
        int tipo = inputs.getIntInput();

        int idLivro = criadorDeIdUnico.gerarIdUnico();

        Livro livro = null;
        switch (tipo) {
            case 1:
                livro = new Livro(titulo, autor, categoria, idLivro, true);
                break;
            case 2:
                System.out.println("Digite o formato do ebook: ");
                String formato = inputs.getStringInput();
                livro = new Ebook(titulo, autor, categoria, idLivro, true, formato);
                break;
            case 3:
                System.out.println("Digite a duração do audiobook em minutos: ");
                int duracao = inputs.getIntInput();
                livro = new Audiobook(titulo, autor, categoria, idLivro, true, duracao);
                break;
            default:
                System.out.println("Tipo de livro inválido!");
                return;
        }

        livraria.getGerenciadorLivros().add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private void removerLivro() {
        System.out.println("Digite o ID do livro a ser removido: ");
        int idLivro = inputs.getIntInput();
        Livro livro = livraria.getGerenciadorLivros().buscaPorId(idLivro);
        if (livro != null) {
            livraria.getGerenciadorLivros().remove(livro);
            System.out.println("Livro removido com sucesso!");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    private void atualizarLivro() {
        System.out.println("Digite o ID do livro a ser atualizado: ");
        int idLivro = inputs.getIntInput();
        Livro livro = livraria.getGerenciadorLivros().buscaPorId(idLivro);
        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        System.out.println("Digite o novo título do livro: ");
        String titulo = inputs.getStringInput();
        livro.setTitulo(titulo);

        System.out.println("Digite o novo autor do livro: ");
        String autor = inputs.getStringInput();
        livro.setAutor(autor);

        System.out.println("Digite a nova categoria do livro: ");
        for (CategoriaLivro categoria : CategoriaLivro.values()) {
            System.out.println(categoria.ordinal() + 1 + ". " + categoria.getDescricao());
        }
        int categoriaIndex = inputs.getIntInput() - 1;
        CategoriaLivro categoria = CategoriaLivro.values()[categoriaIndex];
        livro.setCategoria(categoria);

        livraria.getGerenciadorLivros().update(livro);
        System.out.println("Livro atualizado com sucesso!");
    }

    private void mostrarLivros() {
        List<Livro> livros = livraria.getGerenciadorLivros().listar();
        for (Livro livro : livros) {
            System.out.println(livro);
            System.out.println("==============================");
        }
    }
}
