import java.util.Scanner;
public class RoundOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                long rounded = Math.round(number);
                System.out.println("Rounded to the nearest whole number: "+rounded);
                break;

            case 2:
                System.out.printf("Rounded to one decimal place: %.1f",number);
                break;

            case 3:
                System.out.printf("Rounded to two decimal places: %.2f",number);
                break;
            
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
