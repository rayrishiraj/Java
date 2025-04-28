package CaseStudy;

public class OrderLimitExceedException extends Exception {
    public OrderLimitExceedException(String message) {
        super(message);
    }
}
