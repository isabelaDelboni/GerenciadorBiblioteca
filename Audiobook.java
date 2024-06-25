public class Audiobook extends Livro {
    private int duracao;

    public Audiobook(String titulo, String autor, CategoriaLivro categoria, boolean livroDisponivel, int duracao) {
        super(titulo, autor, categoria, livroDisponivel);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
