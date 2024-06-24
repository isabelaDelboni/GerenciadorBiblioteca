import java.util.List;

public interface Busca<T> {
    List<T> buscaPorNome(List<T> itens, String nome);
    T buscaPorId(List<T> itens, int id);
}
