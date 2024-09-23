public class Main {
    public static void main(String[] args) {
        // Create a composite graphic
        CompositeGraphic graphic = new CompositeGraphic();

        // Add multiple graphics to the composite
        graphic.add(new Circle());
        graphic.add(new Rectangle());
        graphic.add(new Circle());

        // Draw the composite graphic
        graphic.draw();

        // Remove one circle from the composite
        graphic.remove(new Circle());

        graphic.draw();

        // Clear all graphics from the composite
        graphic.clear();

        // Attempt to draw the composite after clearing
        graphic.draw();
    }
}