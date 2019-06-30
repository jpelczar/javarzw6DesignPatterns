package template;

public class Main {

    public static void main(String[] args) {
        AbstractDraw draw = new SquareDraw(10);
        draw.draw();
    }

}
