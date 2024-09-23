public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle();
        Circle clonedCircle = Circle.cloneCircle(circle);

        System.out.println("Original: " + circle.type);
        System.out.println("Clone: " + clonedCircle.type);
    }
}