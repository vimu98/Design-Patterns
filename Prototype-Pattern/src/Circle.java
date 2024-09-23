// Concrete class Circle extending Shape
class Circle extends Shape {
    Circle() {
        type = "Circle";
    }

    // Override clone to ensure type safety
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Static method to clone a Circle
    public static Circle cloneCircle(Circle circle) throws CloneNotSupportedException {
        return (Circle) circle.clone();
    }
}
