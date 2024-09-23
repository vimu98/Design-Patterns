public class Main {
    public static void main(String[] args) {
        // Create instances of the adapttees
        USPlug usPlug = new USPlug();
        UKPlug ukPlug = new UKPlug();

        // Create adapter instances with the adapttees
        EuropeanPlug usAdapter = new USPlugAdapter(usPlug);
        EuropeanPlug ukAdapter = new UKPlugAdapter(ukPlug);

        // Use the adapters as if they were EuropeanPlugs
        usAdapter.power();
        ukAdapter.power();
    }
}