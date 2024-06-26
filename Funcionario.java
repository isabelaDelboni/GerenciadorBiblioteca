public class Funcionario extends Pessoa{
    private String idFuncionario;
    private FuncaoFuncionario funcao;

    public Funcionario(String nome, String idFuncionario, FuncaoFuncionario funcao){
        super(nome, idFuncionario);
        this.idFuncionario = idFuncionario;
        this.funcao = funcao;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public FuncaoFuncionario getFuncao() {
        return funcao;
    }

    public void setFuncao(FuncaoFuncionario funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Id: " + idFuncionario
        + super.toString()
        + "Funcao: " + funcao.getDescricao(); 
    }

}