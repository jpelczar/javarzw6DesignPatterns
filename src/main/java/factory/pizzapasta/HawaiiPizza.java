package factory.pizzapasta;

import java.util.ArrayList;
import java.util.List;

public class HawaiiPizza implements Pizza {

    private List<String> ingredients = new ArrayList<>();

    public HawaiiPizza() {
        ingredients.add("mozzarella");
        ingredients.add("chicken");
        ingredients.add("pineapple");
    }

    @Override
    public String getName() {
        return "Hawaii";
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
