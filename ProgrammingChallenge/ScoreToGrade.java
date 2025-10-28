package ProgrammingChallenge;
import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        char choice;

        do{
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if (score >= 90) {
                System.out.println("Your grade is: A");
            }else if (score >= 80 && score <=89 ) {
                System.out.println("Your grade is: B");
            }else if (score >= 70 && score <= 79) {
                System.out.println("Your grade is: C");
            }else if (score >= 60 && score <= 69) {
                System.out.println("Your grade is: D");
            }else {
            System.out.println("Your grade is: F");
            }

            System.out.print("\n Do you want to enter another score(Y/N): ");
            choice = input.next().charAt(0);

            System.out.println();
        }while (choice == 'Y' || choice=='y');
        System.out.println("Thank you! Program Ended.\n");
    
        input.close();
 }
}
