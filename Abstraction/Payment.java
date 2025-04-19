package Abstraction;

public abstract class Payment {
    private double amount;
    private long transactionId;

    public Payment(double amount, long transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public abstract double processPayment();
}
