public abstract class Pessoa {
    private String nome;
    private int id;
    private static int count = 1;

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = (count++);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void exibirFuncao();
}
