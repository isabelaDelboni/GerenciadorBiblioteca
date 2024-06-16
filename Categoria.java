public class Categoria {
    private String nomeCategoria;
    private String descricao;

    public Categoria(String nomeCategoria, String descricao) {
        this.nomeCategoria = nomeCategoria;
        this.descricao = descricao;
    }

    public String getnomeCategoria() {
        return nomeCategoria;
    }

    public void setNome(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
