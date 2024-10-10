import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //fiyat gireceğiz.
       //kullanıcıdan üyelik seviyesini öğrenceğiz.
       //ürünü saat kaçta aldığını öğreneceğiz.
       //ürünün hangi kategoriden bir ürün olduğunu öğreneceğiz.
       //ürünü hangi mevsimde öğreneceğiz.
       System.out.println("Base price: ");
       double base = input.nextDouble();
       input.nextLine();
       System.out.println("Membership level: ");
       String membershipLevel = input.nextLine();
       System.out.println("Purchase time(HH:MM): ");
       String purchaseTime = input.nextLine();
       System.out.println("Product category: ");
       String productCategory = input.nextLine();
       System.out.println("Season: ");
       String season = input.nextLine();
       switch (membershipLevel.toLowerCase()) {
          case "bronze": base = base * 0.95;break;
          case "silver": base = base * 0.90;break;
          case "gold":base = base * 0.85;break;
          case "platinum":base = base * 0.80;break;
       default: base=0;System.out.println("Invalid membership level");break;}


         String[] timeParts = purchaseTime.split(":");
       int purchaseHour = Integer.parseInt(timeParts[0]);
       if(0<purchaseHour&&purchaseHour <6) {base=base*0.9;}
       else if(12<=purchaseHour&&purchaseHour<=14) {base=base*0.95;}

       switch (productCategory.toLowerCase()) {
            case "electronics":base=base*1.02;break;
            case  "clothing": base=base*0.95;break;
            case "groceries":break;
            case "books": base=base*0.97;break;
            case "furniture": base=base*1.07;break;
            default: System.out.println("Invalid product category.");break;}


       if (season.toLowerCase().equals("spring")) {
                  if (productCategory.toLowerCase().equals("clothing") || productCategory.toLowerCase().equals("furniture")) base = base * 0.95;
              } else if (season.toLowerCase().equals("winter") && productCategory.toLowerCase().equals("electronics")) {
                  base = base * 0.90;
              }

              System.out.println("Final price: " + base);

    }}