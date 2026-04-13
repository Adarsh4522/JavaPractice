//Food corner home delivers veg and non veg meals to its customers based on order.

import java.util.Scanner;
public class Food{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char type = sc.next().charAt(0);
        int quantity = sc.nextInt();
        int distance = sc.nextInt();

        if((type != 'V' && type != 'N') || distance <= 0|| quantity < 1) {
            System.out.println(-1);
            return;
        }

        int FoodCost;
        if(type == 'V') {
            FoodCost = 12 * quantity;
        } else {
            FoodCost = 15*quantity;
        }

        int deliveryCost = 0;

        if(distance > 3 && distance <= 6) {
            deliveryCost = (distance -3)* 1;
        }
        else if (distance > 6) {
            deliveryCost = (3*1) + (distance - 6) * 2;
        }

        int total = FoodCost + deliveryCost;

        System.out.println(total);

       }
}