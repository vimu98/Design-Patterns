// Concrete subclass implementing the abstract methods for Football
class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished");
    }
}
