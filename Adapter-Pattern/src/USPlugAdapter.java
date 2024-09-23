// Adapter class that implements the target interface for USPlug
class USPlugAdapter implements EuropeanPlug {
    private USPlug usPlug;

    USPlugAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    @Override
    public void power() {
        usPlug.plugIn();
    }
}
