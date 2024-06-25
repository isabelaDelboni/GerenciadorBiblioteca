import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GerenciadorEmprestimo implements Gerenciador<Emprestimo>, Busca<Livro> {

    private List<Emprestimo> emprestimos;

    GerenciadorMembros gerenciadorMembros = new GerenciadorMembros(); 
    GerenciadorFuncionario gerenciadorFuncionario = new GerenciadorFuncionario();
    BuscaLivraria buscaLivraria = new BuscaLivraria();



    public GerenciadorEmprestimo(GerenciadorMembros gerenciadorMembros, GerenciadorLivros gerenciadorLivros) {
        this.emprestimos = new ArrayList<>();
        this.gerenciadorMembros = gerenciadorMembros;
        this.buscaLivraria = buscaLivraria;
    }
 

    @Override
    public void add(Scanner leitor) {
        System.out.println("Novo Empréstimo:");

        int novoId = emprestimos.size() + 1;

        System.out.print("> ID do membro: ");
        int idMembro = leitor.nextInt();

        gerenciadorMembros.buscaPorId(idMembro);

        System.out.print("> ID do livro: ");
        int idLivro = leitor.nextInt();

        boolean verificador = buscaLivraria.buscaPorId(idLivro);

        if (verificador == false) {
            System.out.println("Livro não encontrado. Empréstimo não cadastrado.");
            return;
        }

        System.out.println("Quantos dias de prazo para devolver? ");
        int prazoEmprestimo = leitor.nextInt();
        LocalDate dataFim = LocalDate.now().plusDays(prazoEmprestimo);

        Emprestimo emprestimo = new Emprestimo(idMembro, idLivro,  LocalDate.now(), dataFim);
        emprestimos.add(emprestimo);

        System.out.println("Empréstimo cadastrado com sucesso.");
    }


    @Override
    public void remove(Scanner leitor) {

        System.out.print("Qual o ID do empréstimo que deseja excluir? ");
        int i = leitor.nextInt();

        emprestimos.remove(leitor);

    }

    @Override
    public void update(Scanner leitor) {
        System.out.print("Qual o ID do empréstimo que deseja atualizar as informações? ");
        int i = leitor.nextInt();

        System.out.print("Qual informação deseja atualizar? ");
        System.out.print("1 - Id do Membro.");
        System.out.print("2 - Id do Livro.");
        System.out.print("3 - Prorrogar o prazo.");
        int escolha = leitor.nextInt();

        switch (escolha) {

            case 1:
                
            System.out.print("Digite o ID do membro que deseja alterar. ");
            int idMembro = leitor.nextInt();
            emprestimos.get(i).setIdMembro(idMembro);

            case 2: 

            System.out.print("Digite o ID do livro que deseja alterar. ");
            int idLivro = leitor.nextInt();
            emprestimos.get(i).setIdLivro(idLivro);

            case 3:

            System.out.print("Qual a quantidade de dias do novo prazo (A partir da data inicial) ");
            int prazoEmprestimo = leitor.nextInt();
            emprestimos.get(i).setDataFim(LocalDate.now().plusDays(prazoEmprestimo));

            default:

            System.out.print("Opção inválida");
                break;

        }
        

    }

    @Override

    public void listar(Scanner leitor){

        for( int i = 0; i < emprestimos.size(); i++){
            System.out.println("ID do empréstimo: " + emprestimos.get(i).getIdEmprestimo());
            System.out.println("ID do membro: " + emprestimos.get(i).getIdMembro());
            System.out.println("ID do livro: " + emprestimos.get(i).getIdLivro());
            System.out.println("Data de início: " + emprestimos.get(i).getDataInicio());
            System.out.println("Data de entrega: " + emprestimos.get(i).getDataFim());
        }

    }


    @Override
    public void buscaPorNome(Scanner leitor) {
        throw new UnsupportedOperationException("Unimplemented method 'buscaPorNome'");
    }


    @Override
    public boolean buscaPorId(int id) {
        boolean verificador;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o ID do empréstimo que deseja pesquisar? ");
        int i = leitor.nextInt();

        for(int j = 1; j < emprestimos.size(); j++){
            if (j == i){
                listar(leitor);  
            } else {
                System.out.print("Empréstimo não encontrado.");
            }
        }  
        return verificador = true;
    }


}




