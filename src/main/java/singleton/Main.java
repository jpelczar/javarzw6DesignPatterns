package singleton;

public class Main {

    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance();

        firstSingleton.setAge(18);
        firstSingleton.setName("ALA");

        System.out.println(firstSingleton.getAge() + " " +
                firstSingleton.getName());

        Singleton secondSingleton = Singleton.getInstance();
        firstSingleton.setAge(99);

        System.out.println(secondSingleton.getAge() + " " +
                secondSingleton.getName());

        System.out.println(firstSingleton.getAge() + " " +
                firstSingleton.getName());
    }

}
