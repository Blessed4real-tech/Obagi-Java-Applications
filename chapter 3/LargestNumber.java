//Find the Largest Number

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1, largest = 0;

        while (counter <= 10) {
            System.out.printf("Enter number %d: ", counter);
            int number = input.nextInt();
            if (counter == 1 || number > largest) {
                largest = number;
            }
            counter++;
        }
        System.out.printf("Largest number: %d%n", largest);
        input.close();
    }
}