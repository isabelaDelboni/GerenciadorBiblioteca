import java.util.ArrayList;
import java.util.List;

public class Membro extends Pessoa {
    private String nome;
    private int idMembro;
    private String email;
    private String telefone;
    private boolean ativo;
    private List<Emprestimo> historicoEmprestimos;

    CriadorDeIdUnico criador = new CriadorDeIdUnico();


    public Membro(String nome, String email, String telefone, boolean ativo) {
        super(nome);
        this.nome = nome;
        this.idMembro = criador.gerarIdUnico();
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

    public int getIdMembro() {
        return idMembro;
    }

    public void setIdMembro(int idMembro) {
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
        System.out.println("Função: Membro da biblioteca");
    }

}