import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Iterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("*************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*************");

        list.forEach(s -> System.out.println(s));
        System.out.println("*************");
        list.stream().forEach(System.out::println);

        System.out.println("*************");
        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("A".equals(item))
                iterator.remove();
            System.out.println(item);
        }
        System.out.println("*************");

        list.removeIf(s -> "A".equals(s) || "D".equals(s));

        list.forEach(System.out::println);
    }

}
