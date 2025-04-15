//Find the Smallest Value

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int count = input.nextInt();
        
        System.out.print("Enter first value: ");
        int smallest = input.nextInt();

        for (int i = 1; i < count; i++) {
            System.out.print("Enter next value: ");
            int value = input.nextInt();
            if (value < smallest) smallest = value;
        }

        System.out.println("Smallest value: " + smallest);
        input.close();
    }
}