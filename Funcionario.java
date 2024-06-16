public class Funcionario {

    private String nomeFuncionario;
    private int idFuncionario;
    private String cargo;

    public Funcionario(String nomeFuncionario, int idFuncionario, String cargo){
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}