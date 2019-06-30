package builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {

    private String name;
    private Integer vMax;
    private LocalDate productionDate;
    private List<String> leatherElements;
    private String navigationProvider;
    private Float bluetoothVersion;

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.setLeatherElements(
                new ArrayList<>(car.getLeatherElements()));


        return car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getvMax() {
        return vMax;
    }

    public void setvMax(Integer vMax) {
        this.vMax = vMax;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public List<String> getLeatherElements() {
        return leatherElements;
    }

    public void setLeatherElements(List<String> leatherElements) {
        this.leatherElements = leatherElements;
    }

    public String getNavigationProvider() {
        return navigationProvider;
    }

    public void setNavigationProvider(String navigationProvider) {
        this.navigationProvider = navigationProvider;
    }

    public Float getBluetoothVersion() {
        return bluetoothVersion;
    }

    public void setBluetoothVersion(Float bluetoothVersion) {
        this.bluetoothVersion = bluetoothVersion;
    }

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

        public Builder setProductionDate(LocalDate localDate) {
            this.productionDate = localDate;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.name = name;
            car.vMax = vMax;
            car.leatherElements = leatherElements;
            car.productionDate = productionDate;
            //...

            return car;
        }
    }
}
