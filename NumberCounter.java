import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(int i = 1;  i <= 10; i++){
			System.out.printf("Enter an integer: ");
			int num = input.nextInt();
			
			if (num > = 0){
				positive++;
			}
			else if (num < 0){
				negative++;
			}
			else{
				Zero++;
			}
		}
		System.out.printf("The number of positive integer is %d%n",positive);
		System.out.printf("The number of negative integer is %d%n",negative);
		System.out.printf("The number of zero integer is %d%n",zero);
	}
}