package assignment3_sandipSir;

import java.util.Scanner;

public class CompoundInterestCalculator {
	 private double principal;
	    private double annualInterestRate;
	    private int numberOfCompounds;
	    private int years;

	   
	    public void acceptRecord() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the initial investment amount : ");
	        principal = scanner.nextDouble();

	        System.out.print("Enter the annual interest rate : ");
	        annualInterestRate = scanner.nextDouble();

	        System.out.print("Enter the number of times the interest is compounded per year: ");
	        numberOfCompounds = scanner.nextInt();

	        System.out.print("Enter the investment duration (in years): ");
	        years = scanner.nextInt();
	    }

	    
	    public double calculateFutureValue() {
	        double ratePerPeriod = annualInterestRate / numberOfCompounds / 100;
	        int totalPeriods = numberOfCompounds * years;

	        return principal * Math.pow(1 + ratePerPeriod, totalPeriods);
	    }

	    // Method to print the results
	    public void printRecord() {
	        double futureValue = calculateFutureValue();
	        double totalInterest = futureValue - principal;

	        System.out.printf("Future Value of Investment: ", futureValue);
	        System.out.printf("Total Interest Earned: ", totalInterest);
	    }

	   
	    public static void main(String[] args) {
	        CompoundInterestCalculator calculator = new CompoundInterestCalculator();

	        calculator.acceptRecord();
	        calculator.printRecord();
	    }
}
