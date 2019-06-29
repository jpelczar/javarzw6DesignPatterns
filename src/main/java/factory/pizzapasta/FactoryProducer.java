package factory.pizzapasta;

public class FactoryProducer {

    public AbstractFactory getFactory(String name) {
        if ("sicilian".equals(name.toLowerCase())) {
            return new SicilianFactory();
        } else if ("torino".equals(name.toLowerCase())) {
            return new TorinoFactory();
        }

        System.out.println("Missing factory: " + name);
        return null;
    }

}
