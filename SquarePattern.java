//Square Star Pattern

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next row
        }

        scanner.close();
    }
}
