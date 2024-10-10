import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit integer: ");
        int n = sc.nextInt();
        if (1000<=n&&n<=9999){
               int ones = n%10;
               int tens = (n/10)%10;
               int hundreds = (n/100)%10;
               int thousands = (n/1000)%10;
               int sumint = ones + tens + hundreds + thousands;
               int productint=ones*tens*hundreds*thousands;
            System.out.println("Sum of digits: "+sumint );
            System.out.println("Product of digits: "+productint);
               if (sumint >productint){
                   System.out.println("Sum is greater than product");
               } else if (productint >sumint) {
                   System.out.println("Product is greater than sum");
               }else {System.out.println("Sum and product are equal");}
        }else {System.out.println("Please enter a valid integer");}

    }
}