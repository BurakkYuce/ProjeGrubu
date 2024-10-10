import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("input: ");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(100<=n&&n<=999){
                int ones = n%10;
                int tens = (n/10)%10;
                int hundreds = (n/100)%10;
                int largest=(Math.max(ones,Math.max(tens,hundreds)));
                int smallest=(Math.min(ones,Math.max(tens,hundreds)));
                int middle= ones+tens+hundreds-largest-smallest;
                System.out.println("Digits sorted from largest to smallest: "+largest+" "+middle+" "+smallest);

            }
    }
}