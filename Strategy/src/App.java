public class App {
    public static void main(String[] args) throws Exception {
        Payment paymentCardCredit = new PaymentCardCredit("1234567890123456", "John Doe", "01/23", "123");
        ProcessPayment processPaymentCredit = new ProcessPayment(paymentCardCredit);

        processPaymentCredit.makePayment(500.0);
    }
}
