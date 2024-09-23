public class Main {
    public static void main(String[] args) {
        // Create a name repository
        NameRepository repo = new NameRepository();

        // Add names to the repository
        repo.addName("Alice");
        repo.addName("Bob");
        repo.addName("Charlie");

        // Iterate over the names using the foreach loop
        for (String name : repo) {
            System.out.println("Name: " + name);
        }
    }
}