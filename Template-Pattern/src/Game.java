// Abstract class representing the template
abstract class Game {
    // Abstract methods to be implemented by concrete subclasses
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // Template method that outlines the steps to be executed
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
