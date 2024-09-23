// Concrete observer class
class NewsSubscriber implements Observer {
    private String name;

    // Constructor to initialize the name
    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received news update: " + message);
    }
}
