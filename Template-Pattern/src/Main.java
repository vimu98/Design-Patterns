public class Main {
    public static void main(String[] args) {
        // Create instances of different games
        Game footballGame = new Football();
        Game cricketGame = new Cricket();

        // Use the template method to play each game
        footballGame.play();
        System.out.println(); // Empty line for better readability
        cricketGame.play();
    }
}