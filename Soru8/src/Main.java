import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("exam score: ");
                int score = sc.nextInt();
                sc.nextLine();
                System.out.println("Attendance percentage: ");
                int attendance = sc.nextInt();
                sc.nextLine();
                System.out.println("Participation level(low,medium,high): ");
                String participationLevel = sc.nextLine();

                String[] scores = {"A", "B", "C", "D", "F"};
                int userscore = -1;

                if (90 <= score && score <= 100) {
                    userscore = 0;
                } else if (80 <= score && score < 90) {
                    userscore = 1;
                } else if (70 <= score && score < 80) {
                    userscore = 2;
                } else if (60 <= score && score < 70) {
                    userscore = 3;
                } else if (0 <= score && score < 60) {
                    userscore = 4;
                } else {
                    System.out.println("Error, Invalid score");
                    sc.close();
                    return;
                }

                if (attendance <= 75) {
                    userscore++;
                }

                if (participationLevel.equals("low")) {
                    userscore++;
                } else if (participationLevel.equals("high")) {
                    userscore--;
                }

                if (userscore < 0 || userscore >= scores.length) {
                    System.out.println("Error: Final score calculation is invalid.");
                } else {
                    System.out.println("Final score: " + scores[userscore]);
                }

                sc.close();
            }
}