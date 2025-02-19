import java.util.Scanner;
public class RectanglePerimeter {
    // Method to calculate Perimeter
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of the Rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter Width of the Rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = calculatePerimeter(length, width);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
	scanner.close();
    }
}
