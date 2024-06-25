import java.util.List;
import java.util.Scanner;

public interface Gerenciador<T> {
    void add(Scanner leitor);
    void remove(Scanner leitor);
    void update(Scanner leitor);
    void listar(Scanner leitor);
}