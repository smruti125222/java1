//Mirror Lower Star Triangle Pattern

import java.util.Scanner;

public class MirrorLowerTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        
        for (int i = n; i >= 1; i--) {
            
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }

        scanner.close();
    }
}
