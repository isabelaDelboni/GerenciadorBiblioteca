import java.util.List;

public interface Gerenciador<T> {
    void add(List<T> itens, T item);
    void remove(List<T> itens,T item);
    void update(List<T> itens,T item);
    // void show(List<T> itens);
}
