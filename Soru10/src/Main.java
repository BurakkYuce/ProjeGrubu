import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        //kredi onayı,faiz oranları,kredi skoru,istihdam durumu, yıllık gelir,kredi miktarı,kredi amacı
        // mevcut borçlar.
        System.out.println("Credit score");
        int creditScore = input.nextInt();
        input.nextLine();
        System.out.println("Emplument status: ");
        String emplumentStatus = input.nextLine();
        System.out.println("Annual income: ");
        double annualIncome = input.nextDouble();
        input.nextLine();
        System.out.println("Loan Amount: ");
        double loanAmount = input.nextDouble();
        input.nextLine();
        System.out.println("Loan purpose: ");
        String loanPurpose = input.nextLine();
        System.out.println("Existing debts: ");
        double existingDebts = input.nextDouble();

    }
}