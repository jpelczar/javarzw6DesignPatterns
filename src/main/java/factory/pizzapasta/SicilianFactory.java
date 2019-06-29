package factory.pizzapasta;

public class SicilianFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {
        if ("hawajska".equals(name.toLowerCase())) {
            return new HawaiiPizza();
        } else if ("capriciosa".equals(name.toLowerCase())) {
            return new CapriciosaPizza();
        }

        System.out.println("Nie ma takiego produktu: " + name);
        return null;
    }

    @Override
    Pasta orderPasta(String name) {
        if ("carbonara".equals(name.toLowerCase())) {
            return new CarbonaraPasta();
        } else if ("conpalo".equals(name.toLowerCase())) {
            return new ConPaloPasta();
        }

        System.out.println("Nie ma takiego produktu: " + name);
        return null;
    }
}
