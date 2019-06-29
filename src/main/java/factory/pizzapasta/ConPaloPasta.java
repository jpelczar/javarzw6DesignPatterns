package factory.pizzapasta;

public class ConPaloPasta implements Pasta {
    @Override
    public String getName() {
        return "ConPalo";
    }

    @Override
    public String getPastaType() {
        return "Spaghetti";
    }
}
