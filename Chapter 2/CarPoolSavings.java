//2.35 Car-Pool Savings Calculator

import java.util.Scanner;

public class CarPoolSavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter total miles driven per day: ");
        int miles = input.nextInt();
        
        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();
        
        System.out.print("Enter average miles per gallon: ");
        int mpg = input.nextInt();
        
        System.out.print("Enter parking fees per day: ");
        double parkingFees = input.nextDouble();
        
        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();
        
        double fuelCost = (miles / mpg) * costPerGallon;
        double totalCost = fuelCost + parkingFees + tolls;
        
        System.out.printf("Your daily driving cost is: $%.2f%n", totalCost);
    }
}