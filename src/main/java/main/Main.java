package main;

import payment.BankDebitPayment;
import payment.CreditCardPayment;
import payment.PayPalPayment;
import payment.PaymentMethod;
import store.ShoeStore;

public class Main {
    public static void main(String[] args) {
        ShoeStore store = new ShoeStore();

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod bankDebit = new BankDebitPayment();

        store.checkout(11.11, creditCard);
        store.checkout(99.99, paypal);
        store.checkout(1992.01, bankDebit);
    }
}