import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a geometric shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();
        double area = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle(cm): ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle(cm): ");
                double width = scanner.nextDouble();
                area = length * width;
                break;
            case 2:
                System.out.print("Enter the side length of the square(cm): ");
                double sideLength = scanner.nextDouble();
                area = sideLength * sideLength;
                break;
            case 3:
                System.out.print("Enter the base length of the triangle(cm): ");
                double baseLength = scanner.nextDouble();
                System.out.print("Enter the height of the triangle(cm): ");
                double height = scanner.nextDouble();
                area = 0.5 * baseLength * height;
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid geometric shape.");
        }

        System.out.println("The area of the selected geometric shape is: " + area + " (cm2) ");
    }
}
