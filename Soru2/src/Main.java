
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          System.out.println("Input:");
                Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

    boolean nbool = (n.length() == 5);
    if (nbool) {
        if (n.charAt(0) == n.charAt(4) && n.charAt(1) == n.charAt(3)) {
            int nint = Integer.parseInt(n);
            System.out.println("Converted integer: " + nint); }
        else {
            System.out.println("The characters do not match the required conditions.");
        }
    } else {
        System.out.println("Input length is not 5.");
    }
    //SOLUTİON 2:
 System.out.println("input: ");
    int n1=sc.nextInt();
        if (n1 >= 10000 && n1 <= 99999) {
           int firstdigit=n1%10;    int seconddigit=(n1/10)%10; int thirddigit=(n1/100)%10; int fourthdigit=(n1/1000)%10;   int fifthdigit=(n1/10000)%10;
            if (firstdigit==fifthdigit && seconddigit==fourthdigit ){
                System.out.println("The number is palindrome.");}else {System.out.println("The number is not palindrome.");}
            }else {
            System.out.println("The number is not palindrome.");
        }
        }


        }



