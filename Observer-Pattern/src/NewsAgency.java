import java.util.ArrayList;
import java.util.List;

// Subject class
class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    // Method to add an observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to set the news and notify all observers
    public void setNews(String news) {
        this.news = news;
        notifyAllObservers();
    }

    // Private method to notify all observers
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
