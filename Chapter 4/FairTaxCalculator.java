//Tax Plan Alternatives; The “FairTax”

import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] categories = {"housing", "food", "clothing", "transportation", "education", "health care", "vacations"};
        double totalExpenses = 0;

        for (String category : categories) {
            System.out.printf("Enter %s expenses: ", category);
            totalExpenses += input.nextDouble();
        }

        double fairTax = totalExpenses * 0.23 / (1 - 0.23); // 23% inclusive = ~30% exclusive
        System.out.printf("Estimated FairTax (23%% inclusive): $%.2f%n", fairTax);
        input.close();
    }
}