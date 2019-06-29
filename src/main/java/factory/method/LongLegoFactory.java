package factory.method;

public class LongLegoFactory implements LegoFactory {
    @Override
    public Lego createLego(String color) {
        return new LongLego(color);
    }
}
