public class Funcionario {

    private String nomeFuncionario;
    private int idFuncionario;
    private String cargo;

    public Funcionario(String nomeFuncionario, int idFuncionario, String cargo){
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nomeFuncionario;
    }

    public void setNome(String nome) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}