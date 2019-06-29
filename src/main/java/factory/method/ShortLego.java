package factory.method;

public class ShortLego extends Lego {
    public ShortLego(String color) {
        super(color);
    }

    @Override
    public String getType() {
        return "Short lego";
    }
}
