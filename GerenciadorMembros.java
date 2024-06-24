import java.util.ArrayList;
import java.util.List;

public class GerenciadorMembros implements Gerenciador<Membro> {
    @Override
    public void add(List<Membro> membros, Membro membro) {
        membros.add(membro);
    }

    @Override
    public void remove(List<Membro> membros,Membro membro) {
        membros.remove(membro);
    }

    @Override
    public void update(List<Membro> membros, Membro membro) {
        int i = membros.indexOf(membro);
        if (i != -1) {
            membros.set(i, membro);
        }
    }
}