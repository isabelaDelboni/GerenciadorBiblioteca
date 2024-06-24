import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Funcionario extends Pessoa {
    // private int idFuncionario;
    private String funcao;
    private static int count;

    List<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome, String funcao) {

        super(nome, count);
        /* this.idFuncionario = (count++); */
        this.funcao = funcao;

    }

    // public int getIdFuncionario() {
    // return idFuncionario;
    // }

    // public void setIdFuncionario(int idFuncionario) {
    // this.idFuncionario = idFuncionario;
    // }

    public String getfuncao() {
        return funcao;
    }

    public void setCargo(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void exibirFuncao() {
        System.out.println("Função: " + funcao);
    }

}