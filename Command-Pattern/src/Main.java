public class Main {
    public static void main(String[] args) {
        // Create a light
        Light light = new Light();

        // Create commands
        Command lightOn = new LightOnCommand(light);
        lightOn.execute();

        Command lightOff = new LightOffCommand(light);
        lightOff.execute();

    }
}