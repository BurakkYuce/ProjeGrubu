import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
            if(x<=0){
            double resultx1= x*x+0.0;
            System.out.println("f("+x+") = "+resultx1);}
            else if (
            x>0&&x<10){double resultx2= 2*x+1.0;
            System.out.println("f("+x+") = "+resultx2);}
            else{
            double resultx3=x*x*x-x+0.0;
            System.out.println("f("+x+") = "+resultx3);}

    }
}