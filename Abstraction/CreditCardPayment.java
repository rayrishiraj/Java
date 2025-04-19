package Abstraction;


public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount, long transactionId) {
        super(amount, transactionId);
    }

    @Override
    public double processPayment() {
        double processingFee = 0.02 * getAmount(); 
        return getAmount() - processingFee;
    }
}
