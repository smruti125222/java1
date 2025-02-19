//Spiral Pattern of Numbers

import java.util.Scanner;

public class NumberSpiralPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the matrix: ");
        int n = scanner.nextInt();

        
        int[][] matrix = new int[n][n];

        int num = 1; // Start number
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        
        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            
	   top++; // Move the top boundary down

            
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // Move the right boundary left

            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--; // Move the bottom boundary up
            }

           
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++; // Move the left boundary right
            }
        }

        System.out.println("Spiral Pattern of Numbers:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
