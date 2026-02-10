import java.util.Scanner;
public class realEstate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cost = a*b;

        int category;
        if(cost <= 1000) {
            category = 1;

        }
        else if(cost <= 5000) {
            category = 2;
        }

        else{
            category = 3;
        }

        switch(category) {
            case 1:
                System.out.println("Total Cost: "+cost);
                System.out.println("Suggested Payment Method: Cash or check is recommended.");
                break;

            case 2:
                System.out.println("Total Cost: "+cost);
                System.out.println("SAuggest Payment Method: Credit Card is recommended.");
                break;

            case 3:
                System.out.println("Total Cost: "+cost);
                System.out.println("Suggested Payment Method: Bank Transfer is recommended.");
                break;

            
        }

        sc.close();
    }
}
