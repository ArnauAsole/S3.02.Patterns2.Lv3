package payment;

public class BankDebitPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + "€ via Bank Account Debit.");
    }
}