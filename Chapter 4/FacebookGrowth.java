//Facebook User Base Growth

public class FacebookGrowth {
    public static void main(String[] args) {
        double users = 1_000_000_000.0; // 1 billion
        double rate = 0.04;             // 4% monthly growth
        int months1_5 = 0, months2 = 0;

        while (users < 1_500_000_000) {
            users *= (1 + rate);
            months1_5++;
        }
        System.out.println("Months to reach 1.5 billion: " + months1_5);

        while (users < 2_000_000_000) {
            users *= (1 + rate);
            months2++;
        }
        System.out.println("Months to reach 2 billion: " + (months1_5 + months2));
    }
}