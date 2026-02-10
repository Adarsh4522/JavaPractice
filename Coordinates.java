import java.util.Scanner;
public class Coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance1 = Math.sqrt(x1*x1 + y1*y1);
        double distance2 = Math.sqrt(x2*x2 + y2*y2);

        double Distance = Math.min(distance1,distance2);

        String orientation;
        if(x1 == x2) {
            orientation = "Vertical";
        }
        else if(y1 == y2) {
            orientation = "Horizontal";
        }
        else {
            orientation = "Oblique";
        }

        System.out.printf("Closer Distance: %.1f\n",Distance);
        System.out.println("Orientation: "+orientation);

        sc.close();


    }
    
}
