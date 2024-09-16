package assignment3_sandipSir;

import java.util.Scanner;

public class TollBoothRevenueManager {

    
    private double carRate;
    private double truckRate;
    private double motorcycleRate;

    
    private int numCars;
    private int numTrucks;
    private int numMotorcycles;

    
    public void setTollRates() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter toll rate for Car (₹): ");
        carRate = scanner.nextDouble();

        System.out.print("Enter toll rate for Truck (₹): ");
        truckRate = scanner.nextDouble();

        System.out.print("Enter toll rate for Motorcycle (₹): ");
        motorcycleRate = scanner.nextDouble();
    }

    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Cars: ");
        numCars = scanner.nextInt();

        System.out.print("Enter the number of Trucks: ");
        numTrucks = scanner.nextInt();

        System.out.print("Enter the number of Motorcycles: ");
        numMotorcycles = scanner.nextInt();
    }

    
    public double calculateRevenue() {
        double totalRevenue = (numCars * carRate) + (numTrucks * truckRate) + (numMotorcycles * motorcycleRate);
        return totalRevenue;
    }

    
    public void printRecord() {
        double totalRevenue = calculateRevenue();
        int totalVehicles = numCars + numTrucks + numMotorcycles;

        System.out.printf("Total Number of Vehicles: %d%n", totalVehicles);
        System.out.printf("Total Revenue Collected: ₹%.2f%n", totalRevenue);
    }

  
    public static void main(String[] args) {
        TollBoothRevenueManager manager = new TollBoothRevenueManager();

        System.out.println("Set Toll Rates:");
        manager.setTollRates();

        System.out.println("Enter Number of Vehicles:");
        manager.acceptRecord();

        System.out.println("Toll Booth Report:");
        manager.printRecord();
    }
}