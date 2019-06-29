package factory.pizzapasta;

public class TorinoFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {
        if ("margeritha".equals(name.toLowerCase())) {
            return new MargerithaPizza();
        } else if ("capriciosa".equals(name.toLowerCase())) {
            return new CapriciosaPizza();
        }

        System.out.println("Nie ma takiego produktu: " + name);
        return null;
    }

    @Override
    Pasta orderPasta(String name) {
        if ("mexican".equals(name.toLowerCase())) {
            return new MexicanPasta();
        } else if ("conpalo".equals(name.toLowerCase())) {
            return new ConPaloPasta();
        }

        System.out.println("Nie ma takiego produktu: " + name);
        return null;
    }
}
