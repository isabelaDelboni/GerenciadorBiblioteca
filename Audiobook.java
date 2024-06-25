public class Audiobook extends Livro {
    private int duracao;

    public Audiobook(String titulo, String autor, CategoriaLivro categoria, int idLivro, boolean livroDisponivel, int duracao) {
        super(titulo, autor, categoria, idLivro, livroDisponivel);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
