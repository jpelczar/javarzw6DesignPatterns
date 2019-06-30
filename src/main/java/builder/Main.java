package builder;

public class Main {

    public static void main(String[] args) {
        Building.Builder builder = new Building.Builder();
        Building b1 = builder.withElevator().build();
        Building b2 = builder.withFloorCount(13).build();
        Building b3 = builder.withFloorCount(17)
                .withWindowCount(16).build();

        System.out.println();
    }
}
