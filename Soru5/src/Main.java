import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("R: ");
        int r = sc.nextInt();
        System.out.print("G: ");
        int g = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        if ((r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255)){
            if (r>g&&r>b){System.out.println("Dominant color is red");}
            else if (g>r&&g>b){System.out.println("Dominant color is green");}
            else if (b>r&&b>g){System.out.println("Dominant color is blue");}
            else if (b==g&&g==r){System.out.println("Colors are equal in intensity.");}
            else{System.out.println("No dominant color, two or more colors are equal and highest.");}
        }else{System.out.println("Invalid input");}
    }
}