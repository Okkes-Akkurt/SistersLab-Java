import java.util.Scanner;

public class Question7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the weather code: ");
            int weatherCode = scanner.nextInt();

            String weatherCondition;

            switch (weatherCode) {
                case 1:
                    weatherCondition = "Sunny";
                    break;
                case 2:
                    weatherCondition = "Cloudy";
                    break;
                case 3:
                    weatherCondition = "Rainy";
                    break;
                case 4:
                    weatherCondition = "Snowy";
                    break;
                default:
                    weatherCondition = "Unknown";
                    break;
            }

            System.out.println("Weather condition: " + weatherCondition);
        }

}
