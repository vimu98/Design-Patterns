import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Repository class that implements Iterable
class NameRepository implements Iterable<String> {
    private List<String> names = new ArrayList<>();

    // Method to add a name to the repository
    public void addName(String name) {
        names.add(name);
    }

    // Method to get an iterator over the names
    @Override
    public Iterator<String> iterator() {
        return names.iterator();
    }
}
