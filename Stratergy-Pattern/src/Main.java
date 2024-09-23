public class Main {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Set and use different payment strategies
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);

        cart.setPaymentStrategy(new BankTransferPayment());
        cart.checkout(300);
    }
}