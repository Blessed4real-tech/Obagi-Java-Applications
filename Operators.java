public class Operators {
	public static void main(String[] args){
		//	Assignment Operator(=)
	
		int num1 = 13;
		int num2 = 5;
		
		//Arithmetic Operator(+,*,-,/,%)
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int difference = num1 - num2;
		
		double qoutient = (double)num1/num2;

		int modulos = num1%num2;
		
		//Relational Operators(>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2; 
		boolean isGreatThan = num1 > num2; 
		boolean isGreatThanorEqualTo = num1 >= num2;
		boolean isLessThanorEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean isNotEqualTo = num1 != num2;
		
		//Logical Operators (&&, ||, !)
		boolean isAndOperator = num1 > num1 && num1 >= num2;
		boolean isOrOperator = num1 == num1 || num1 >= num2;
		boolean isNotOperator = !(num1 == num2 || num1 >= num2);
		
		
		System.out.printf("The sum of the numbers is: %d%n", sum);
		System.out.printf("The product of the numbers is: %d%n", product);
		System.out.printf("The difference between %d and %d is: %d%n", num1,num2,difference);
		System.out.printf("The qoutient between num1 and num2 is: %f%n", qoutient);
		System.out.printf("The reminder between num1 and num2 is: %d%n",modulos);
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.printf("Is %d < %d? %b%n ",num1,num2, isLessThan);
		System.out.printf("Is %d > %d? %b%n ",num1,num2, isGreatThan);
		System.out.printf("Is %d >= %d? %b%n ",num1,num2, isGreatThanorEqualTo);
		System.out.printf("Is %d <= %d? %b%n ",num1,num2, isLessThanorEqualTo);
		System.out.printf("Is %d == %d? %b%n ",num1,num2, isEqualTo);
		System.out.printf("Is %d != %d? %b%n ",num1,num2, isNotEqualTo);
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.printf("Is %d > %d && %d >= %d? %b%n ",num1,num2,num1,num2, isAndOperator);
		System.out.printf("Is %d > %d || %d >= %d? %b%n ",num1,num2,num1,num2, isOrOperator);
		System.out.printf("Is !(%d > %d || %d >= %d? %b)%n ",num1,num2,num1,num2, isNotOperator);
	}
}