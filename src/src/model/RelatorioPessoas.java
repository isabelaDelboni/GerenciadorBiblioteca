import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RelatorioPessoas {

    public void membrosComLivrosAtrasados(List<Membro> membros) {

        List<Membro> membrosComAtrasos = new ArrayList<>();

        LocalDate hoje = LocalDate.now();

        for (Membro membro : membros) {
            boolean temAtraso = false;
            for (Emprestimo emprestimo : membro.getHistoricoEmprestimos()) {
                LocalDate dataDevolucao = emprestimo.getDataFim();
                if (hoje.isAfter(dataDevolucao) && emprestimo.getStatus() != StatusEmprestimo.RETORNADO) {
                    membrosComAtrasos.add(membro);
                    temAtraso = true;
                    break;
                }
            }
        }

        if (!membrosComAtrasos.isEmpty()) {
            System.out.println("Membros com livros em atraso:");
            for (Membro membro : membrosComAtrasos) {
                System.out.println("Membro: " + membro.getNome() + " (ID: " + membro.getId() + ")");
                System.out.println("Email: " + membro.getEmail());
                System.out.println("Telefone: " + membro.getTelefone());
                System.out.println();
            }
        } else {
            System.out.println("Não há membros com livros em atraso.");
        }
    }

    public void imprimirQuantidadeMembros(List<Membro> membros) {
        int quantidadeMembros = membros.size();
        System.out.println("Quantidade de membros: " + quantidadeMembros);
    }

    public void imprimirQuantidadeFuncionarios(List<Funcionario> funcionarios) {
        int quantidadeFuncionarios = funcionarios.size();
        System.out.println("Quantidade de funcionários: " + quantidadeFuncionarios);
    }

}
