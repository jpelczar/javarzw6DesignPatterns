package factory.method;

public class ShortLegoFactory implements LegoFactory {
    @Override
    public Lego createLego(String color) {
        return new ShortLego(color);
    }
}
