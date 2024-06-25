public class Funcionario extends Pessoa{
    private int idFuncionario;
    private FuncaoFuncionario funcao;

    CriadorDeIdUnico criador = new CriadorDeIdUnico();

    public Funcionario(String nome, FuncaoFuncionario funcao){
        super(nome);
        this.idFuncionario = criador.gerarIdUnico();
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

}