//Downward Triangle Star Pattern

import java.util.Scanner;
public class DownwardTrianglePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	System.out.println("Enter number of rows : ");
	int n = s.nextInt();
	s.close();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
