package factory.pizzapasta;

import java.util.ArrayList;
import java.util.List;

public class CapriciosaPizza implements Pizza {

    private List<String> ingredients = new ArrayList<>();

    public CapriciosaPizza() {
        ingredients.add("salami");
        ingredients.add("mozzarella");
    }

    @Override
    public String getName() {
        return "Capriciosa";
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
