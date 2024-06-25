import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorLivros implements Gerenciador<Livro>, Busca<Livro> {
    private List<Livro> livros;

    public GerenciadorLivros() {
        this.livros = new ArrayList<>();
    }

    @Override
    public void add(Scanner leitor) {
        
        System.out.println("Criando novo Membro da biblioteca:");
        System.out.print("> Título do Livro: ");
        String t = leitor.nextLine();

        System.out.print("> Autor: ");
        String a = leitor.nextLine();

        System.out.println("Categorias disponíveis:");
        for (CategoriaLivro categoria : CategoriaLivro.values()) {
            System.out.println(" - " + categoria.getDescricao());
        }
        
        System.out.print("> Função: ");
        String c = leitor.nextLine();

        try {

            CategoriaLivro catselecionada = CategoriaLivro.valueOf(c.toUpperCase());

            livros.add(new Livro(t, a, catselecionada, true));
            System.out.println("Livro cadastrado com sucesso!");

        } catch (IllegalArgumentException x) {

            System.out.println("Categoria não encontrada. Livro não adicionado.");

        }
    }

        

    @Override
    public void remove(Scanner leitor) {
        System.out.print("Qual o ID do livro que deseja excluir? ");
        int i = leitor.nextInt();

        livros.remove(leitor);
    }



    @Override
    public void update(Scanner leitor) {
        System.out.print("Qual o ID do livro que deseja atualizar as informações? ");
        int i = leitor.nextInt();

        System.out.print("Qual informação deseja atualizar? ");
        System.out.print("1 - Título do Livro");
        System.out.print("2 - Autor");
        System.out.print("3 - Categoria");
        int escolha = leitor.nextInt();

        switch (escolha) {

            case 1:
                
            System.out.print("Digite o título que deseja alterar. ");
            String t = leitor.nextLine();
            livros.get(i).setTitulo(t);

            case 2: 

            System.out.print("Digite o nome do autor que deseja alterar: ");
            String a = leitor.nextLine();
            livros.get(i).setAutor(a);

            case 3:

            System.out.println("Categorias disponíveis:");
                for (CategoriaLivro categoria : CategoriaLivro.values()) {
                    System.out.println(" - " + categoria.getDescricao());
        }
        
            System.out.print("> Digite a categoria que deseja alterar no livro: ");
            String c = leitor.nextLine();

        try {

            CategoriaLivro catSelecionada = CategoriaLivro.valueOf(c.toUpperCase());

            livros.get(i).setCategoria(catSelecionada);
            System.out.println("Livro atualizado com sucesso!");

        } catch (IllegalArgumentException x) {

            System.out.println("Categoria não encontrada. Livro não atualizado.");

        }
    
            default:

            System.out.print("Opção inválida");
                break;

        }
        

    }

    @Override

    public void listar(Scanner leitor){

        for( int i = 0; i < livros.size(); i++){
            System.out.println("ID: " + livros.get(i).getIdLivro());
            System.out.println("Título: " + livros.get(i).getTitulo());
            System.out.println("Autor: " + livros.get(i).getAutor());
            System.out.println("Categoria: " + livros.get(i).getCategoria());
        }

    }

    @Override
    public void buscaPorNome(Scanner leitor) {
        System.out.print("Qual o título do livro que deseja buscar? ");
        String t = leitor.nextLine();

        for(int i = 0; i < livros.size(); i++){
            if (livros.get(i).getTitulo().equalsIgnoreCase(t)){
                listar(leitor);  
            } else {
                System.out.print("Livro não encontrada.");
            }
        }    
    }


    @Override
    public boolean buscaPorId(int id) {
        boolean verificador;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o ID do livro que deseja pesquisar? ");
        int i = leitor.nextInt();

        for(int j = 1; j < livros.size(); j++){
            if (j == i){
                listar(leitor);
            } else {
                System.out.print("Livro não encontrado.");
            }
        }  

        return verificador = true;
    }

}

