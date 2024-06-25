import java.util.List;
import java.util.Scanner;

public interface Busca<T> {
    void buscaPorNome(Scanner leitor);
    boolean buscaPorId(int leitor);
}
