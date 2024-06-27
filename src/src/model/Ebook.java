public class Ebook extends Livro {
    private String formato;

    public Ebook(String titulo, String autor, CategoriaLivro categoria, int idLivro, boolean livroDisponivel, String formato) {
        super(titulo, autor, categoria, idLivro, livroDisponivel);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
