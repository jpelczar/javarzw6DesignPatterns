package factory.simple;

import java.math.BigDecimal;

public class MilkFactory {

    public static Milk createLaciate(float fat) {
        Milk milk = new Milk();
        milk.setFat(fat);
        milk.setManufacturer("Łaciate");
        milk.setPrice(new BigDecimal(12.50));
        milk.setTyp("UHT");

        return milk;
    }

}
