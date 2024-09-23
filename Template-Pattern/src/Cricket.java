// Concrete subclass implementing the abstract methods for Cricket
class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished");
    }
}
