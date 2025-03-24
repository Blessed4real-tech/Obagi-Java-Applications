//2.34 World Population Growth Calculator

import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // As of March 24, 2025, approximate values (based on web data up to 2023)
        System.out.print("Enter current world population (e.g., 8000000000): ");
        long currentPopulation = input.nextLong();
        
        System.out.print("Enter annual growth rate (e.g., 0.009 for 0.9%): ");
        double growthRate = input.nextDouble();
        
        System.out.printf("Year 1: %d%n", (long)(currentPopulation * (1 + growthRate)));
        System.out.printf("Year 2: %d%n", (long)(currentPopulation * Math.pow(1 + growthRate, 2)));
        System.out.printf("Year 3: %d%n", (long)(currentPopulation * Math.pow(1 + growthRate, 3)));
        System.out.printf("Year 4: %d%n", (long)(currentPopulation * Math.pow(1 + growthRate, 4)));
        System.out.printf("Year 5: %d%n", (long)(currentPopulation * Math.pow(1 + growthRate, 5)));
    }
}