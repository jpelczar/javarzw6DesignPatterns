package prototype;

import java.util.Date;

public class Main {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        User u1 = new User();
        u1.setName("A");
        u1.setCreateDate(new Date());

        System.out.println(u1.getName() + " " + u1.getCreateDate());

        User u2 = u1.clone();
        u2.setName("B");
        u2.getCreateDate().setTime(100);

        System.out.println(u2.getName() + " " + u2.getCreateDate());
        System.out.println(u1.getName() + " " + u1.getCreateDate());

    }
}
