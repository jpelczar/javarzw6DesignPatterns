package factory.pizzapasta;

import java.util.ArrayList;
import java.util.List;

public class MargerithaPizza implements Pizza {

    private List<String> ingredients = new ArrayList<>();

    public MargerithaPizza() {
        ingredients.add("mozzarella");
    }

    @Override
    public String getName() {
        return "Margeritha";
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
