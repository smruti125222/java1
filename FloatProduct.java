import java.util.Scanner;
public class FloatProduct {
	public static void main(String[] args)
	{
		float f1 , f2, mul;
		Scanner s = new Scanner(System.in);
		
		System.out.println("\nEnter 1st float number: ");
		f1 = s.nextFloat();
		s.nextLine();
		System.out.println("\nEnter 2nd float number: ");
		f2 = s.nextFloat();
		mul= f1*f2;
		System.out.println("\nThe product of "+f1 + "and " + f2 + " is "+ mul); 
		s.close();
	}
}