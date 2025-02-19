//Reverse Pyramid Star Pattern
import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	System.out.println("Enter number of rows : ");
	int n = s.nextInt();
	s.close();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
