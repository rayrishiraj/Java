package Abstraction;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PaymentDriver {

    public static void main(String[] args) {
    	System.out.println("-----Payment Gateway System-----");
        System.out.print("\nEnter sales amount: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.print("\nChoose Payment Mode\n 1. Credit Card\n 2. PayPal\n Enter Option: ");
        int option = sc.nextInt();
        System.out.println();
        long transactionid = ThreadLocalRandom.current().nextLong(10000000L, 100000000L);
        if(amount > 500) {
        	double temp = amount;
            amount = amount - (amount * 10.0 / 100); 
            System.out.println("Discount applied:" + (temp - amount));
            System.out.println();
        } else {
            System.out.println("No discount applied.");
            System.out.println();
        }
        
        switch (option) {
            case 1:
                Payment creditCardPayment = new CreditCardPayment(amount, transactionid);
                System.out.println("Processing Credit Card Payment...");
                System.out.println("Transaction ID: " + creditCardPayment.getTransactionId());
                System.out.println("Original Amount: " + amount);
                System.out.println("Discount applied: 10%");
                System.out.println("Transaction Fee: " + (0.02 * amount));  
                System.out.println("Final Payable Amount: " + creditCardPayment.processPayment());
                break;
            case 2:
                Payment paypalPayment = new PaypalPayment(amount, transactionid);
                System.out.println("Processing PayPal Payment...");
                System.out.println("Transaction ID: " + paypalPayment.getTransactionId());
                System.out.println("Original Amount: " + amount);
                System.out.println("Discount applied: 10%");
                System.out.println("Transaction Fee: " + (0.03 * amount));  
                System.out.println("Final Payable Amount: " + paypalPayment.processPayment());
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }

        sc.close();  
    }
}
