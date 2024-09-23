// Concrete state class for PauseState
class PauseState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in pause state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Pause State";
    }
}
