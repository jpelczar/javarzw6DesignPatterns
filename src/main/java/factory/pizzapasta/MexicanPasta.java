package factory.pizzapasta;

public class MexicanPasta implements Pasta {
    @Override
    public String getName() {
        return "Mexican";
    }

    @Override
    public String getPastaType() {
        return "Penne";
    }
}
