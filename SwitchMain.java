import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dataBalance = "10gb";

        System.out.println("312 To Load Data");
        System.out.println("310 To Check Balance Data");
        System.out.println("*131 USS Borrow Data");

        String option = input.nextLine().trim(); // Read the USSD code and trim whitespace

        switch (option) {
            case "312":
                System.out.println("Enter 1 for 1 Month plan");
                System.out.println("Enter 2 for 2 Month plan");
                System.out.println("Enter 3 for 3 Month plan");

                int choice = input.nextInt(); // Read the plan choice as an integer
                input.nextLine(); // Consume the leftover newline

                switch (choice) { // Use a switch statement for the plan choice
                    case 1:
                        System.out.println("You've subscribed for 1 month plan");
                        break;
                    case 2:
                        System.out.println("Your subscription for 2 month plan was successful");
                        break;
                    case 3:
                        System.out.println("Your subscription for 3 month plan was successful");
                        break;
                    default:
                        System.out.println("ERROR please restart");
                        break;
                }
                break;

            case "310":
                System.out.println("Your data balance is " + dataBalance);
                break;

            default:
                System.out.println("Invalid option, please try again.");
                break;
        }
    }
}