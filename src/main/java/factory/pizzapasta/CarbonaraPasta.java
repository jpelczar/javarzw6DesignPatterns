package factory.pizzapasta;

public class CarbonaraPasta implements Pasta {
    @Override
    public String getName() {
        return "Carbonara";
    }

    @Override
    public String getPastaType() {
        return "Penne";
    }
}
