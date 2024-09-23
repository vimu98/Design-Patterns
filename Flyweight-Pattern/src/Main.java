public class Main {
    public static void main(String[] args) {
        Circle redCircle = (Circle) ShapeFactory.getCircle("Red");
        redCircle.setX(10);
        redCircle.setY(20);
        redCircle.setRadius(30);
        redCircle.draw();

        Circle redCircle2 = (Circle) ShapeFactory.getCircle("Red");
        redCircle2.setX(15);
        redCircle2.setY(25);
        redCircle2.setRadius(35);
        redCircle2.draw();
    }
}
