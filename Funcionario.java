public class Funcionario {

    private String nomeFuncionario;
    private int idFuncionario;
    private FuncaoFuncionario funcao;

    public Funcionario(String nomeFuncionario, int idFuncionario, FuncaoFuncionario funcao){
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
        this.funcao = funcao;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
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


}