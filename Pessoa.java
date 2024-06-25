public abstract class Pessoa {
    private String nome;
    private String id;

    CriadorDeIdUnico criador = new CriadorDeIdUnico();

    public Pessoa(String nome) {
        this.nome = nome;
        criador.gerarIdUnico();
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
}