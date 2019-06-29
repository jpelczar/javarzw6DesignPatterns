package factory.pizzapasta;

public class Main {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory factory =
                factoryProducer.getFactory("sicilian");
        Pasta pasta = factory.orderPasta("carbonara");

        System.out.println();
    }
}
