import java.util.List;

public interface Gerenciador<T> {
    void add(T item);
    void remove(T item);
    void update(T item);
    List<T> listar();
    void lerArquivo();
    void escreverArquivo();
}