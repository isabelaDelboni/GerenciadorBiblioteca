import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorFuncionario implements Gerenciador<Funcionario>, Busca<Funcionario> {
    public static List<Funcionario> funcionarios;

    public GerenciadorFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public void add(Scanner leitor) {

        System.out.println("Criando novo funcionário da biblioteca:");
        System.out.print("> Nome: ");
        String n = leitor.nextLine();

        System.out.println("Funções disponíveis:");
        for (FuncaoFuncionario funcao : FuncaoFuncionario.values()) {
            System.out.println(" - " + funcao.getDescricao());
        }
        
        System.out.print("> Função: ");
        String f = leitor.nextLine();

        try {

            FuncaoFuncionario funcaoSelecionada = FuncaoFuncionario.valueOf(f.toUpperCase());

            funcionarios.add(new Funcionario(n, funcaoSelecionada));
            System.out.println("Funcionário cadastrado com sucesso!");

        } catch (IllegalArgumentException x) {

            System.out.println("Função não encontrada. Funcionário não cadastrado.");

        }
    }



    @Override
    public void remove(Scanner leitor) {
        System.out.print("Qual o ID do membro que deseja excluir? ");
        int i = leitor.nextInt();

        funcionarios.remove(leitor);
    }

    @Override
    public void update(Scanner leitor) {
        System.out.print("Qual o ID do funcionário que deseja atualizar as informações? ");
        int i = leitor.nextInt();

        System.out.print("Qual informação deseja atualizar? ");
        System.out.print("1 - Nome");
        System.out.print("2 - Função");
        int escolha_alt = leitor.nextInt();

        switch (escolha_alt) {

            case 1:
                
            System.out.print("Digite o novo nome que deseja alterar. ");
            String n = leitor.nextLine();
            funcionarios.get(i).setNome(n);

            case 2: 

            System.out.println("Funções disponíveis:");
                for (FuncaoFuncionario funcao : FuncaoFuncionario.values()) {
                    System.out.println(" - " + funcao.getDescricao());
        }
        
            System.out.print("> Digite a função que deseja atualizar no funcionário: ");
            String f = leitor.nextLine();

        try {

            FuncaoFuncionario funcaoSelecionada = FuncaoFuncionario.valueOf(f.toUpperCase());

            funcionarios.get(i).setCargo(funcaoSelecionada);
            System.out.println("Funcionário atualizado com sucesso!");

        } catch (IllegalArgumentException x) {

            System.out.println("Função não encontrada. Funcionário não atualizado.");

        }
    
            default:

            System.out.print("Opção inválida");
                break;

        }
        

    }
    @Override

    public void listar(Scanner leitor){

        for( int i = 0; i < funcionarios.size(); i++){
            System.out.println("ID: " + funcionarios.get(i).getId());
            System.out.println("Nome: " + funcionarios.get(i).getNome());
            System.out.println("Função: " + funcionarios.get(i).getfuncao());
        }
    }


    @Override
    public void buscaPorNome(Scanner leitor) {
        System.out.print("Qual o nome da pessoa que deseja buscar? ");
        String n = leitor.nextLine();

        for(int i = 0; i < funcionarios.size(); i++){
            if (funcionarios.get(i).getNome().equalsIgnoreCase(n)){
                listar(leitor);
            } else {
                System.out.print("Pessoa não encontrada.");
            }
        }    
    }

    @Override
    public boolean buscaPorId(int leitor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscaPorId'");
    }


}

