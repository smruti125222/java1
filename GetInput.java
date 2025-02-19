import java.util.Scanner;

public class GetInput{
	
	public static void main(String[] args)
	{
		
		
		System.out.println("\nEnter a String: ");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		System.out.println("\nYou entered string :" + s1);
		
		System.out.println("\nEnter an integer: ");
		int n1 = s.nextInt();
		System.out.println("\nYou entered integer :" + n1);
		
		s.nextLine();

		System.out.println("\nEnter a float: ");
		float n2 = s.nextFloat();
		System.out.println("\nYou entered float :" + n2);
		
		s.close();
	}
}


		