import java.io.Serializable;

public class Livro implements Serializable{

    private String titulo;
    private String autor;
    private CategoriaLivro categoria;
    private int idLivro;
    private boolean livroDisponivel = true;

    public Livro(String titulo, String autor, CategoriaLivro categoria, int idLivro, boolean livroDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
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

    public CategoriaLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLivro categoria) {
        this.categoria = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return 
        "\nId: " + idLivro
        +"\nTitulo: " + titulo
        +"\nAutor: " + autor
        +"\nCategoria: " + categoria
        +"\n=================";
    }
}