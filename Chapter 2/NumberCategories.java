//2.32 Negative, Positive and Zero Values

import java.util.Scanner;

public class NumberCategories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int negatives = 0, positives = 0, zeros = 0;
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        if (num1 < 0) negatives++;
        else if (num1 > 0) positives++;
        else zeros++;
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        if (num2 < 0) negatives++;
        else if (num2 > 0) positives++;
        else zeros++;
        
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        if (num3 < 0) negatives++;
        else if (num3 > 0) positives++;
        else zeros++;
        
        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();
        if (num4 < 0) negatives++;
        else if (num4 > 0) positives++;
        else zeros++;
        
        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();
        if (num5 < 0) negatives++;
        else if (num5 > 0) positives++;
        else zeros++;
        
        System.out.printf("Negatives: %d%n", negatives);
        System.out.printf("Positives: %d%n", positives);
        System.out.printf("Zeros: %d%n", zeros);
    }
}