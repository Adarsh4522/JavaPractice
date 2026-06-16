import java.util.Scanner;

public class lec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int [] arr = new int[50];

        for(int i = 0; i < n; i++){
            arr[i] = arr[i+1] ;
        }

        System.out.println("enter the value");
        int value = sc.nextInt();

        System.out.println("enter the index");
        int index = sc.nextInt();

        for(int i = n-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }

        arr[index] = value;
        n++;

        System.out.println("updated array   ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

 sc.close();
    }
}
