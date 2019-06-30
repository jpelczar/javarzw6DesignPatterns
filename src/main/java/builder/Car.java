package builder;

import java.time.LocalDate;
import java.util.List;

public class Car {

    private String name;
    private Integer vMax;
    private LocalDate productionDate;
    private List<String> leatherElements;
    private String navigationProvider;
    private Float bluetoothVersion;

    public static class Builder {
        private String name;
        private Integer vMax;
        private LocalDate productionDate;
        private List<String> leatherElements;
        private String navigationProvider;
        private Float bluetoothVersion;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setVMax(Integer vMax) {
            this.vMax = vMax;
            return this;
        }

        public Builder setLeatherElements(List<String> elements) {
            this.leatherElements = elements;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.name = name;
            car.vMax = vMax;
            car.leatherElements = leatherElements;
            //...

            return car;
        }
    }
}
