public class MenuRelatorios {
    private Livraria livraria;
    private Inputs inputs;
    private RelatorioLivros relatorioLivros;
    private RelatorioPessoas relatorioPessoas;

    public MenuRelatorios(Livraria livraria, Inputs inputs) {
        this.livraria = livraria;
        this.inputs = inputs;
        this.relatorioLivros = new RelatorioLivros();
        this.relatorioPessoas = new RelatorioPessoas();
    }

    public void displayMenuRelatorios() {
        int opcao;

        do {
            System.out.println("\n==== Menu de Relatórios ====");
            System.out.println("1. Relatório de Livros que Já Foram Emprestados");
            System.out.println("2. Relatório de Membros com Livros em Atraso");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = inputs.getIntInput();

            switch (opcao) {
                case 1:
                    relatorioLivros.gerarRelatorioLivrosEmprestados(livraria.getGerenciadorEmprestimos().listar());
                    break;
                case 2:
                    relatorioPessoas.membrosComLivrosAtrasados(livraria.getGerenciadorMembros().listar());
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }
}