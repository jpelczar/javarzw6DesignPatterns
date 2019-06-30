package observer;

public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        OnClickListener listener =
                new OnClickListener() {
                    @Override
                    public void onClick() {
                        System.out.println("OnClick!");
                    }
                };

        button.setListener(listener);
        button.click();
        button.removeListener();
        button.click();


        for (int h = 0; h < 4; h++) {
            for (int w = 0; w < 4; w++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

}
