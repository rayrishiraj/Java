package Abstraction;

public class PaypalPayment extends Payment {

    public PaypalPayment(double amount, long transactionId) {
        super(amount, transactionId);
    }

    @Override
    public double processPayment() {
        double processingFee = 0.03 * getAmount();  
        return getAmount() - processingFee;
    }
}
