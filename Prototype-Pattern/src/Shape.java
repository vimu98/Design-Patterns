// Abstract class Shape implementing Cloneable
abstract class Shape implements Cloneable {
    String type;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
