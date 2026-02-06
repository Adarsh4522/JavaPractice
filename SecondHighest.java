import java.util.Scanner;
public class SecondHighest {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Write three numbers to find second highest number: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a < c) {
            System.out.println("Second highest number is: " + a);
        }

        else if(a < b && a > c) {
            System.out.println("Second highest number is: "+ a);
        }

        else if(b > a && b < c) {
            System.out.println("Second highest no. is: "+ b);
        }

        else if(b < a && b > c) {
            System.out.println("Second highest number is: "+ b);
        }

        else if(c > a && c < b) {
            System.out.println("Second highest number is: "+ c);
        }
        else if(c < a && c > b) {
            System.out.println("Second highest number is: " + c);
        }

        else {
            System.out.println("Number is not found");
        }

    sc.close();
   
    }
}
