package factory.method;

public class LongLego extends Lego {
    public LongLego(String color) {
        super(color);
    }

    @Override
    public String getType() {
        return "Long lego";
    }
}
