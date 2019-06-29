package factory.simple;

public class Main {

    public static void main(String[] args) {
        Milk laciate1 = MilkFactory.createLaciate(3.2f);
        Milk laciate2 = MilkFactory.createLaciate(2f);

        System.out.println("");
    }

}
