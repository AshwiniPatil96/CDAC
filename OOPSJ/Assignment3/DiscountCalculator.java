package assignment3_sandipSir;

import java.util.Scanner;

public class DiscountCalculator {

    private double originalPrice;
    private double discountRate;

 
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the item (₹): ");
        originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountRate = scanner.nextDouble();
    }

   
    public double[] calculateDiscount() {
        double discountAmount = originalPrice * (discountRate / 100);
        double finalPrice = originalPrice - discountAmount;
        return new double[] { discountAmount, finalPrice };
    }

  
    public void printRecord() {
        double[] results = calculateDiscount();
        double discountAmount = results[0];
        double finalPrice = results[1];

        System.out.printf("Discount Amount: ₹%.2f%n", discountAmount);
        System.out.printf("Final Price: ₹%.2f%n", finalPrice);
    }
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        calculator.acceptRecord();
        calculator.printRecord();
    }
}
