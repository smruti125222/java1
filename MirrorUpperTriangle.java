//Mirror Upper Star Triangle Pattern

import java.util.Scanner;
public class MirrorUpperTriangle {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
	System.out.println("Enter number of rows : ");
	int n = s.nextInt();
	s.close();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // Print stars
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
