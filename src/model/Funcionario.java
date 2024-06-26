public class Funcionario extends Pessoa{
    private int idFuncionario;
    private FuncaoFuncionario funcao;

    public Funcionario(String nome, int idFuncionario, FuncaoFuncionario funcao){
        super(nome, idFuncionario);
        this.idFuncionario = idFuncionario;
        this.funcao = funcao;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public FuncaoFuncionario getfuncao() {
        return funcao;
    }

    public void setCargo(FuncaoFuncionario funcao) {
        this.funcao = funcao;
    }

    @Override
    public void exibirFuncao() {
        System.out.println("Função: " + funcao.getDescricao());
    }

    @Override
    public String toString() {
        return "ID: " + idFuncionario +
               ", Nome: " + getNome() +
               ", Função: " + funcao.getDescricao();
    }
}