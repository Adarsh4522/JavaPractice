import java.util.Scanner;
public class Highest {
 public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Write three numbers: ");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    //System.out.println("Write three numbers: ");

    if(a > b && a > c) {
        System.out.println("Highest number is: " + a);
    }

    else if( b > a && b > c) {
        System.out.println("Highest number is: " + b);
    }
    else if(c > a && c > b) {
        System.out.println("Highest number is: " + c);
    }
    else {
        System.out.println("Numbere is not found");
    }
 
     sc.close();

 }
    
}
