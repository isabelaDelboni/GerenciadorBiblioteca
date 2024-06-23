import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Hello World!");

        Scanner leitor = new Scanner(System.in);
        boolean verificador = true;

        while (verificador) {

            System.out.print("Bem vindo a Biblioteca!");
            System.out.println("Escolha a operação que deseja realizar com o número da opção do menu.");
            System.out.println("1. Cadastrar funcionário.");
            System.out.println("2. Cadastrar cliente da biblioteca");/* Possivelmente cadastrar um cliente e um */
            System.out.println("3. Cadastrar empréstimo.");
            System.out.println("4. Consultar cadastro de cliente.");
            System.out.println("5. Consultar cadastro de funcionário.");
            System.out.println("6. Consultar livro.");
            System.out.println("7. Relatório de empréstimos.");
            System.out.println("8. Relatório de membros.");
            System.out.println("9. Relatório de funcionários.");
            int escolha = Integer.parseInt(leitor.nextLine());

            if (escolha == 1) {

                System.out.print("Qual o nome do funcionário?");
                String nome = leitor.nextLine();

                System.out.print("Qual o cargo do funcionário?");
                String cargo = leitor.nextLine();

                Funcionario funcionarios = new Funcionario(nome, cargo);

                funcionarios.exibirInformacoes(1);
            }

        }

    }
}