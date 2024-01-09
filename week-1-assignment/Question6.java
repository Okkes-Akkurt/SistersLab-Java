import java.util.Scanner;

public class Question6 {
    /* Soru6: if kullan Girilen 3 sayiyi "kucukten buyuge" siralayan programi yaziniz. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + " <= " + num2 + " <= " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " <= " + num3 + " <= " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + " <= " + num1 + " <= " + num3);
        } else if (num2 <= num3 && num3 <= num1) {
            System.out.println(num2 + " <= " + num3 + " <= " + num1);
        } else if (num3 <= num1 && num1 <= num2) {
            System.out.println(num3 + " <= " + num1 + " <= " + num2);
        } else if (num3 <= num2 && num2 <= num1) {
            System.out.println(num3 + " <= " + num2 + " <= " + num1);
        }
    }
}
