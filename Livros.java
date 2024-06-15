public class Livros {

    private String Titulo;
    private String autor;
    private String categoriaLivro;
    private int idLivro;
    private boolean livroDisponivel = true;

    public Livros(String Titulo, String autor, String categoriaLivro, int idLivro, boolean livroDisponivel){
        this.Titulo = Titulo;
        this.autor = autor;
        this.categoriaLivro = categoriaLivro;
        this.idLivro = idLivro;
        this.livroDisponivel = livroDisponivel;
    }

    public String getNome() {
        return Titulo;
    }

    public void setNome(String Titulo) {
        this.Titulo= Titulo;
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

    public String getCategoriaLivro() {
        return categoriaLivro;
    }

    public void setCategoriaLivro(String categoria) {
        this.categoriaLivro = categoria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }







}