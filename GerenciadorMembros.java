import java.util.ArrayList;
import java.util.List;

public class GerenciadorMembros implements Gerenciador<Membro> {
    private List<Membro> membros;

    public GerenciadorMembros() {
        this.membros = new ArrayList<>();
    }

    @Override
    public void add(Membro membro) {
        membros.add(membro);
    }

    @Override
    public void remove(Membro membro) {
        membros.remove(membro);
    }

    @Override
    public void update(Membro membro) {
        int i = membros.indexOf(membro);
        if (i != -1) {
            membros.set(i, membro);
        }
    }

    public List<Membro> getMembros() {
        return membros;
    }
}
