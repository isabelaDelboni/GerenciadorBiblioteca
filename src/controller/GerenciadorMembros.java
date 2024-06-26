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
        int index = membros.indexOf(membro);
        if (index != -1) {
            membros.set(index, membro);
        }
    }

    @Override
    public List<Membro> listar() {
        return membros;
    }

    public Membro buscaPorId(int id) {
        for (Membro membro : membros) {
            if (membro.getId() == id) {
                return membro;
            }
        }
        return null;
    }
}
