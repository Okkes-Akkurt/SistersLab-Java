import java.util.Scanner;

/*Soru1:
Switch-case kullanmadan gerekiyorsa if kullan

kullanicidan alinan para degerinin KDV'li fiyatini ve KDV tutarini hesaplayip ekrana bastiran programi yazin.*/

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Please enter an amount and then press enter.");
        Scanner scan =new Scanner(System.in);
        double inputValue =scan.nextDouble();
        if(inputValue<0){
            System.out.println();
        }else{
            double withTaxPrice =inputValue*0.3 + inputValue;
            double taxPrice =inputValue*0.3;
            System.out.println("Tax rate = 30%");
            System.out.println("withTaxPrice = " + withTaxPrice);
            System.out.println("taxPrice = " + taxPrice);
        }

        scan.close();
    }
}
