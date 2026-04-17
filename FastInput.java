import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FastInput {
     public static void main(String [] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        isr.close();
        br.close();

     }
}