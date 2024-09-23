import java.util.ArrayList;
import java.util.List;

// Caretaker class
class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    // Method to save a memento
    public void saveMemento(Memento memento) {
        mementos.add(memento);
    }

    // Method to get the saved memento at a specific index
    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
