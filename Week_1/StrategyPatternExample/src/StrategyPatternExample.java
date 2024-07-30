public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "SNJP");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(1000);

        
        PaymentStrategy payPalPayment = new PayPalPayment("akasnjp@gmail.com");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(2000);
    }
}
