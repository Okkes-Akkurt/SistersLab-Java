import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        //90-100 arası AA, 80-89 arasi BA, 70-79 arasi BB, 60-69 arasi CB, 50-59 arasi CC, 0-50

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the course score end press enter");
        int score=scan.nextInt();

        if(score >=90){
            System.out.println("Your letter grade AA");
        }else if(score >=80) {
            System.out.println("Your letter grade BA");
        }else if(score >=70){
            System.out.println("Your letter grade BB");
        }else if(score >=60) {
            System.out.println("Your letter grade CB");
        }else if(score >=50) {
            System.out.println("Your letter grade CC");
        } else {
            System.out.println("Your letter grade FF");

        }


        scan.close();


    }


}
