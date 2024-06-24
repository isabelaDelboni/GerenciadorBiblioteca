import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String titulo;
    private String descricao;
    private LocalDate data;
    private List<Membro> participantes;

    public Evento(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.participantes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Membro> getParticipantes() {
        return participantes;
    }

    public void adicionarParticipante(Membro membro) {
        participantes.add(membro);
    }

    public void removerParticipante(Membro membro) {
        participantes.remove(membro);
    }

    /*
    Ainda não sei onde colocar, abaixo estão os métodos para manipular eventos (pensei em colocar ou em funcionários ou biblioteca)

    public void criarEvento(String titulo, String descricao, LocalDate data) {
        Evento evento = new Evento(titulo, descricao, data);
        eventos.add(evento);
    }

    public void adicionarParticipanteEvento(Evento evento, Membro membro) {
        evento.adicionarParticipante(membro);
    }

    public void removerParticipanteEvento(Evento evento, Membro membro) {
        evento.removerParticipante(membro);
    }

    public List<Evento> getEventos() {
        return eventos;
    }
    */
}