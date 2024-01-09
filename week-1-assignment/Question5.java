import java.util.Scanner;
/*Soru5:
if kullan
Kullanicidan bir sayi girmesini isteyen ve girilen sayinin tek mi yoksa cift mi oldugunu belirleyen bir Java programini yazin.*/

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is odd.");
        }
    }

}
