import java.util.Scanner;
/*Basit Hesap Makinesi
Kullanicidan iki sayi girmesini isteyen ve ardindan bu iki sayi uzerinde toplama, cikarma, carpma ve bolme islemlerini gerceklestiren bir Java programi yazin.*/
public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double num1 = scan.nextDouble();
        System.out.println("Please enter the second number:");
        double num2 = scan.nextDouble();

        System.out.println("Please choose one of the following operations:\n +, - , * , / ");
        char operation = scan.next().charAt(0);
        double result = 0;



        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Result = " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Result = " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Result = " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
    }
}