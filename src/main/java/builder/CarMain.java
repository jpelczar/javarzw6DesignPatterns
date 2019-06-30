package builder;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CarMain {

    public static void main(String[] args)
            throws CloneNotSupportedException {
        List<String> leathe = new ArrayList<>();
        leathe.add("A");
        leathe.add("B");
        leathe.add("C");

        Car car = new Car.Builder()
                .setName("AAA")
                .setVMax(150)
                .setLeatherElements(leathe)
                .setProductionDate(LocalDate.now())
                .build();

        Car carCopy1 = car.clone();
        carCopy1.setName("BBBB");
        carCopy1.setProductionDate(LocalDate.of(1992, 3, 11));
        Car carCopy2 = car.clone();
        carCopy2.setvMax(90);
        carCopy2.getLeatherElements().add("DD");

        System.out.println();
    }
}
