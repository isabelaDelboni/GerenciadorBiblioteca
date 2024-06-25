import java.util.List;

public interface Busca<T> {
    List<T> buscaPorNome(String nome);
    T buscaPorId(String id);
}
