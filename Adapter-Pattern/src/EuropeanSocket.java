// Concrete implementation of EuropeanPlug
class EuropeanSocket implements EuropeanPlug {
    @Override
    public void power() {
        System.out.println("European plug powered");
    }
}
