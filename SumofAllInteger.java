import java.util.Scanner;


public class SumofAllInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.println("Enter integers to SUM. Enter 0 to STOP. ");

        do{
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            sum += num;

        }while (num != 0);

        System.out.println("The sum of all integer is: " + sum);

    
        scanner.close();
    }
    
    
}
