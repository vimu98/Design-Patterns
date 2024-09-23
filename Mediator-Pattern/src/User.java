// Colleague class
class User {
    private String name;
    private ChatMediator mediator;

    // Constructor to initialize the user's name and mediator
    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    // Method to get the user's name
    public String getName() {
        return name;
    }

    // Method to send a message through the mediator
    public void sendMessage(String message) {
        mediator.showMessage(this, message);
    }
}
