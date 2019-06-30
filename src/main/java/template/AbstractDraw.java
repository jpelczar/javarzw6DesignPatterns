package template;

public abstract class AbstractDraw {

    abstract int getWidth();

    abstract int getHeight();

    public void draw() {
        for (int h = 0; h < getHeight(); h++) {
            for (int w = 0; w < getWidth(); w++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
