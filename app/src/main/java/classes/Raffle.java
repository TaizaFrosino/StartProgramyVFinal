package classes;


public class Raffle {
    private int id;
    private int image, imageCircle;
    private boolean botao;
    private String description;

    public Raffle(int id, int image, int imageCircle, String description, boolean botao) {
        this.id = id;
        this.image = image;
        this.imageCircle = imageCircle;
        this.description = description;
        this.botao = botao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImageCircle() {
        return imageCircle;
    }

    public void setImageCircle(int imageCircle) {
        this.imageCircle = imageCircle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getBotao() {
        return botao;
    }

    public void setBotao(boolean botao) {
        this.botao = botao;
    }
}