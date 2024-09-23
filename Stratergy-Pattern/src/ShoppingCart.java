// Context class
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Method to set the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to perform the checkout using the current payment strategy
    public void checkout(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment strategy set");
        }
    }
}
