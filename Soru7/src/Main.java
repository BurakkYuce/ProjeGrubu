import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("What is your annual income?");
                int defaultAnnualIncome = sc.nextInt();
                System.out.println("Marital status:\t single=1 \t Married=2 \t Head of household=3");
                int maritalStatus = sc.nextInt();
                int annualIncome = 0;

                if (0 <= defaultAnnualIncome && defaultAnnualIncome <= 10000) {annualIncome = 0;}
                else if (defaultAnnualIncome >= 10001 && defaultAnnualIncome <= 30000) {annualIncome = (defaultAnnualIncome - 10000) / 10;}
                else if (defaultAnnualIncome >= 30001 && defaultAnnualIncome <= 70000) {annualIncome = (int) ((defaultAnnualIncome - 30000) * 0.2 + 2000);}
                else if (defaultAnnualIncome > 70000) {annualIncome = (int) ((defaultAnnualIncome - 70000) * 0.3 + 10000);}
                else {System.out.println("Invalid income."); return;}

                switch (maritalStatus) {
                    case 1: break;
                    case 2: annualIncome -= 1000; break;
                    case 3: annualIncome -= 2000; break;
                    default: System.out.println("Invalid marital status."); return;}
                int calculatedTax = annualIncome;
                System.out.println("Calculated tax: $" + calculatedTax);

    }
}