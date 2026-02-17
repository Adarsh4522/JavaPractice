//count even digits in integer and check the divisibility using while loop

import java.util.Scanner;
public class checkDivisibilityUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = n, count = 0;

        while(t > 0) {
            if((t % 10)/2 == 0) count++ ;
            t/= 10;
        }

        if(count == 0) System.out.print("There are no even digits in the number.");
        else if(n % count == 0) System.out.print("It is a divisor of the original number.");
        else System.out.print("It is not a divisor of the original number.");
    }
}
