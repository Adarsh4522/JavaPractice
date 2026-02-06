import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;

        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {

                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime);

    }
}
