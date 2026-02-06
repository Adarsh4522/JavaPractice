import java.util.Scanner;
public class Lowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("write three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b && a < c) {
            System.out.println("lowest number is: " + a);
        }
        else if(b < a && b < c) {
            System.out.println("lowest number is: " + b);
        }
        else if(c < a && c < b) {
            System.out.println("lowest number is: " + c);
        }
        else {
            System.out.println("The nuber is not found");
        }

     sc.close();

    }
}
