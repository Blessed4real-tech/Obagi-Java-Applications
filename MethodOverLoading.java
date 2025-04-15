public class MethodOverLoading{
	public static void main(String[] args){
		MethodOverLoading.greeting();
		MethodOverLoading.greeting("Jack");
		MethodOverLoading.greeting("Jack,");
	}
	
	public static void greating(){
		System.out.println("Good Afternoon, Everyone");
	}
	
	public static void greating(String name){
		System.out.println("Good Afternoon, %s%n", name);
	}
	
	public static void greating(String name, int age){
		System.out.printf("Good Afternoon, %s you are %d%n years old", name,age);
	}
	
	public static void greating(String name, int age, String gender){
		System.out.println("Good Afternoon, %s, you are %d years old and you are a %s%n",name,age);
	}
}

	