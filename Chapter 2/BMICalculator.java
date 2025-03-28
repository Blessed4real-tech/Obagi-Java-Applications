//2.33 Body Mass Index Calculator

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();
        
        System.out.print("Enter height in inches: ");
        int height = input.nextInt();
        
        int bmi = (weight * 703) / (height * height); // Integer division
        
        System.out.printf("Your BMI is %d%n", bmi);
        System.out.println("BMI Categories:");
        System.out.println("Underweight = <18.5");
        System.out.println("Normal weight = 18.5–24.9");
        System.out.println("Overweight = 25–29.9");
        System.out.println("Obesity = BMI of 30 or greater");
    }
}