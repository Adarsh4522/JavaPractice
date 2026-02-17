import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();
            int end = sc.nextInt();

        for(int i = start; i<= end; i++) {
            if(i <= 1) continue;

            boolean isPrime = true;
            
            //check for factors 
            
            for(int j = 2; j*j <= i; j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(i+ " ");
            }
        }
        sc.close();

        }
    }

