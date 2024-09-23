// Adapter class that implements the target interface for UKPlug
class UKPlugAdapter implements EuropeanPlug {
    private UKPlug ukPlug;

    UKPlugAdapter(UKPlug ukPlug) {
        this.ukPlug = ukPlug;
    }

    @Override
    public void power() {
        ukPlug.plugInUK();
    }
}
