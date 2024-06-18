public class Funcionario extends Person{
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

    public FuncaoFuncionario getfuncao() {
        return funcao;
    }

    public void setCargo(FuncaoFuncionario funcao) {
        this.funcao = funcao;
    }

    @Override
    public void exibirFuncao() {
        System.out.println("Função: " + funcao);
    }

}