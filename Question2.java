import java.util.Scanner;
/*Soru2:
Switch-case kullanmadan gerekiyorsa if kullan
Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10 , tutar 1000 TL'den buyuk ise KDV oranini %22 olarak KDV tutari hesaplayan programi yaziniz.*/
public class Question2 {
    public static void main(String[] args){
        System.out.println("Please enter an amount and then press enter.");
        Scanner scan =new Scanner(System.in);
        double inputValue =scan.nextDouble();
        if(inputValue<0){
            System.out.println();
        }else if(inputValue <=1000){
            double withTaxPrice =inputValue*0.1 + inputValue;
            double taxPrice =inputValue*0.1;
            System.out.println("Tax rate = 10%");
            System.out.println("withTaxPrice = " + withTaxPrice);
            System.out.println("taxPrice = " + taxPrice);
        }else if(inputValue > 1000){
            double withTaxPrice =inputValue*0.22 + inputValue;
            double withoutTaxPrice =inputValue*0.22;
            System.out.println("Tax rate = 22%");
            System.out.println("withTaxPrice = " + withTaxPrice);
            System.out.println("taxPrice = " + withoutTaxPrice);
        }

        scan.close();
    }
}
