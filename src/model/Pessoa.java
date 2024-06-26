import java.io.Serializable;

public abstract class Pessoa implements Serializable{
    private String nome;
    private String id;

    public Pessoa(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void exibirFuncao();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nNome: " + nome;
    }
}
