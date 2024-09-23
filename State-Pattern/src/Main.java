public class Main {
    public static void main(String[] args) {
        // Create a context and set an initial state
        Context context = new Context();
        context.setState(new StartState());

        // Perform actions and transition states
        context.performAction();
        System.out.println(context.getState().toString());

        context.setState(new StopState());
        context.performAction();
        System.out.println(context.getState().toString());

        context.setState(new PauseState());
        context.performAction();
        System.out.println(context.getState().toString());
    }
}