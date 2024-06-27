import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CriadorDeIdUnico {
    private Set<Integer> idsGerados;
    private Random random;

    public CriadorDeIdUnico() {
        idsGerados = new HashSet<>();
        random = new Random();
    }

    public int gerarIdUnico() {
        int id;
        do {
            id = random.nextInt(100001);
        } while (!idsGerados.add(id));

        return id;
    }
}
