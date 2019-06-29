package factory.method;

public abstract class Lego {

    private String color;

    abstract String getType();

    public Lego(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
