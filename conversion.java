import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        double value = sc.nextDouble();

        double result;

        switch(choice) {

            case 1:
                result = value*2.54;
                System.out.printf("%.2f inches is equal to %.2f centimeters.",value,result);
                break;
            
            case 2:
                result = value * 0.453592;
                System.out.printf("%.2f pounds is equal to %.2f kilograms.",value,result);
                break;

            case 3:
                result = value*3.78541;
                System.out.printf("%.2f gallons is equal to %.2f liters.",value,result );
                break;
        }
        sc.close();
    }
}
