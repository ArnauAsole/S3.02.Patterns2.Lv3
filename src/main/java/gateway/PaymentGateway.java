package gateway;

import payment.PaymentMethod;

public class PaymentGateway {
    public void processPayment(double amount, PaymentMethod paymentMethod) {
        System.out.println("Processing payment through secure gateway...");
        paymentMethod.pay(amount);
        System.out.println("Payment processed successfully.\n");
    }
}