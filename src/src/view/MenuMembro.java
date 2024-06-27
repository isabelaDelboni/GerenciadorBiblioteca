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
            System.out.println("4. Atualizar Membros");
            System.out.println("5. Voltar");
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
                    atualizarMembro();
                    break;
                case 5:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 5);
    }

    private void adicionarMembro() {
        System.out.println("\n====Adicionar Membro====");

        System.out.print("Nome do Membro: ");
        String nome = inputs.getStringInput();

        int idMembro = criadorDeIdUnico.gerarIdUnico();

        System.out.print("\nE-mail do Membro: ");
        String email = inputs.getStringInput();

        System.out.print("\nTelefone do Membro: ");
        String telefone = inputs.getStringInput();

        Membro membro = new Membro(nome, idMembro, email, telefone, true);

        livraria.getGerenciadorMembros().add(membro);

        System.out.println("Membro adicionado com sucesso!");
    }

    private void removerMembro() {
        System.out.println("\n====Remover Membro====");

        listarMembros();
        
        System.out.print("ID do Membro: ");
        int idMembro = inputs.getIntInput();

        Membro membro = livraria.getGerenciadorMembros().buscaPorId(idMembro);

        if (membro != null) {
            livraria.getGerenciadorMembros().remove(membro);

            System.out.println("Membro removido com sucesso!");
        }
        else {
            System.out.println("Membro não encontrado!");
        }
    }
    
    private void atualizarMembro (){
        System.out.println("\n====Atualizar Membro====");
        
        listarMembros();

        System.out.print("Digite o ID do membro a ser atualizado: ");
        int idMembro = inputs.getIntInput();
        Membro membro = livraria.getGerenciadorMembros().buscaPorId(idMembro);

        if (membro == null) {
            System.out.println("Membro não encontra0do!");
            return;
        }

        System.out.print("\nDigite o novo nome do membro:");
        String nome = inputs.getStringInput();
        membro.setNome(nome);

        System.out.print("\nDigite o novo e-mail do membro:");
        String email = inputs.getStringInput();
        membro.setEmail(email);

        System.out.print("\nDigite o novo telefone do membro:");
        String telefone = inputs.getStringInput();
        membro.setEmail(telefone);

        livraria.getGerenciadorMembros().update(membro);

        System.out.println("Membro atualizado com sucesso!");
    }

    private void listarMembros() {
        System.out.println(livraria.getGerenciadorMembros().listar());
    }
}