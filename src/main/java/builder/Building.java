package builder;

public class Building {

    private int floorCount;
    private int windowCount;
    private boolean isElevatorPresent;
    private String street;
    private String houseNo;
    private int apartmentNo;

    public static class Builder {
        private int floorCount;
        private int windowCount;
        private boolean isElevatorPresent;
        private String street;
        private String houseNo;
        private int apartmentNo;

        public Builder() {
        }

        public Builder withFloorCount(int count) {
            floorCount = count;
            return this;
        }

        public Builder withWindowCount(int count) {
            windowCount = count;
            return this;
        }

        public Builder withElevator() {
            isElevatorPresent = true;
            return this;
        }

        public Building build() {
            Building building = new Building();
            building.isElevatorPresent = isElevatorPresent;
            building.windowCount = windowCount;
            building.floorCount = floorCount;
            return building;
        }
    }
}
