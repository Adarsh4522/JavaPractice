import java.util.Scanner;

public class prime1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 20
        
        for(int i = 0; i <=n; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
