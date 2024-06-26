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

<<<<<<< Updated upstream:Funcionario.java
=======
    @Override
    public String toString() {
        return "Id: " + idFuncionario
        + super.toString()
        + "Funcao: " + funcao.getDescricao()
        +"\n=================";
    }
>>>>>>> Stashed changes:src/model/Funcionario.java
}