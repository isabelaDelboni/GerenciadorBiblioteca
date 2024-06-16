public class Livros{

    private String titulo;
    private String autor;
    private Categoria categoriaLivro;
    private int idLivro;
    private boolean livroDisponivel = true;

    public Livros(String titulo, String autor, Categoria categoriaLivro, int idLivro, boolean livroDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoriaLivro = categoriaLivro;
        this.idLivro = idLivro;
        this.livroDisponivel = livroDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isLivroDisponivel() {
        return livroDisponivel;
    }

    public void setLivroDisponivel(boolean livroDisponivel) {
        this.livroDisponivel = livroDisponivel;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public Categoria getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(Categoria categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}