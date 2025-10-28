package ProgrammingChallenge;
import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        char choice;

    do{
        System.out.print("Enter the MONTH NUMBER. (1 for January, 2 for February, etc) : ");
        int month = input.nextInt();

        int numberOfDays = 0;
        String monthName = " ";


      switch (month) {
        case 1:
            monthName = "January";
            numberOfDays = 31;
            break;

        case 2:
            monthName = "February";
            numberOfDays = 28;
            break;
        
        case 3:
            monthName = "March";
            numberOfDays = 31;
            break;

        case 4:
            monthName = "April";
            numberOfDays = 30;
            break;
        case 5:
            monthName = "May";
            numberOfDays = 31;
            break;
      
        case 6:
            monthName = "June";
            numberOfDays = 30;
            break;

        case 7:
            monthName = "July";
            numberOfDays = 31;
            break;
      
        case 8:
            monthName = "August";
            numberOfDays = 31;
            break;
      
        case 9:
            monthName = "September";
            numberOfDays = 30;
            break;
        case 10:
            monthName = "October";
            numberOfDays = 31;
            break;
      
        case 11:
            monthName = "November";
            numberOfDays = 30;
            break;
      
        case 12:
            monthName = "December";
            numberOfDays = 31;
            break;
      

        default:
            System.out.println("Invalid Month Number.");
            input.nextLine();
            System.out.println("Do you want to try again?(Y/N): ");
            choice = input.next().charAt(0);
            System.out.println();
            continue;
            
      }
        
      
      System.out.println(monthName +" has " + numberOfDays + " days. ");
      System.out.println("Do you want to enter another month?(Y/N): ");
      choice = input.next().charAt(0);
      System.out.println();

    }while (choice == 'Y' || choice == 'y');
    System.out.println("Thank You! Program Ended.");
    input.close();
}

}
