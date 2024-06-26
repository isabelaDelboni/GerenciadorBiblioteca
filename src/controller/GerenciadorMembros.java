import java.util.ArrayList;
import java.util.List;

public class GerenciadorMembros implements Gerenciador<Membro> {
    private List<Membro> membros;
    private Arquivo arquivo;

    public GerenciadorMembros() {
        this.membros = new ArrayList<>();
        arquivo = new Arquivo("membros.txt");
        lerArquivo();
    }

    @Override
    public void add(Membro membro) {
        membros.add(membro);

        escreverArquivo();
    }

    @Override
    public void remove(Membro membro) {
        membros.remove(membro);

        escreverArquivo();
    }

    @Override
    public void update(Membro membro) {
        int index = membros.indexOf(membro);
        if (index != -1) {
            membros.set(index, membro);
        }
        escreverArquivo();
    }

    @Override
    public List<Membro> listar() {
        System.out.println("===== Lista de Membros ======");
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

    @Override
    public void escreverArquivo(){
        arquivo.escrever(membros);
    }

    @Override
    public void lerArquivo(){
        membros = arquivo.ler();
    }
}
