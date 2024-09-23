public class Main {
    public static void main(String[] args) {
        // Create a computer
        Computer computer = new Computer();

        // start the computer using the facade
        computer.start();

        // Shut down the computer using the facade
        computer.shutDown();
    }
}