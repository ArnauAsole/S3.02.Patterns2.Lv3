package store;

import gateway.PaymentGateway;
import payment.PaymentMethod;

public class ShoeStore {
    private PaymentGateway gateway = new PaymentGateway();

    public void checkout(double price, PaymentMethod paymentMethod) {
        System.out.println("Customer is checking out shoes worth " + price + "€");
        gateway.processPayment(price, paymentMethod);
    }
}