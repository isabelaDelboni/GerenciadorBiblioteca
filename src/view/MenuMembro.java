public class MenuMembro {
    private Livraria livraria;
    private Inputs inputs;
    private CriadorDeIdUnico criadorDeIdUnico;

    public MenuMembro(Livraria livraria, Inputs inputs, CriadorDeIdUnico criadorDeIdUnico) {
        this.livraria = livraria;
        this.inputs = inputs;
        this.criadorDeIdUnico = criadorDeIdUnico;
    }

    public void displayMenuMembros() {
        int op;

        do {
            System.out.println("\n==== Gerenciar Membros ====");
            System.out.println("1. Adicionar Membro");
            System.out.println("2. Remover Membro");
            System.out.println("3. Listar Membros");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            op = inputs.getIntInput();

            switch (op) {
                case 1:
                    adicionarMembro();
                    break;
                case 2:
                    removerMembro();
                    break;
                case 3:
                    listarMembros();
                    break;
                case 4:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 4);
    }

    private void adicionarMembro() {
        System.out.print("Nome do Membro: ");
        String nome = inputs.getStringInput();
        String idMembro = String.valueOf(criadorDeIdUnico.gerarIdUnico());
        Membro membro = new Membro(nome, idMembro, "", "", true); 
        livraria.getGerenciadorMembros().add(membro);
        System.out.println("Membro adicionado com sucesso!");
    }

    private void removerMembro() {
        System.out.print("ID do Membro: ");
        String idMembro = inputs.getStringInput();
        Membro membro = livraria.getGerenciadorMembros().buscaPorId(idMembro);

        if (membro != null) {
            livraria.getGerenciadorMembros().remove(membro);
            System.out.println("Membro removido com sucesso!");
        } else {
            System.out.println("Membro não encontrado!");
        }
    }

    private void listarMembros() {
        System.out.println("Membros:");
        for (Membro membro : livraria.getGerenciadorMembros().listar()) {
            System.out.println(membro);
        }
    }
}
