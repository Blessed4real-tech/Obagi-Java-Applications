import java.util.Scanner;

public class BankingApp{
	String accountName = "James williams";
	String accountNumber = "506482374";
	double accountBalance = 506482.374;
	
	
	public double deposit(int amount){
		
		
		return accountBalance;
	}
	
	public int withdrawal(int amount){
		accountBalance -= amount;
		if (amount > accountBalance){
			System.out.printf("Insuficient funds");
		}
		else{
		accountBalance -= amount;
		}
		accountBalance += amount;
		
		return accountBalance;
		
	}
	public double checkBalance(){
		return accountBalance;
	}

	public static void main(String[] args){
		BankingApp bankApp = new BankingApp();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to UBA");
		System.out.println("Enter 1 To Deposit");
		System.out.println("Enter 2 To withdraw");
		System.out.println("Enter 3 To Check Balance");
		System.out.println();
		System.out.println("===========================");
		
		System.out.print("Enter your choice");
		int choice = input.nextInt();
		
		System.out.println();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the amount to deposit: ");
				int deposoitAmount = input.nextInt();
				
			
				System.out.println("===========================");
				
				System.out.println("Account name: " +bankApp.accountName);
				System.out.println("Account number: " +bankApp.accountNumber);
				System.out.println("Initial balance: %c%f%n ",'$',bankApp.accountBalance);
				
				bankApp.deposit(depositAmount);
				System.out.printf("Your balance is %c%f%n",'$',bankApp.checkBalance());
				System.out.println("=============================");
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the amount to deposit: ");
				int deposoitAmount = input.nextInt();
				
				
				System.out.println("===========================");
				
				System.out.println("Account name: " +bankApp.accountName);
				System.out.println("Account number: " +bankApp.accountNumber);
				System.out.printf("Initial balance: %c%f%n ",'$',bankApp.accountBalance);
				
				bankApp.deposit(withdrawalAmount);
				System.out.printf("Your balance is %c%.2f%n",'$',bankApp.checkBalance());
				System.out.println("================================");
			}
			break;
			
			case 3:
			{
			}
			break;
			
		}
	}
}
