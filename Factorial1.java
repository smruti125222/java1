import java.util.Scanner;
public class Factorial1 {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n = s.nextInt();
		
		long factorial = 1;
		for(int i = 1; i<=n; i++){
			factorial *=i; 
		}
		System.out.println("The Factorial of "+ n +" is "+ factorial);
		s.close();
	}
}