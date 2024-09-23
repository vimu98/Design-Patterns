public class Main {
    public static void main(String[] args) {
        // Create elements
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();

        // Create visitors
        ComputerPartVisitor displayVisitor = new ComputerPartDisplayVisitor();
        ComputerPartVisitor checkVisitor = new ComputerPartCheckVisitor();

        // Use the visitors to perform different operations on each element
        keyboard.accept(displayVisitor);
        monitor.accept(displayVisitor);

        keyboard.accept(checkVisitor);
        monitor.accept(checkVisitor);
    }
}