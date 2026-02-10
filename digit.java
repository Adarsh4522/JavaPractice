import java.util.Scanner;
public class digit {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    if( n>= 10 && n <= 99) {
        int tens = n/10;
        int units = n%10;
        int sum = tens+units;

        System.out.println("Digit Sum: "+sum);

        if(sum < 10) {
            System.out.println("The sum of the digits is less than 10");
        }

        else if(sum > 10) {
            System.out.println("The sum of the digits is not less than 10 ");
        }
        else{
            System.out.println("Not a valid two-digit number");
        }

    }

    sc.close();
}
}

