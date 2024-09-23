// Concrete strategy class for Bank Transfer payment
class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bank Transfer");
    }
}
