import java.util.ArrayList;
import java.util.List;

// Composite component class
class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    // Method to add a graphic to the composite
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    // Method to remove a graphic from the composite
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    // Method to clear all graphics from the composite
    public void clear() {
        graphics.clear();
    }

    @Override
    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}
