import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorMembros implements Gerenciador<Membro>, Busca<Membro> {
    public List<Membro> membros;

    public GerenciadorMembros() {
        this.membros = new ArrayList<>();
    }


    @Override
    public void add(Scanner leitor) {
        
        System.out.println("Criando novo Membro da biblioteca:");
        System.out.print("> Nome: ");
        String n = leitor.nextLine();

        System.out.print("> Email: ");
        String e = leitor.nextLine();

        System.out.print("> Telefone: ");
        String t = leitor.nextLine();

        membros.add(new Membro(n, e, t, true));
    }

    @Override
    public void remove(Scanner leitor) {

        System.out.print("Qual o ID do membro que deseja excluir? ");
        int i = leitor.nextInt();

        membros.remove(leitor);

    }

    @Override
    public void update(Scanner leitor) {
        System.out.print("Qual o ID do membro que deseja atualizar as informações? ");
        int i = leitor.nextInt();

        System.out.print("Qual informação deseja atualizar? ");
        System.out.print("1 - Nome");
        System.out.print("2 - E-Mail");
        System.out.print("3 - Telefone");
        int escolha_alt = leitor.nextInt();

        switch (escolha_alt) {

            case 1:
                
            System.out.print("Digite o novo nome que deseja alterar. ");
            String n = leitor.nextLine();
            membros.get(i).setNome(n);

            case 2: 

            System.out.print("Digite o novo e-mail do membro que deseja alterar: ");
            String e = leitor.nextLine();
            membros.get(i).setEmail(e);

            case 3:

            System.out.print("Digite o novo telefone do membro que deseja alterar: ");
            String t = leitor.nextLine();
            membros.get(i).setTelefone(t);

            default:

            System.out.print("Opção inválida");
                break;

        }
        

    }

    @Override

    public void listar(Scanner leitor){

        for( int i = 0; i < membros.size(); i++){
            System.out.println("ID: " + membros.get(i).getId());
            System.out.println("Nome: " + membros.get(i).getNome());
            System.out.println("E-mail: " + membros.get(i).getEmail());
            System.out.println("Telefone: " + membros.get(i).getTelefone());
        }

    }


    @Override
    public void buscaPorNome(Scanner leitor) {
        System.out.print("Qual o nome da pessoa que deseja buscar? ");
        String n = leitor.nextLine();

        for(int i = 0; i < membros.size(); i++){
            if (membros.get(i).getNome().equalsIgnoreCase(n)){
                listar(leitor);  
            } else {
                System.out.print("Pessoa não encontrada.");
            }
        }    
    }


    @Override
    public boolean buscaPorId(int id) {
        boolean verificador;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o ID da pessoa que deseja pesquisar? ");
        int i = leitor.nextInt();

        for(int j = 1; j < membros.size(); j++){
            if (j == i){
                listar(leitor);
            } else {
                System.out.print("Pessoa não encontrada.");
            }
        }  
        return verificador = true;
    }

    }