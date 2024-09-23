// Context class
class Context {
    private State state;

    // Constructor to initialize the context with an initial state
    public Context() {
        this.state = null; // Initialize with null, but ideally set an initial state
    }

    // Method to set the state
    public void setState(State state) {
        this.state = state;
    }

    // Method to get the current state
    public State getState() {
        return state;
    }

    // Method to perform the action based on the current state
    public void performAction() {
        if (state != null) {
            state.doAction(this);
        } else {
            System.out.println("No state set");
        }
    }
}
