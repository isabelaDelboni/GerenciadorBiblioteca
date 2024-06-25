import java.util.Scanner;

public class MenuLivro {
    private Inputs inputs;
    private Livraria livraria;

    public MenuLivro(){
        inputs = new Inputs();
        livraria = new Livraria();
    }

    GerenciadorLivros gerenciadorLivros = new GerenciadorLivros();
    BuscaLivraria buscaLivraria = new BuscaLivraria();

    Scanner leitor = new Scanner(System.in);

    public void displayMenuLivros(){
        int op;

        do {
            System.out.println("\n==== Gerenciar Livros ====");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Atualizar Livro");
            System.out.println("4. Consultar Livro");
            System.out.println("5. Mostrar todos os Livros");
            System.out.println("6. Voltar");
            System.out.print("Escolha uma opcao: ");
            op = inputs.getIntInput();

            try {
                switch(op){
                    case 1:
                        gerenciadorLivros.add(leitor);
                        break;
                    case 2:
                        gerenciadorLivros.remove(leitor);
                        break;
                    case 3:
                        gerenciadorLivros.update(leitor);
                        break;
                    case 4:
                        gerenciadorLivros.listar(leitor);
                        break;
                    case 5:
                        System.out.print("Insira a opção que deseja fazer a consulta:");
                        System.out.println("1 - Por ID.");
                        System.out.println("2 - Por título.");
                        int i = leitor.nextInt();

                        if(i == 1){
                            buscaLivraria.buscaPorId(i);
                        }

                        break;
                    case 6:
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

    
}