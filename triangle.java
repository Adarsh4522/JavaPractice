import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c) {
            System.out.println("The triangle is equilateral");
        }
        else if(a == b || b == c || a == c) {
            System.out.println("The triangle is isosceles");
        }

        else {
            System.out.println("The triangle is scalene");
        }

        int x = a, y = b, z = c;
        if(x>y && z >= z) {
            int temp = x;
            x = z;
             z = temp;
        } else if(y >= z && y >= z) {
            int temp = y;
            y = z;
            z = temp;
        }

        if(z*z == x*x + y*y) {
            System.out.println("The triangle is also right-angled");
        }

        sc.close();
    }
    
}
