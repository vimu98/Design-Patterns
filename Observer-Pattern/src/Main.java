public class Main {
    public static void main(String[] args) {
        // Create multiple news agencies
        NewsAgency agency1 = new NewsAgency();
        NewsAgency agency2 = new NewsAgency();

        // Create observers
        Observer subscriber1 = new NewsSubscriber("Alice");
        Observer subscriber2 = new NewsSubscriber("Bob");

        // Add observers to different agencies
        agency1.addObserver(subscriber1);
        agency1.addObserver(subscriber2);
        agency2.addObserver(subscriber1);

        // Set the news and notify observers in each agency
        agency1.setNews("New Observer Pattern Example Released!");
        agency2.setNews("Another News Update!");

        // Remove an observer from one agency
        agency1.removeObserver(subscriber2);

        // Set the news again and notify remaining observers
        agency1.setNews("Update from Agency 1!");
        agency2.setNews("Update from Agency 2!");
    }
}