package classes;


public class Event {
    private int id;
    private int fotoEvento;
    private String evento;
    private String descricao;

    public Event(int id, int fotoEvento, String evento, String descricao) {
        this.id = id;
        this.fotoEvento = fotoEvento;
        this.evento = evento;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFotoEvento() {
        return fotoEvento;
    }

    public void setFotoEvento(int fotoEvento) {
        this.fotoEvento = fotoEvento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
