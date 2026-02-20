 import java.util.Arrays;
  public class ReverseTheArray {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        int arr[] = {1,2,3,4,5};

        for(int i = 0; i<arr.length/2;i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        System.out.println("" + Arrays.toString(arr));

    }
  }
