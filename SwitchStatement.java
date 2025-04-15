import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("131 To subcribe Data");
		System.out.println("310 To Check Balance Data");
		System.out.println("303 To Borrow Data");
		
		System.out.print("Enter USSD code: ");
		String option = input.nextLine();
		
		switch(option){
			case "*131#":
			{	
				System.out.println("");
				System.out.println("Enter 1 for 1 Month plan ");
				System.out.println("Enter 2 for 2 Month plan ");
				System.out.println("Enter 3 for 3 Month plan ");
				System.out.println("Enter 4 for 4 Month plan ");
				
				System.out.print("Enter USSD code: ");
				int code = input.nextInt();
				
				switch(code){
					case 1:
					{
						System.out.println("Your 1 month subcription has been activated");
					}
					break;
					
					case 2:
					{
						System.out.println("Your 2 month subcription has been activated");
					}
					break;
					
					case 3:
					{
						System.out.println("Your 3 month subcription has been activated");
					}
					break;
					
					case 4:
					{
						System.out.println("Your 4 month subcription has been activated");
					}
					break;
					default:
					system.out.println("Invalid input");
				}	
			}
			break;
			
			case "*310#":
			{
				System.out.println("Your balance is #3,000");
			}
			break;
			
			default:
			System.out.println("Invalid input");
			
			case "*303#":
			{
				System.out.println("");
				System.out.println("Enter 1 TO borrow 1000");
				System.out.println("Enter 2 TO 2 borrow 2000 ");
				System.out.println("Enter 3 TO 3 borrow 4500 ");
				System.out.println("Enter 4 TO 4 borrow 3200 ");
				
				System.out.print("Enter USSD code: ");
				int code = input.nextInt();
				
				switch(code){
					case 1:
					{
						System.out.println("Your Account has been credited with 1000");
					}
					break;
					
					case 2:
					{
						System.out.println("Your Account has been credited with 2000");
					}
					break;
					
					case 3:
					{
						System.out.println("Your Account has been credited with 4500");
					}
					break;
					
					case 4:
					{
						System.out.println("Your Account has been credited with 3200");
					}
					break;
					default:
					System.out.println("Invalid input");
				}
				
			}
			break;
			
			default:
			System.out.println("Invalid input");
			
		}	
	}
}	