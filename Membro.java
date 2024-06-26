import java.util.ArrayList;
import java.util.List;

public class Membro extends Pessoa {
    private String nome;
    private String idMembro;
    private String email;
    private String telefone;
    private boolean ativo;
    private List<Emprestimo> historicoEmprestimos;

    public Membro(String nome, String idMembro, String email, String telefone, boolean ativo) {
        super(nome, idMembro);
        this.nome = nome;
        this.idMembro = idMembro;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
        this.historicoEmprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdMembro() {
        return idMembro;
    }

    public void setIdMembro(String idMembro) {
        this.idMembro = idMembro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimoAoHistorico(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }

    @Override
    public void exibirFuncao() {
        System.out.println("Membro da biblioteca");
    }

<<<<<<< Updated upstream:Membro.java
}
=======
    @Override
    public String toString() {
        return "\nId: " + idMembro
        + super.toString()
        + "\nE-mail: " + email
        + "\nTelefone: " + telefone
        +"\n=================";
    }
}
>>>>>>> Stashed changes:src/model/Membro.java
