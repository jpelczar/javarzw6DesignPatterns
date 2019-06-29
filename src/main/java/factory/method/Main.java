package factory.method;

public class Main {

    public static void main(String[] args) {
        Lego longLego = new LongLegoFactory().createLego("red");
        Lego shortLego = new ShortLegoFactory().createLego("blue");

        System.out.println();
    }

}
